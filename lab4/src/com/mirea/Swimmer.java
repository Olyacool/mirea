package com.mirea;

public class Swimmer extends Swim {
    private int distance;
    private int time;
    private String name;

    public Swimmer(int distance, int time, String name) {
        this.distance = distance;
        this.time = time;
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Swimmer{" +
                "distance=" + distance +
                ", time=" + time +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    void style(){
        System.out.println("Батерфляй");
    }
}
