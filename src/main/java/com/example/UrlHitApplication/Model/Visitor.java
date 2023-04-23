package com.example.UrlHitApplication.Model;

public class Visitor {
    private int count;

    public Visitor(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "count=" + count +
                '}';
    }
}
