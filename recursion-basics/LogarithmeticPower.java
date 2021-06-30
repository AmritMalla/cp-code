import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n){
        if(n == 0) return 1;
        int xpn2 = power(x, n/2);
        int xpn = xpn2 * xpn2;
        if(n %2  == 1){
           return xpn * x;
        }
        return xpn;
    }

}