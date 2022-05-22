package com.company;

public class Cow extends DomesticAnimal {
    private int cows;
    public Cow( int cows,String nickName, String gender, int age, int weight) {
        super(nickName, gender, age, weight);
        this.cows=cows;
    }

    @Override
    public String toString() {
        return "Cow number "+cows+super.toString();
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }
}
