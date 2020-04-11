package com.example.monsterfriends;

public class Pets {
    int hunger;
    int play;
    int love;
    String petName;
    int petImage;

    //constructor

    public Pets(int hunger, int play, int love,String petName, int petImage) {
        this.hunger = hunger;
        this.play = play;
        this.love = love;
        this.petImage = petImage;
        this.petName = petName;

    }
    //Getters and setters

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetImage() {
        return petImage;
    }

    public void setPetImage(int petImage) {
        this.petImage = petImage;
    }

}
