class Solution {
    public int addDigits(int num) {
       while(num>=10){
        int Sum=0;
        int temp=num;
        while(temp>0){
        int digit=temp%10;
        Sum+=digit;
        temp/=10;
        }
        num=Sum;
       }
       return num;
    }
}