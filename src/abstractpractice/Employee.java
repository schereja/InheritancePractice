/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractpractice;

/**
 *
 * @author schereja
 */
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String hireDate;
    private String job;
    
    public Employee(String firstName, String lastName, String hireDate, String job){
        String name = firstName + lastName;
        setFirstName(firstName);
        setLastName(lastName);
        setHireDate(hireDate);
        setJob(job);
    }
    public abstract double getEmployeePay();
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }
    public void setJob(String job){
        this.job = job;
    }
}
