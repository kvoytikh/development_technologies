package com.company.java.details;

import com.company.java.NumberDetailsException;

public class ChairCover extends Detail {
    public ChairCover(double width, double length) throws NumberDetailsException {
        if (width < 0 || length < 0) throw new NumberDetailsException("Not right characteristics");
        this.width = width;
        this.length = length;
        this.kind = Details.COVER;
    }
}
