package com.company.details;

import com.company.interfaces.Detail;

public class Bolt extends Detail {
    public Bolt(int number) {
        this.number = number;
        this.kind = Details.BOLT;
    }
}
