package com.company.details;

import com.company.NumberDetailsException;

public class Bolt extends Detail {
    public Bolt(int number) throws NumberDetailsException {
        if (number < 1) throw new NumberDetailsException("Not right number of details");
        this.number = number;
        this.kind = Details.BOLT;
    }
}
