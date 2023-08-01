package com.lumen.scan;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();
        if(number1<number3 && number1<number2) {
            System.out.println("1st number is smaller");
        }
        else if(number2<number3) {
            System.out.println("2nd number is smaller");
        }
        else {
            System.out.println("3rd number is smaller");
        }
        scanner.close();
	}

}
