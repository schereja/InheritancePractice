/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretepackage;

/**
 *
 * @author schereja
 */
public class ConcretePackage {
    
    public static void main(String[] args) {
        HourlyEmployee he1 = new HourlyEmployee();
        he1.setFirstName("Jason");
        he1.setLastName("Scherer");
        he1.setHours(40);
        he1.setHourlyRate(15.00);
        
        System.out.println("Hello " + he1.getFirstName() + " " + he1.getLastName() + ". Your check should be: " + he1.wage());
       SalaryPlusBonusEmployee spbe1 = new SalaryPlusBonusEmployee();
       spbe1.setSalary(25000);
       spbe1.getSalary();
       spbe1.bonusAmount(spbe1.getSalary());
    }  
}
