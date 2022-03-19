package com.company;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {
    public double bonus (String str){


        LocalDate ld = LocalDate.parse(str);
        LocalDate now = LocalDate.now();

        if(ChronoUnit.DAYS.between(ld,now)<365){
            return 5000;
        }
        else if(ChronoUnit.DAYS.between(ld,now)>=1 && ChronoUnit.DAYS.between(ld,now)<2){
            return 8000;
        }
        else {
            return 10000;
        }

    }
}

