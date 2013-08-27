/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractpractice;

/**
 *
 * @author schereja
 */
public class Employee {
    int wage;
    String firstName;
    String lastName;
    
    public String name(){
        String name = firstName + lastName;
        return name;
    }
    
}
