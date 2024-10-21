public class MaxWealth {
    public static void main(String[] args) {
        int[][] account={
                {1,2,3},
                {4,7,3},
                {3,3,3},
        };

        System.out.println(wealth(account));

    }
    static int wealth(int[][] account){
        //person is rows
        //cash is column
        int ans=Integer.MIN_VALUE;
        for(int person=0;person< account.length;person++){
            int sum=0;
            for(int cash=0;cash<account[person].length;cash++){
                sum=sum+account[person][cash];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }

}
