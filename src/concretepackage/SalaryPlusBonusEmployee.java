/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretepackage;

/**
 *
 * @author schereja
 */
class SalaryPlusBonusEmployee{
    private double salary;
    private double bonusPercentage = .06;
    public SalaryPlusBonusEmployee(double salary){
        this.salary = salary;
        
    }
    public double getBonus(){
        return (salary * bonusPercentage);
    }
}
