package com.company;

import com.company.details.Bolt;
import com.company.details.ChairCover;
import com.company.details.ChairLeg;
import com.company.details.Detail;

import java.util.ArrayList;
import java.util.List;


public class Main {
    //Iterator - in method "make" from class Chair
    //Collection -  in class "Chair"

    public static void main(String[] args) {
        MainHelp.makeChairs();
    }
    
    static class MainHelp {
        public static void makeChairs(){
            Chair ourChair1 = new Chair(Brand.AMF);
            List<Detail> detailsForOne;
            printDetails(ourChair1);
            detailsForOne = addingDetails(ourChair1,30, 40, 4, 70, 6);
            ourChair1.iterDetails(" was added", detailsForOne);
            ourChair1.make();
        }

        public static void printDetails(Chair ourChair) {
            System.out.println("What we need? " + "\n" + ourChair);
        }

        public static List<Detail> addingDetails(Chair ourChair, double chairCoverWidth, double chairCoverLength,
                                         int numberOfLegs, int legsHeight, int numberOfBolts) {
            List<Detail> details = new ArrayList<>();
            try {
                details = ourChair.addDetail(new ChairCover(chairCoverWidth, chairCoverLength));
                details = ourChair.addDetail(new ChairLeg(numberOfLegs, legsHeight));
                details = ourChair.addDetail(new Bolt(numberOfBolts));
            } catch (NumberDetailsException ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("Details are ready for using");
            }
            return details;
        }
    }


}
