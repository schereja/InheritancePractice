/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepackage;

/**
 *
 * @author schereja
 */
public class SalariedEmployee implements Employee{

    private String firstName;
    private String lastName;
    private String job;
    private String hireDate;
    private double salary;
    
    public SalariedEmployee(String firstName, String lastName, String job, String hireDate, double salary){
        setFirstName(firstName);
        setLastName(lastName);
        setJob(job);
        setHireDate(hireDate);
        setSalary(salary);
        
    }
    @Override
    public double getEmployeesPay() {
      return salary/2080;
      
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
