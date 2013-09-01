/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractpractice;

/**
 *
 * @author schereja
 */
public class abstractPractice {
    public static void main(String[] args){
    HourlyEmployee he1 = new HourlyEmployee();
    he1.setFirstName("Jason");
    he1.setJob("Production Technician");
    he1.setHourlyRate(15.00);
    he1.pay();
        System.out.println("Hello " + he1.getFirstName() + ". You are a " + he1.getJob() + ".");
        
        
    }
}
