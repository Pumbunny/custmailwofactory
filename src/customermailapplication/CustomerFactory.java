/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author GP63
 */
public class CustomerFactory {

    /**
     * @param args the command line arguments
     */
    private Customer customer;
    public static Customer createCustomer(String type) {             
        switch (type) {
            case "Regular":
                return new RegularCustomer();
            case "Mountain":
                return new MountainCustomer();
            case "Delinquent":
                return new DelinquentCustomer();
            default:
                break;
        }
        return null;
    }
}
