package com.patmullins.soccerleague.domain;

public class Team {
    private String teamName;
    private String teamCity;
    private String teamCompLevel;
    private String playerTeamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public String getTeamCompLevel() {
        return teamCompLevel;
    }

    public void setTeamCompLevel(String teamCompLevel) {
        this.teamCompLevel = teamCompLevel;
    }

    }
