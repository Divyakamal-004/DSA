import java.util.Scanner;
import java.util.*;
public class FracKnapsack {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the no. of items: ");
        int n = inp.nextInt();
        int[] weight=new int[n];
        int[] value=new int[n];
        System.out.println("enter the weight: ");
        for(int i=0;i<weight.length;i++){
            weight[i]=inp.nextInt();
        }
        System.out.println("enter the value: ");
        for(int i=0;i<value.length;i++){
            value[i]=inp.nextInt();
        }
        System.out.print("enetr the capacity of knapsack: ");
        int cap=inp.nextInt();
        double[] fraction=new double[n];
        for(int i =0;i<fraction.length;i++){
            fraction[i]=value[i]/weight[i];
        }
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(new Item(weight[i], value[i], fraction[i]));
        }

        Collections.sort(items, (a, b) -> Double.compare(b.fraction, a.fraction));


        double totalValue = 0;
        int totalWeight = 0;
        for (Item item : items) {

            if (totalWeight + item.weight <= cap) {
                totalWeight += item.weight;
                totalValue += item.value;
            } else {

                int remainingWeight = cap - totalWeight;
                double fractionToAdd = (double) remainingWeight / item.weight;
                totalValue += item.value * fractionToAdd;
                break;
            }
        }

        System.out.println("Total value: " + totalValue);
    }

    static class Item {
        int weight;
        int value;
        double fraction;

        public Item(int weight, int value, double fraction) {
            this.weight = weight;
            this.value = value;
            this.fraction = fraction;
        }
    }
}



