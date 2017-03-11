/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorForm;

/**
 *
 * @author root
 */
public class MathFractions {
    private double sum=0;
    public double add(double number1){
        sum += number1;
        return sum;
    }
    public double abstraction(double number){
        sum -= number;
        return sum;
    }
    public double multiply( double number) {
        sum *= number;
        return sum;
    }
    public double division (double number){
        sum /= number;
        return sum;
    }
    public double equality (){
        return sum;
    }
    
}
