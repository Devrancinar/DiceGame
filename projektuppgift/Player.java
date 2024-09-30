package se.devran.projektuppgift;

public class Player {

    // skapa spelare
    private String name;
    private int totalScore;

    //min konstruktor
    public Player(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name: " + name + "Score: " + totalScore;
    }

    public String getName() {
        return name;
    }


}

