/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretepackage;

/**
 *
 * @author schereja
 */
public class Employee {
    public int employeeId;
    public String firstName;
    public String lastName;
    public boolean employed;
}
class HourlyEmployee extends Employee{
    private double payPerHour;
}

class SalariedEmployee extends Employee{
    private double salary;
}

class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double salaryWithBonus;
}