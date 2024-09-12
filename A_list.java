import java.util.ArrayList;


import java.util.Collections;

public class A_list {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add elements
        list.add(5);
        list.add(3);
        list.add(0);
        System.out.println(list);

        //get elements in array list
        int element= list.get(1);
        System.out.println(element);

        //add element in between
        list.add(2,8);
        System.out.println(list);



        //change the elemnt from the list
        list.set(1,7);
        System.out.println(list);

        //delete the elements
        list.remove(3);
        System.out.println(list);

        //know the size of the list
        int size =list.size();
        System.out.println(size);

        //loops on array list
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //sorting using collection
        Collections.sort(list);
        System.out.println(list);

    }
}
