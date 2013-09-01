/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretepackage;

/**
 *
 * @author schereja
 */
class SalaryPlusBonusEmployee extends SalariedEmployee {
   private double bonusPercentage = .06;
   private double bonusAmount;
    public void bonusAmount(double salary){
        bonusAmount =  salary * bonusPercentage;
        System.out.println("Your bonus is: " + bonusAmount);
        
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
