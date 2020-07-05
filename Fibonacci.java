package array;

import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(getFibonacci(100));

	}

	public static String getFibonacci(int N) {
        int count=3;
        BigInteger x=new BigInteger("0");BigInteger y=new BigInteger("1") ;BigInteger z=x.add(y);
        if(N==0 || N==1){
            return N+"";
        }
        while(count<=N){
            x=y;
            y=z;
            z=x.add(y);
            count++;
        }
       return z.toString(); 
    }
		

}
