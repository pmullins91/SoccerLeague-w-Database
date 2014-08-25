package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.Team;

import java.util.List;

public interface TeamsRepository {
    public void save(Team team);

    public List<Team> findAllTeams();

    public List<Team> findAllChelsea();
}
