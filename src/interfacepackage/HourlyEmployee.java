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
    private int hours;
    private double rate;
    
    public HourlyEmployee(String firstName, String lastName, int hours, double rate){
        setRate(rate);
        setHours(hours);
        
    }

    @Override
    public double getEmployeesPay() {
         return hours * rate;
    }

    private void setRate(double rate) {
        this.rate = rate;
    }

    private void setHours(int hours) {
        this.hours = hours;
    }
}
