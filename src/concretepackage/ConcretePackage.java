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
        Employee newEmployee = new Employee();
        newEmployee.welcome();
        SalariedEmployee newSalariedEmployee = new SalariedEmployee();
        newSalariedEmployee.welcome();
        newSalariedEmployee.displaySalary();
 
        
    }  
}
