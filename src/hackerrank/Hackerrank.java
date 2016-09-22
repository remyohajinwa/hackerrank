/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Chimere
 */
public class Hackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int scoreA = 0, scoreB = 0;
        
        if ( a0 > b0) {
            scoreA += 1;
        }else if (a0 < b0) {
            scoreB += 1;
        }else if ( b1 > a1) {
            scoreB += 1;
        }else if (a1 > b1) {
            scoreA += 1;
        }else if (a2 > b2) {
            scoreA += 1;
        }else if (b2>a2) {
            scoreB += 1;
        }else if (a1 == b1) {
            scoreA += 0;
            scoreB += 0;
        }else if (a2 == b2) {
            scoreA += 0;
            scoreB += 0;
        }else if (a0 == b0) {
            scoreB += 0;
            scoreA += 0;
        }
        System.out.print(scoreA + " " + scoreB);
    }
    
}
