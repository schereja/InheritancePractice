/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractpractice;

/**
 *
 * @author schereja
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double bonusPercentage = .06;
    private double bonusAmount;
    public double bonusAmount(){
        bonusAmount =  this.getSalary() * bonusPercentage;
        
        return bonusAmount;
    }
    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }
    
}
