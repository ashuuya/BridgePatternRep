package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alarmChoice, brandChoice;

        System.out.println("Select one alarm system");
        System.out.println("1. Защита-200");
        System.out.println("2. Защита-400");
        boolean rightChoice = false;
        do {
            alarmChoice = sc.nextInt();
            if (alarmChoice == 1 || alarmChoice == 2)
            {
                rightChoice = true;
            }
        } while (!rightChoice);

        rightChoice = false;
        System.out.println("Select one car brand");
        System.out.println("1. Volkswagen");
        System.out.println("2. Audi");
        do {
            brandChoice = sc.nextInt();
            if (brandChoice == 1 || brandChoice == 2)
            {
                rightChoice = true;
            }
        } while (!rightChoice);

        switch (alarmChoice) {
            case  (1):
                if (brandChoice == 1){
                    Brand brand = new Volkswagen(new AlarmSysOne());
                    brand.move();
                }
                else {
                    Brand brand = new Audi(new AlarmSysOne());
                    brand.move();
                }
                break;
            case (2):
                if (brandChoice == 1){
                    Brand brand = new Volkswagen(new AlarmSysTwo());
                    brand.move();
                }
                else {
                    Brand brand = new Audi(new AlarmSysTwo());
                    brand.move();
                }
                break;
        }
    }
}
