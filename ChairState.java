package com.company.java;

import java.util.Arrays;

public enum ChairState {
    READY, NOT_READY, IN_PROCESS;

    public static void showState(ChairState state) {
        System.out.println("state ->" + state);
    }

    @Override
    public String toString() {
        return Arrays.toString(super.toString().toLowerCase().split("_"))
                .replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
    }
}
