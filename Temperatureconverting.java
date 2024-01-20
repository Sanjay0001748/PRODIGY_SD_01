package Internship;
import java.util.Scanner;

public class Temperatureconverting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature in celcius");
        double celcius=sc.nextDouble();
        double fahrenheit,kelvin;
        fahrenheit=(9*celcius/5)+32;
        kelvin=celcius+273.15;
        System.out.println("temperature in fahrenheit is "+ fahrenheit);
        System.out.println("the temperature in kelvin is "+kelvin);

    }
}
