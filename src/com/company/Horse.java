package com.company;

import com.company.DomesticAnimal;

public class Horse extends DomesticAnimal {
    private int horse;
    private String color;

    public Horse(int horse, String nickName, String gender, int age, int weight, String color) {
        super(nickName, gender, age, weight);
        this.horse=horse;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Horse number "+horse+super.toString()+", color=" + color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorse() {
        return horse;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }
}
