/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anakayamamr;

import java.util.Scanner;

/**
 *
 * @author LABKOM1-RPL30
 */
public class AnakAyamAmr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       int n,m;
        System.out.print("banyak anak ayam=");
        n=sc.nextInt();
        System.out.println();
        
        for(int i=n; i>=2;i--){
        m=i-1;
         
        System.out.println("anak ayam turun"+i+",mati satu tingallah"+m);
        }
        System.out.println("anak ayam turun 1,mati saru tingallah induknya");
    }
    
}
