package com.company.modulesTestsMockito;

import com.company.Chair;
import com.company.NumberDetailsException;
import com.company.details.ChairCover;
import com.company.details.Detail;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


class ChairTestMockito {

    List<Detail> details = new ArrayList<>();

    @Test
    void testAddDetail_IfSuccess_Mockito() throws NumberDetailsException {
            Chair chair = Mockito.mock(Chair.class);

            details = chair.addDetail(new ChairCover(30, 40));

            when(chair.addDetail(new ChairCover(30, 40)).size()).thenReturn(1);
            assertEquals(chair.addDetail(new ChairCover(30, 40)).size(), details.size());
            verify(chair).addDetail(new ChairCover(30, 40));
    }


    @Test
    void testToString_ChairDetailsWeNeed() {
        Chair chair = Mockito.mock(Chair.class);


        String result = "AMF -> you need: ChairCover(width, length) -> (30.0, 40.0); " +
                "Legs -> 4; bolts -> 6";
        when(chair.toString()).thenReturn(result);
        assertEquals(chair.toString(), result);
    }
}