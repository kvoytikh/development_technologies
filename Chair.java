package com.company.java;
import com.company.java.details.Detail;
import com.company.java.details.Details;
import com.company.java.interfaces.MakingProcess;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Chair implements MakingProcess {
    protected List<Detail> details = new ArrayList<>();


    private Brand brand;
    private ChairState state;
    private int price;
    public List<Detail> addDetail(Detail detail) {
        this.details.add(detail);
        return details;
    }

    public Chair(Brand brand, int price) {
        this.state = ChairState.NOT_READY;
        this.brand = brand;
        this.price = price;
        ChairState.showState(state);
    }

    public ChairState getState() {
        return state;
    }

    public int getPrice() {
        return price;
    }

    public List<Detail> getDetails() {
        return details;
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
