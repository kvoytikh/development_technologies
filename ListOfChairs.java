package com.company.java;


import com.company.java.details.Detail;
import com.company.java.details.Details;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfChairs {
    private static List<Chair> chairList = new ArrayList<>();

    public static List<Chair> addChair(Chair chair) {
        chairList.add(chair);
        return chairList;
    }



    public int countAllPriceOfKind(String str) {
        List <Chair> m = chairList.stream().filter(p -> str.equals(p)).collect(Collectors.toList());
        Iterator<Chair> iter = chairList.iterator();
        int price = 0;
        while (iter.hasNext()) {
            price += iter.next().getPrice();
        }
        return price;
    }
    public Chair findElementWithMaxPrice(){
        return chairList.stream().max(Comparator.comparing(Chair::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }
    public double findAveragePrice(){
        return chairList.stream().mapToDouble(Chair::getPrice).average().orElse(Double.NaN);
    }
    public Map<String, List<Chair>> groupByPrice() {
        return chairList.stream()
                .collect(Collectors.groupingBy(product -> product.getPrice() > 100 ? "expensive" : "cheap"));
    }
    public Stream<Detail> getStreamOfDetails(Chair chair) {
        return chair.getDetails().stream().flatMap(det -> findElementWithMaxPrice().details.stream());
    }

}
