package com.company;

public enum Brand {
    NICOLAS(40, 40, 4, 8),
    MONICA(80, 60, 3, 4),
    AMF(30, 40, 4, 6);

    private int bolts;
    private int chairLeg;
    private double chairCoverWidth;
    private double chairCoverLength;

    Brand(double chairCoverWidth, double chairCoverLength, int chairLeg, int bolts) {
        this.chairCoverLength = chairCoverLength;
        this.chairCoverWidth = chairCoverWidth;
        this.chairLeg = chairLeg;
        this.bolts = bolts;
    }

    public double getChairCoverLength() {
        return chairCoverLength;
    }

    public double getChairCoverWidth() {
        return chairCoverWidth;
    }

    public int getBolts() {
        return bolts;
    }

    public int getChairLeg() {
        return chairLeg;
    }
}
