package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.Player;

import java.util.List;

public interface PlayersRepository {
    public void save(Player player);

    public List<Player> findAllPlayers();

    public List<Player> findArsenalPlayers();

    public List<Player> findAstonVillaPlayers();

    public List<Player> findBarnsleyPlayers();

    public List<Player> findCrystalPalacePlayers();

    public List<Player> findEvertonPlayers();

    public List<Player> findHullCityPlayers();

    public List<Player> findLeicasterCityPlayers();

    public List<Player> findLiverpoolPlayers();

    public List<Player> findManchesterCityPlayers();

    public List<Player> findManchesterUnitedPlayers();

    public List<Player> findNewcastleUnitedPlayers();

    public List<Player> findQueensParkRangersPlayers();

    public List<Player> findSouthamptonPlayers();

    public List<Player> findStokeCityPlayers();

    public List<Player> findSunderlandPlayers();

    public List<Player> findSwanseaPlayers();

    public List<Player> findTottenhamPlayers();

    public List<Player> findWestBromPlayers();

    public List<Player> findWestHamPlayers();








}
