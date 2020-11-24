package com.company.funcTestsJUnit;

import com.company.Brand;
import com.company.Chair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChairStateTest {
    Chair ourChair1 = new Chair(Brand.AMF);
    @Test
    void testToString_WriteChairState() {
        String result = " not  ready ";
        assertEquals(result, ourChair1.getState().toString());
    }

}