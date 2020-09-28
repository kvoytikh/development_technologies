package com.company;

public enum ChairState {
    READY, NOT_READY, IN_PROCESS;

    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
