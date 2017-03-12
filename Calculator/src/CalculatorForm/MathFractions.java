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
    
    private double num1;
    private double num2;
    private double sum;
    private int fraction;
    private Boolean trigger1;
    //Constructor οταν δημιουργητε το αντικειμενο
    MathFractions() {
        num1 = 0;
        num2 = 0;
        sum = 0;
        fraction = 0;
        trigger1 = false;
    }
    //Προσθεση της προτως τιμης με την δευτερη
    public void add(){
        sum = num1+ num2;
        
        //return sum;
    }
    public double abstraction(){
        sum = num1 - num2;
        return sum;
    }
    public double multiply() {
        sum = num1 * num2;
        return sum;
    }
    public double division (){
        sum = num1 / num2;
        return sum;
    }
    public void setSum(double num){
        sum = num;
    }
    public double getSum (){
        return sum;
    }
    public void clear() {
        num1 = 0;
        num2=0;
        sum=0;
        fraction=0;
        trigger1 = false;
    }
    public void setNum1(double num){
        num1 = num;
    }
    public void setNum2(double num) {
        num2 = num;
    }
    public void setFraction(int tempFraction) {
        fraction = tempFraction;
    }
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    public int getFraction(){
        return fraction;
    }
    public Boolean fractionControl(){
        if (fraction >0 && fraction < 5){
            return true;
        } else {
            return false;
        }
    }
    public void setTrigger1(Boolean i) {
        trigger1 = i;
    }
    public Boolean getTrigger1(){
        return trigger1;
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
