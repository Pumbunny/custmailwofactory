/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        //CustomerMailApplication app = new CustomerMailApplication();
        CustomerFactory cusFac = new CustomerFactory();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                System.out.println(cusFac.createCustomer("Regular").createMail());
                break;
            case 2:
                System.out.println(cusFac.createCustomer("Mountain").createMail());
                break;
            case 3:
                System.out.println(cusFac.createCustomer("Delinquent").createMail());
                break;
            
        }       
    }
}
