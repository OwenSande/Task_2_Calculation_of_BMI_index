package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        float heightSande, weightSande, bmiSande;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program will calculate your BMI");
        System.out.println("Enter your height in cm and press enter: ");
        heightSande = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight and press enter: ");
        weightSande = Float.parseFloat(br.readLine());

        bmiSande = (float) (weightSande / (Math.pow(heightSande, 2)));
        System.out.printf("Your BMI is: " + "%2.2f, \n", bmiSande);

        if(bmiSande<16){
            System.out.println("You are starving");
        } else if((bmiSande >= 16)&&(bmiSande < 16.99)){
            System.out.println("You are emaciated");
        } else if ((bmiSande >=17)&&(bmiSande<18.49)){
            System.out.println("You are underweight");
        } else if ((bmiSande >=18.50)&&(bmiSande<22.99)) {
            System.out.println("You are in the low range of the norm");
        } else if ((bmiSande >= 23)&&(bmiSande < 27.49)){
            System.out.println("You are in the high range of the norm");
        } else if ((bmiSande >= 25)&&(bmiSande < 27.49)){
            System.out.println("You are over weight pre-obese");
        } else if ((bmiSande >= 27.50)&&(bmiSande < 29.99)){
            System.out.println("You are overweight");
        } else if ((bmiSande >= 30)&&(bmiSande < 34.99)){
            System.out.println("You have 2nd degree obesity");
        } else if ((bmiSande > 40)){
            System.out.println("You have 3rd degree obesity");
        }
        
    }
}
