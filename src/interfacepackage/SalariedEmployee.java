/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepackage;

/**
 *
 * @author schereja
 */
public class SalariedEmployee {
    private String firstName;
    private String lastName;
    private int hours;
    private double salary;
    
    public SalariedEmployee(String firstName, String lastName, int salary, double rate){
        setRate(salary);
        setHours(hours);
        
    }
    public double getEmployeesPay() {
         return salary;
    }

    private void setRate(double salary) {
        this.salary = salary;
    }

    private void setHours(int hours) {
        this.hours = hours;
    }
}
