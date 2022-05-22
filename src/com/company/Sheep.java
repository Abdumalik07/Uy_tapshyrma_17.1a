package com.company;

import com.company.DomesticAnimal;

public class Sheep extends DomesticAnimal {
    private int sheep;
    public Sheep(int sheep, String nickName, String gender, int age, int weight) {
        super(nickName, gender, age, weight);
        this.sheep=sheep;
    }
    @Override
    public String toString() {
        return "Sheep number "+sheep+super.toString();
    }

    public int getSheep() {
        return sheep;
    }

    public void setSheep(int sheep) {
        this.sheep = sheep;
    }
}
