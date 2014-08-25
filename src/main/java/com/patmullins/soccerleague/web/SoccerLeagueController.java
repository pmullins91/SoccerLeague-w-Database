package com.patmullins.soccerleague.web;

import com.patmullins.soccerleague.domain.Player;
import com.patmullins.soccerleague.domain.Team;
import com.patmullins.soccerleague.repository.PlayersRepository;
import com.patmullins.soccerleague.repository.PlayersRepositoryImpl;
import com.patmullins.soccerleague.repository.TeamsRepository;
import com.patmullins.soccerleague.repository.TeamsRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class SoccerLeagueController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userPath = request.getServletPath();

        if (userPath.equals("/Players/playerRegistrationForm.jsp")){
        PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

        List<Player> players = repository.findAllPlayers();
        request.setAttribute("players", players);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/displayAllTeams.jsp");
        view.forward(request, response);
    }
    else if (userPath.equals("/Team/teamRegistrationForm.jsp")){
            TeamsRepositoryImpl repository = new TeamsRepositoryImpl();

        List<Team> teams = repository.findAllTeams();
        request.setAttribute("teams", teams);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/Team/displayAllTeams.jsp");
        view.forward(request, response);
    }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userPath = request.getServletPath();

        if (userPath.equals("/Players/playerRegistrationForm.jsp")) {
        PlayersRepository repository = new PlayersRepositoryImpl();

        Player playerEntry = new Player();
        playerEntry.setFirstName(request.getParameter("firstName"));
        playerEntry.setLastName(request.getParameter("lastName"));
        playerEntry.setPosition(request.getParameter("position"));
        playerEntry.setCountry(request.getParameter("country"));
        playerEntry.setJersey(Integer.parseInt(request.getParameter("jersey")));

        request.setAttribute("playerEntry", playerEntry);

        repository.save(playerEntry);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/successfulTeamRegistration.jsp");
        view.forward(request, response);
        }
        else if (userPath.equals("/Team/teamRegistrationForm.jsp")){
            TeamsRepository repository = new TeamsRepositoryImpl();

            Team teamEntry = new Team();
            teamEntry.setTeamName(request.getParameter("teamName"));
            teamEntry.setTeamCity(request.getParameter("teamCity"));
            teamEntry.setTeamCompLevel(request.getParameter("teamCompLevel"));

            request.setAttribute("teamEntry", teamEntry);

            repository.save(teamEntry);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Team/successfulTeamRegistration.jsp");
            view.forward(request, response);
        }
    }


}