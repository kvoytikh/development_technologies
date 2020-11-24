package com.company.funcTestsJUnit;

import com.company.details.Details;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetailsTest {

    @Test
    void testToString_WriteDetais() {
        String result = "legs";
        assertEquals(result, Details.LEGS.toString());
    }
}