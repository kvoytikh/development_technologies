package com.company;

import com.company.brands.AmfBrand;
import com.company.details.Bolt;
import com.company.details.ChairCover;
import com.company.details.ChairLeg;


public class Main {
    //Iterator - in method "make" from class Chair
    public static void main(String[] args) {
        Chair ourChair = new AmfBrand();

        System.out.println("What we need? "  + "\n" + ourChair);

        ourChair.addDetail(new ChairCover(30, 40));
        ourChair.addDetail(new ChairLeg(4, 70));
        ourChair.addDetail(new Bolt(6));

        ourChair.make();

    }
}
