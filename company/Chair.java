package com.company;
import com.company.details.Detail;
import com.company.interfaces.MakingProcess;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class Chair implements MakingProcess {
    protected List<Detail> details = new ArrayList<>();

    private Brand brand;
    private ChairState state;
    public List<Detail> addDetail(Detail detail) {
        this.details.add(detail);
        return details;
    }

    public Chair(Brand brand) {
        this.state = ChairState.NOT_READY;
        this.brand = brand;
        ChairState.showState(state);
    }

    public ChairState getState() {
        return state;
    }

    @Override
    public void make() {
        String madeMsg = " is made";

        this.state = ChairState.IN_PROCESS;
        ChairState.showState(state);

        iterDetails(madeMsg, details);

        this.state = ChairState.READY;
        ChairState.showState(state);
    }
    
    public void iterDetails(String str, List<Detail> details) {
        Iterator<Detail> iter = details.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getKind() + str);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return Objects.equals(details, chair.details) &&
                brand == chair.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(details, brand);
    }

    @Override
    public String toString() {
        StringBuilder strBldr = new StringBuilder();
        strBldr.append(brand)
                .append(" -> ")
                .append("you need: ChairCover(width, length) -> (")
                .append(brand.getChairCoverWidth())
                .append(", ")
                .append(brand.getChairCoverLength())
                .append("); Legs -> ")
                .append(brand.getChairLeg())
                .append("; bolts -> ")
                .append(brand.getBolts());
        return strBldr.toString();
    }
}
