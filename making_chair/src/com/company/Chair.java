package com.company;
import com.company.interfaces.Detail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Chair {
    protected List<Detail> details = new ArrayList<>();
    private Brand brand;
    private ChairState state;

    public void addDetail(Detail detail) {
        this.details.add(detail);
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Chair() {
        this.state = ChairState.NOT_READY;
        showState();
    }
    public void make() {
        this.state = ChairState.IN_PROCESS;
        showState();

        Iterator<Detail> iter = details.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next().getKind() + " is made");
        }

        this.state = ChairState.READY;
        showState();
    }

    public void showState() {
        System.out.println("state -> " + state);
    }

    @Override
    public String toString() {
        return brand + " -> " + "you need: ChairCover(width, length) -> (" + brand.getChairCoverWidth()
                + ", " + brand.getChairCoverLength() + "); Legs -> " + brand.getChairLeg() + "; bolts -> "
                + brand.getBolts();
    }
}
