package com.company;

import com.company.brands.AmfBrand;
import com.company.brands.MonicaBrand;
import com.company.brands.NicolasBrand;
import com.company.details.Bolt;
import com.company.details.ChairCover;
import com.company.details.ChairLeg;

import java.util.HashSet;


public class Main {
    //Iterator - in method "make" from class Chair
    //Collection -  in class "Chair"
    public static void main(String[] args) {
        makeChairs();
    }

    public static void makeChairs() {
        Chair ourChair1 = new AmfBrand();

        printDetails(ourChair1);
        addingDetails(ourChair1, 30, 40, 4, 70, 6);
        ourChair1.make();

    }

    public static void printDetails(Chair ourChair) {
        System.out.println("What we need? "  + "\n" + ourChair);
    }

    public static void addingDetails(Chair ourChair, double chairCoverWidth, double chairCoverLength,
                                      int numberOfLegs, int legsHeight, int numberOfBolts) {
        ourChair.addDetail(new ChairCover(chairCoverWidth, chairCoverLength));
        ourChair.addDetail(new ChairLeg(numberOfLegs, legsHeight));
        ourChair.addDetail(new Bolt(numberOfBolts));
    }

}
