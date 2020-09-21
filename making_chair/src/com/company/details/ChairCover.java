package com.company.details;

import com.company.interfaces.Detail;

public class ChairCover extends Detail {
    public ChairCover(double width, double length) {
        this.width = width;
        this.length = length;
        this.kind = Details.COVER;
    }
}
