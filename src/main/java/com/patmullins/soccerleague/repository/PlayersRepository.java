package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.Player;

import java.util.List;

public interface PlayersRepository {
    public void save(Player player);

    public List<Player> findAllPlayers();

    public List<Player> findArsenalPlayers();





    }
