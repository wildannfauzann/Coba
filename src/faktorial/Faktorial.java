/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

/**
 *
 * @author wildan
 */
import java.util.Scanner;

public class Faktorial {

    /**
     * @param args the command line arguments
     */
   public static int faktorial(int n){
        if (n == 0) {
           return 0;
       } else if (n == 1) {
           return 1;
       }else{
            return n*faktorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan N = ");
        n = in.nextInt();
        
        long startTime = System.nanoTime();
        System.out.println("N-Faktorial = " + faktorial(n));
        long stopTime = System.nanoTime();
    	
    	double elapsedTime = (double) (stopTime - startTime)/1000000;
    	System.out.println("Waktu eksekusi = "+elapsedTime + " * 10^-3 detik");
    }
    
}
