import java.io.*;
import java.util.*;

public class Main {
        
    public static long partitionKSubset(int n, int k) {
        
        long[][] dp = new long[k + 1][n + 1];

        for(int i = 1;i<= k;i++){
            for(int j = i;j<= n;j++){
                if(i == j){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i][j-1] * i + dp[i-1][j-1];
                }
            }
        }
        return dp[k][n];
        
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}