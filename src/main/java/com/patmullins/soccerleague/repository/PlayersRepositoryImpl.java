package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.Player;
import com.patmullins.soccerleague.repository.jdbc.JDBCTemplate;
import com.patmullins.soccerleague.repository.jdbc.SQLQueryWrapper;
import com.patmullins.soccerleague.repository.jdbc.SQLStatementWrapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayersRepositoryImpl implements PlayersRepository {

    JDBCTemplate jdbcTemplate;

    public PlayersRepositoryImpl() {
        jdbcTemplate = new JDBCTemplate();
    }

    public void save(final Player player) {
        jdbcTemplate.execute(new SQLStatementWrapper() {
            public void execute(Statement statement) throws SQLException {
                statement.execute("insert into Players (firstName, lastName, playerTeamName, playerPosition , country, jersey) values ('" + player.getFirstName() + "', '" + player.getLastName() + "','" + player.getPlayerTeamName() + "','" + player.getPosition() + "','" + player.getCountry() + "', '" + player.getJersey() +"')");
            }
        });
    }

    public List<Player> findAllPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players", new SQLQueryWrapper() {
            public void interpretResults(ResultSet resultSet) throws SQLException {
                while (resultSet.next()) {
                    Player player = new Player();
                    player.setFirstName(resultSet.getString("firstName"));
                    player.setLastName(resultSet.getString("lastName"));
                    player.setPlayerTeamName(resultSet.getString("playerTeamName"));
                    player.setPosition(resultSet.getString("playerPosition"));
                    player.setCountry(resultSet.getString("country"));
                    player.setJersey(resultSet.getInt("jersey"));
                    players.add(player);
                }
            }
        });

        return players;
    }
    public List<Player> findArsenalPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Arsenal'", new SQLQueryWrapper() {
            public void interpretResults(ResultSet resultSet) throws SQLException {
                while (resultSet.next()) {
                    Player player = new Player();
                    player.setFirstName(resultSet.getString("firstName"));
                    player.setLastName(resultSet.getString("lastName"));
                    player.setPlayerTeamName(resultSet.getString("playerTeamName"));
                    player.setPosition(resultSet.getString("playerPosition"));
                    player.setCountry(resultSet.getString("country"));
                    player.setJersey(resultSet.getInt("jersey"));
                    players.add(player);
                }
            }
        });

        return players;
    }
}
