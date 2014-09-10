package com.patmullins.soccerleague.domain;

public class PlayerPayCheck {

    private String firstName;
    private String lastName;
    private int goalsScored;
    private int goalsSaved;
    private int playerAge;
    private String division;
    private String champions;

    public String getFirstName(){return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getChampions() {
        return champions;
    }

    public void setChampions(String champions) {
        this.champions = champions;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public int getGoalsSaved() {
        return goalsSaved;
    }

    public void setGoalsSaved(int goalsSaved) {
        this.goalsSaved = goalsSaved;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
}
