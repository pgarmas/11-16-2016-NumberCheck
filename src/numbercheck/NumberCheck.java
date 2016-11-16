/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbercheck;

import java.util.Scanner;

/**
 *
 * @author polina.garmas
 */
public class NumberCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="y";
        while (!s.contains("n")) {            
            System.out.println("Enter your number");
            Scanner sn = new Scanner(System.in);
            int pick = sn.nextInt();
            
            System.out.println("Enter divider");
            int divider = sn.nextInt();

            if(pick%divider==0) System.out.printf("yes, %d number can be devided by %d without any leftovers\n",pick,divider);
            else System.out.printf("no, %d number can't be devided by %d without any leftovers\n",pick,divider);
            
            System.out.print("Go again (y/n) > ");
            s = sn.next();
        }
    }
}
