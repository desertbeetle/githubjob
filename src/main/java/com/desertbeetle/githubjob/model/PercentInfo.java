package com.desertbeetle.githubjob.model;

public class PercentInfo {
    private int obtained;
    private int total;
    private double percent;

    public PercentInfo(int obtained, int total, double percent) {
        this.obtained = obtained;
        this.total = total;
        this.percent = percent;
    }

    public int getObtained() {
        return obtained;
    }

    public int getTotal() {
        return total;
    }

    public double getPercent() {
        return percent;
    }

    public void setObtained(int obtained) {
        this.obtained = obtained;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
