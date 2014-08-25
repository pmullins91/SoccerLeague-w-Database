package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.Team;
import com.patmullins.soccerleague.repository.jdbc.JDBCTemplate;
import com.patmullins.soccerleague.repository.jdbc.SQLQueryWrapper;
import com.patmullins.soccerleague.repository.jdbc.SQLStatementWrapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeamsRepositoryImpl implements TeamsRepository {

    JDBCTemplate jdbcTemplate;

    public TeamsRepositoryImpl() {
        jdbcTemplate = new JDBCTemplate();
    }

    @Override
    public void save(final Team team) {
        jdbcTemplate.execute(new SQLStatementWrapper() {
            public void execute(Statement statement) throws SQLException {
                statement.execute("insert into Teams (teamName, teamCity, teamCompLevel) values ('" + team.getTeamName() + "', '" + team.getTeamCity() + "','" + team.getTeamCompLevel() + "')");
            }
        });
    }


    public List<Team> findAllTeams() {
        final ArrayList<Team> teams = new ArrayList<Team>();
        jdbcTemplate.query("select * from Teams", new SQLQueryWrapper() {
            public void interpretResults(ResultSet resultSet) throws SQLException {
                while (resultSet.next()) {
                    Team team = new Team();
                    team.setTeamName(resultSet.getString("teamName"));
                    team.setTeamCity(resultSet.getString("teamCity"));
                    team.setTeamCompLevel(resultSet.getString("teamCompLevel"));
                    teams.add(team);
                }
            }
        });

        return teams;
    }


}
