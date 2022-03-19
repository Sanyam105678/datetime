package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Joining date in yyyy-MM-dd format");
        String str = sc.next();
        EmployeeBonus obj = new EmployeeBonus();

        LocalDate ld = LocalDate.parse(str);
        LocalDate now = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String text = ld.format(formatter);
        if(!text.equals(str)) {
            try {
                throw new InvalidAgeException("Age should not be in the future");

            } catch (InvalidAgeException e) {
                e.printStackTrace();
            }
        }





        else if(ld.isAfter(now)) {
            try {
                throw new InvalidAgeException("Please pass the date in correct format");

            } catch (InvalidAgeException e) {
                e.printStackTrace();
            }
        }

        else
            System.out.println(obj.bonus(str));





    }
}

