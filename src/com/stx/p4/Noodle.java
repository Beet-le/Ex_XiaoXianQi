package com.stx.p4;

public class Noodle {
    private String  type;
    private int weight;
    private boolean isHaveSoup;

    public Noodle() {

    }

    public Noodle(String type, int weight, boolean isHaveSoup) {
        this.type = type;
        this.weight = weight;
        this.isHaveSoup = isHaveSoup;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHaveSoup() {
        return isHaveSoup;
    }

    public void setHaveSoup(boolean haveSoup) {
        isHaveSoup = haveSoup;
    }
}
