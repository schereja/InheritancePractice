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
    
    public void displaySalary(){
        int salary = 10000;
        System.out.println(salary);
    }
    public void welcome(){
        System.out.println("Welcome Salaried Employee");
    }
}
