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

    @Override
    public List<Player> findAstonVillaPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Aston Villa'", new SQLQueryWrapper() {
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

    @Override
    public List<Player> findBarnsleyPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Barnsley'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findCrystalPalacePlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Crystal Palace'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findEvertonPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Everton'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findHullCityPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Hull City'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findLeicasterCityPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Leicaster City'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findLiverpoolPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Liverpool'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findManchesterCityPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Manchester City'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findManchesterUnitedPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Manchester United'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findNewcastleUnitedPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Newcastle United'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findQueensParkRangersPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Queens Park Rangers'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findSouthamptonPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Southampton'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findStokeCityPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Stoke City'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findSunderlandPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Sunderland'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findSwanseaPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Swansea'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findTottenhamPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='Tottenham'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findWestBromPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='West Brom'", new SQLQueryWrapper() {
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

        return players;    }

    @Override
    public List<Player> findWestHamPlayers() {
        final ArrayList<Player> players = new ArrayList<Player>();
        jdbcTemplate.query("select * from Players where playerTeamName='West Ham'", new SQLQueryWrapper() {
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

        return players;    }
}
