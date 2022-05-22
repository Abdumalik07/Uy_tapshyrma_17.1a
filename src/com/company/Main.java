package com.company;

import com.company.Cow;
import com.company.Farm;
import com.company.Horse;
import com.company.Sheep;

public class Main {

    public static void main(String[] args) {
        farm1();
        farm2();
    }
    static void farm1 (){
        Farm farm=new Farm("Abdulla","Bishkek",5,3,2);
        System.out.println("Farm 1: "+farm);
        int a= farm.getCows();
        int b= farm.getSheep();
        int c= farm.getHorses();
        Farm[] cows=new Farm[a];
        Farm[] sheep=new Farm[b];
        Farm[] horses=new Farm[c];

        cows[0]=new Cow(1,"jony","m",2,150);
        cows[1]=new Cow(2,"tom","m",3,160);
        cows[2]=new Cow(3,"bell","f",6,170);
        cows[3]=new Cow(4,"alesia","f",3,165);
        cows[4]=new Cow(5,"natasha","f",2,180);

        sheep[0]=new Sheep(1,"jase","f",2,80);
        sheep[1]=new Sheep(2,"jimmy","m",4,100);
        sheep[2]=new Sheep(3,"ella","f",3,70);

        horses[0]=new Horse(1,"Dragon","m",5,250,"black");
        horses[1]=new Horse(2,"Akkula","m",6,300,"white");

        for (int i=0;i< cows.length;i++){
            System.out.println(cows[i]);
        }
        for (int i=0;i< sheep.length;i++){
            System.out.println(sheep[i]);
        }
        for (int i=0;i< horses.length;i++){
            System.out.println(horses[i]);
        }

    }
    static void farm2(){
        Farm farm=new Farm("Jack","Osh",1,1,1);
        System.out.println("\nFarm 2: "+farm);
        int a= farm.getCows();
        int b= farm.getSheep();
        int c= farm.getHorses();
        Farm[] cows=new Farm[a];
        Farm[] sheep=new Farm[b];
        Farm[] horses=new Farm[c];

        cows[0]=new Cow(1,"emma","f",5,150);

        sheep[0]=new Sheep(1,"anya","f",2,80);

        horses[0]=new Horse(1,"Dragon","m",5,250,"black");

        for (int i=0;i< cows.length;i++){
            System.out.println(cows[i]);
        }
        for (int i=0;i< sheep.length;i++){
            System.out.println(sheep[i]);
        }
        for (int i=0;i< horses.length;i++){
            System.out.println(horses[i]);
        }

    }



}
