package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.Player;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import sun.net.www.content.text.plain;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PlayersRepositoryImplTest {

    PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

    @Mock
    private PlayersRepositoryImpl playersImpl;

    @InjectMocks
    private final PlayersRepository playersRepo = new PlayersRepository() {

    @Test
    public void save(Player player) {
    Player player1 = new Player();
    playersRepo.save(player1);

    verify(playersImpl).save(player1);

        }

        @Override
        public List<Player> findAllPlayers() {
            return null;
        }

        @Override
        public List<Player> findArsenalPlayers() {
            return null;
        }

        @Override
        public List<Player> findAstonVillaPlayers() {
            return null;
        }

        @Override
        public List<Player> findBarnsleyPlayers() {
            return null;
        }

        @Override
        public List<Player> findCrystalPalacePlayers() {
            return null;
        }

        @Override
        public List<Player> findEvertonPlayers() {
            return null;
        }

        @Override
        public List<Player> findHullCityPlayers() {
            return null;
        }

        @Override
        public List<Player> findLeicasterCityPlayers() {
            return null;
        }

        @Override
        public List<Player> findLiverpoolPlayers() {
            return null;
        }

        @Override
        public List<Player> findManchesterCityPlayers() {
            return null;
        }

        @Override
        public List<Player> findManchesterUnitedPlayers() {
            return null;
        }

        @Override
        public List<Player> findNewcastleUnitedPlayers() {
            return null;
        }

        @Override
        public List<Player> findQueensParkRangersPlayers() {
            return null;
        }

        @Override
        public List<Player> findSouthamptonPlayers() {
            return null;
        }

        @Override
        public List<Player> findStokeCityPlayers() {
            return null;
        }

        @Override
        public List<Player> findSunderlandPlayers() {
            return null;
        }

        @Override
        public List<Player> findSwanseaPlayers() {
            return null;
        }

        @Override
        public List<Player> findTottenhamPlayers() {
            return null;
        }

        @Override
        public List<Player> findWestBromPlayers() {
            return null;
        }

        @Override
        public List<Player> findWestHamPlayers() {
            return null;
        }
    };

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
