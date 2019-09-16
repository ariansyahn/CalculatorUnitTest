package com.ariansyahn.calculator;

class Calculator {
//    public int operation(String operation, int num1, int num2){
//        int result=0;
//        if (operation.equalsIgnoreCase("sum"))
//            result = sum(num1,num2);
//        return result;
//    }

    int sum(int num1, int num2){
        return num1+num2;
    }
    int substract(int num1, int num2){
        return num1-num2;
    }
    int multiply(int num1, int num2){
        return num1*num2;
    }
    double divide(int num1, int num2){
        return (double) num1/num2;
    }
    double sqrt(double num){
        return Math.sqrt(num);
    }
    double pow(double num1,double num2){
        return Math.pow(num1,num2);
    }
    double percentage(double num){
        return num/100;
    }

}
