/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepackage;

/**
 *
 * @author schereja
 */
public class HourlyEmployee implements Employee{
    private String firstName;
    private String lastName;
    private String job;
    private String hireDate;
    private double hours;
    private double rate;
    
    public HourlyEmployee(String firstName, String lastName, String job, String hireDate, double hours, double rate){
        setFirstName(firstName);
        setLastName(lastName);
        setJob(job);
        setHireDate(hireDate);
        setHours(hours);
        setRate(rate);
        
    }
    @Override
    public double getEmployeesPay() {
      return hours * rate;
      
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

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    
}
