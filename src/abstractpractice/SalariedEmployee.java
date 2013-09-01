/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractpractice;

/**
 *
 * @author schereja
 */
public class SalariedEmployee extends Employee{
    private double salary;
    private double checksPerYear = 26;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getChecksPerYear() {
        return checksPerYear;
    }

    @Override
    public void pay() {
        System.out.println("You get paid salary. Your salary is " + getSalary() + ".");
    }
    
    
}
