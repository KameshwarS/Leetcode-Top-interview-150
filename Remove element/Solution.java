//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public int findTheWinner(int n, int k) {
        int p=ans(n,k);
        return p+1;
    }
    public static int ans(int n,int k){
        if(n==1){
            return 0;
        }
        return (ans(n-1,k)+k)%n;
    }

}