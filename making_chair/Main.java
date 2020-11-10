package com.company;

import com.company.details.Bolt;
import com.company.details.ChairCover;
import com.company.details.ChairLeg;


public class Main {
    //Iterator - in method "make" from class Chair
    //Collection -  in class "Chair"
    public static void main(String[] args) {
        MainHelp.makeChairs();
    }
    
    static class MainHelp {
        public static void makeChairs(){
            Chair ourChair1 = new Chair(Brand.AMF);
            Chair ourChair2 = new Chair(Brand.AMF);

            printDetails(ourChair1);
            addingDetails(ourChair1, 30, 40, 4, 70, 6);

            /*---FOR TESTING EQUALS()---*/
            addingDetails(ourChair2, 30, 41, 4, 70, 6);
            /*---*/

            ourChair1.make();

            System.out.println(ourChair1.getCountOfChairs());
            System.out.println(ourChair1.equals(ourChair2));
        }

        public static void printDetails(Chair ourChair) {
            System.out.println("What we need? " + "\n" + ourChair);
        }

        public static void addingDetails(Chair ourChair, double chairCoverWidth, double chairCoverLength,
                                         int numberOfLegs, int legsHeight, int numberOfBolts) {
            try {
                ourChair.addDetail(new ChairCover(chairCoverWidth, chairCoverLength));
                ourChair.addDetail(new ChairLeg(numberOfLegs, legsHeight));
                ourChair.addDetail(new Bolt(numberOfBolts));
            } catch (NumberDetailsException ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("Details are ready for using");
            }
        }
    }


}
