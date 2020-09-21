package com.company.details;

public enum Details {
    BOLT, LEGS, COVER;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
