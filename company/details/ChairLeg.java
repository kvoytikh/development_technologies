package com.company.details;

import com.company.NumberDetailsException;

public class ChairLeg extends Detail {
    public ChairLeg(int number, int height) throws NumberDetailsException {
        if (height < 0) throw new NumberDetailsException("Not right characteristics");
        if (number < 1) throw new NumberDetailsException("Not right number of details");
        this.number = number;
        this.height = height;
        this.kind = Details.LEGS;
    }
}
