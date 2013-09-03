/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepackage;

/**
 *
 * @author schereja
 */
public class interfaceExample {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("Jason", "Scherer", "QROC","Jan 1st 2013", 40, 15.00);
        System.out.println("Here is your pay for this period: " + emp1.getEmployeesPay());
        
        Employee emp2 = new SalariedEmployee("Jason", "Scherer", "QROC","Jan 1st 2013", 40000);
        System.out.println("Here is what your hourly pay is equal to: "+ emp2.getEmployeesPay());
        
        
        Employee emp3 = new SalaryPlusBonusEmployee("Jason", "Scherer", "QROC","Jan 1st 2013", 40000);
        System.out.println("Here is what your hourly pay is equal to: "+ emp2.getEmployeesPay() + "\nHere is your bonus: " + emp3.getEmployeesPay()*.06);
    }
}
