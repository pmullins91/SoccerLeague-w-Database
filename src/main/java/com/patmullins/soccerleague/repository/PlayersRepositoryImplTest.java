package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.Player;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class PlayersRepositoryImplTest {

    PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

    @Test
    public void testSave() throws Exception {

    }

    @Test
    public void testFindAllPlayers() throws Exception {

    }

    @Test
    public void testFindArsenalPlayers() throws Exception {

    }

    @Test
    public void testFindAstonVillaPlayers() throws Exception {

    }

    @Test
    public void testFindBarnsleyPlayers() throws Exception {

    }

    @Test
    public void testFindCrystalPalacePlayers() throws Exception {

    }

    @Test
    public void testFindEvertonPlayers() throws Exception {

    }

    @Test
    public void testFindHullCityPlayers() throws Exception {

    }

    @Test
    public void testFindLeicasterCityPlayers() throws Exception {

    }

    @Test
    public void testFindLiverpoolPlayers() throws Exception {

    }

    @Test
    public void testFindManchesterCityPlayers() throws Exception {

    }

    @Test
    public void testFindManchesterUnitedPlayers() throws Exception {

    }

    @Test
    public void testFindNewcastleUnitedPlayers() throws Exception {
        List<Player> players = repository.findNewcastleUnitedPlayers();
        assertEquals(1, players.size());


    }

    @Test
    public void testFindQueensParkRangersPlayers() throws Exception {

    }

    @Test
    public void testFindSouthamptonPlayers() throws Exception {

    }

    @Test
    public void testFindStokeCityPlayers() throws Exception {

    }

    @Test
    public void testFindSunderlandPlayers() throws Exception {

    }

    @Test
    public void testFindSwanseaPlayers() throws Exception {

    }

    @Test
    public void testFindTottenhamPlayers() throws Exception {

    }

    @Test
    public void testFindWestBromPlayers() throws Exception {

    }

    @Test
    public void testFindWestHamPlayers() throws Exception {

    }
}
