/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretepackage;

/**
 *
 * @author schereja
 
Hourly Employee class which Inherits from Employee*/
class SalariedEmployee extends Employee{
    private int salary;
    private double timesPaid;

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getTimesPaid() {
        return timesPaid;
    }

    public void setTimesPaid(double timesPaid) {
        this.timesPaid = timesPaid;
    }
//    
}
