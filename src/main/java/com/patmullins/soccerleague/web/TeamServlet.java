package com.patmullins.soccerleague.web;

import com.patmullins.soccerleague.domain.Team;
import com.patmullins.soccerleague.repository.TeamsRepository;
import com.patmullins.soccerleague.repository.TeamsRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class TeamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TeamsRepositoryImpl repository = new TeamsRepositoryImpl();

        List<Team> teams = repository.findAllTeams();
        request.setAttribute("teams", teams);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/Team/displayAllTeams.jsp");
        view.forward(request, response);
    }


}