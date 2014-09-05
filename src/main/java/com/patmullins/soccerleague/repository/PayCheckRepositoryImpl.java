package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.PlayerPayCheck;
import com.patmullins.soccerleague.repository.jdbc.JDBCTemplate;
import com.patmullins.soccerleague.repository.jdbc.SQLQueryWrapper;
import com.patmullins.soccerleague.repository.jdbc.SQLStatementWrapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PayCheckRepositoryImpl implements PayCheckRepository {

    JDBCTemplate jdbcTemplate;

    public PayCheckRepositoryImpl() {
        jdbcTemplate = new JDBCTemplate();
    }

    public void save(final PlayerPayCheck playerPayCheck) {
        jdbcTemplate.execute(new SQLStatementWrapper() {
            public void execute(Statement statement) throws SQLException {
                statement.execute("insert into PayChecks (firstName, lastName, playerDivision, playerChampions , goalsSaved, goalsScored, playerAge) values ('" + playerPayCheck.getFirstName() + "', '" + playerPayCheck.getLastName() + "','" + playerPayCheck.getDivision() + "','" + playerPayCheck.getDivision() + "','" + playerPayCheck.getGoalsScored() + "','" + playerPayCheck.getGoalsSaved() + "','" + playerPayCheck.getPlayerAge() +"')");
            }
        });
    }

    public ArrayList<PlayerPayCheck> findAllPayChecks() {
        final ArrayList<PlayerPayCheck> playerPayChecks = new ArrayList<PlayerPayCheck>();
        jdbcTemplate.query("select * from PayChecks", new SQLQueryWrapper() {
            public void interpretResults(ResultSet resultSet) throws SQLException {
                while (resultSet.next()) {
                    PlayerPayCheck playerPayCheck = new PlayerPayCheck();
                    playerPayCheck.setFirstName(resultSet.getString("firstName"));
                    playerPayCheck.setLastName(resultSet.getString("lastName"));
                    playerPayCheck.setDivision(resultSet.getString("playerDivision"));
                    playerPayCheck.setChampions(resultSet.getString("playerChampions"));
                    playerPayCheck.setGoalsSaved(resultSet.getInt("goalsSaved"));
                    playerPayCheck.setGoalsScored(resultSet.getInt("goalsScored"));
                    playerPayCheck.setGoalsScored(resultSet.getInt("playerAge"));

                    playerPayChecks.add(playerPayCheck);
                }
            }
        });

        return playerPayChecks;
    }
}