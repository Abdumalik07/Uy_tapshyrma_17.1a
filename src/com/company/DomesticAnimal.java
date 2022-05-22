package com.company;

public abstract class DomesticAnimal extends Farm {
    private String nickName;
    private String gender;
    private int age;
    private int  weight;

    public DomesticAnimal(String nickName, String gender, int age, int weight) {
        super();

        this.nickName = nickName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ", nickName=" + nickName + "" +
                ", gender=" + gender + "" +
                ", age=" + age +
                ", weight=" + weight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
