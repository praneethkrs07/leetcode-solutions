class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int temp=n;
        while(temp>0){
            int di=temp%10;
            sum=sum+di;
            prod=prod*di;
            temp/=10;
        }
        temp=sum+prod;
        if(n%temp==0){
            return true;
        }
        else{
            return false;
        }
    }
}