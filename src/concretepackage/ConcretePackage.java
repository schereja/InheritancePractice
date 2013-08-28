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
        SalaryPlusBonusEmployee newBonusEmployee = new SalaryPlusBonusEmployee(10000);
        double bonus = newBonusEmployee.getBonus();
        System.out.println("Your bonus is: " + bonus);
    }  
}
