import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(numDecodings(s));
    }
    
    public static int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for(int i = 1;i<s.length();i++){
            
            if(s.charAt(i-1) == '0' && s.charAt(i) == '0'){
                dp[i] = 0;
            }else if(s.charAt(i-1) == '0' && s.charAt(i) != '0'){
                dp[i] = dp[i-1];
            }else if(s.charAt(i - 1) != '0' && s.charAt(i) == '0'){
                
                if(s.charAt(i-1) <= '2'){
                    dp[i] = i>1? dp[i-2]:1;
                }else {
                    dp[i] = 0;
                }
                
            }else{
                dp[i] = dp[i-1];
                if(Integer.parseInt(s.substring(i-1, i+1)) <= 26){
                    dp[i] += i>1?dp[i-2]:1;
                }
            }
        }
        
        return dp[s.length() - 1];
        
    }
}