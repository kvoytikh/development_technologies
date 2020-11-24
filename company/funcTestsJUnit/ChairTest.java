package com.company.funcTestsJUnit;

import com.company.Brand;
import com.company.Chair;
import com.company.NumberDetailsException;
import com.company.details.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;


class ChairTest {
    Chair ourChairAMF = new Chair(Brand.AMF);
    Chair ourChairAMF1 = new Chair(Brand.AMF);
    Chair ourChairAMF2 = new Chair(Brand.AMF);
    Chair ourChairMONICA = new Chair(Brand.MONICA);

    List<Detail> details = new ArrayList<>();

    @Test
    void testAddDetail_IfSuccess_BySimpleSizes() throws NumberDetailsException {
            details = ourChairAMF.addDetail(new ChairCover(30, 40));
            details = ourChairAMF.addDetail(new ChairLeg(4, 70));
            details = ourChairAMF.addDetail(new Bolt(6));

            assertEquals(3, details.size());
    }


    @Test
    void testEquals_IfSuccess_AllSituations() {
        /*---рефлексивность----*/
        assertTrue(ourChairAMF.equals(ourChairAMF));

        /*---симетричность---*/
        assertTrue(ourChairAMF.equals(ourChairAMF1));
        assertTrue(ourChairAMF1.equals(ourChairAMF2));

        /*---транзитивность----*/
        assertTrue(ourChairAMF.equals(ourChairAMF1));
        assertTrue(ourChairAMF1.equals(ourChairAMF2));
        assertTrue(ourChairAMF.equals(ourChairAMF2));

        /*---согласованость----*/
        assertTrue(ourChairAMF.equals(ourChairAMF1));

        /*----сравнение null----*/
        assertFalse(ourChairAMF.equals(null));


    }

    @Test
    void testHashCode_IfSuccess() {
        /*---рефлексивность----*/
        assertEquals(ourChairAMF.hashCode(), ourChairAMF.hashCode());

        /*---симетричность---*/
        assertEquals(ourChairAMF.hashCode(), ourChairAMF1.hashCode());
    }


    /*--false--*/
    @Test
    void testEquals_IfObjectsAreNotSimple() {
        assertFalse(ourChairAMF.equals(ourChairMONICA));
    }

    @Test
    void testToString_ChairDetailsWeNeed() {
        String result = "AMF -> you need: ChairCover(width, length) -> (30.0, 40.0); " +
                "Legs -> 4; bolts -> 6";
        assertEquals(result, ourChairAMF.toString());
    }
}