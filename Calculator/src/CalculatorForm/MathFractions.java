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
    double num1;
    double num2;
    private double sum=0;
    public double add(double number1){
        sum = sum+ number1;
        return sum;
    }
    public double abstraction(double number){
        sum = sum - number;
        return sum;
    }
    public double multiply( double number) {
        sum = sum * number;
        return sum;
    }
    public double division (double number){
        sum = sum / number;
        return sum;
    }
    public double equality (){
        return sum;
    }
//    public boolean isNumeric(String str) {
//    try {
//        double d = Double.parseDouble(str);
//    }
//    catch(NumberFormatException nfe){
//        return false;
//    }
//        return true;
//    }
    
}
