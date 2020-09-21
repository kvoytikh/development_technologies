package com.company.details;

import com.company.interfaces.Detail;

public class ChairLeg extends Detail {
    public ChairLeg(int number, int height) {
        this.number = number;
        this.height = height;
        this.kind = Details.LEGS;
    }
}
