package com.patmullins.soccerleague.web;

import com.patmullins.soccerleague.domain.Player;
import com.patmullins.soccerleague.repository.PlayersRepository;
import com.patmullins.soccerleague.repository.PlayersRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class PlayerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PlayersRepository repository = new PlayersRepositoryImpl();

        Player playerEntry = new Player();
        playerEntry.setFirstName(request.getParameter("firstName"));
        playerEntry.setLastName(request.getParameter("lastName"));
        playerEntry.setPosition(request.getParameter("position"));
        playerEntry.setCountry(request.getParameter("country"));
        playerEntry.setJersey(Integer.parseInt(request.getParameter("jersey")));

        request.setAttribute("playerEntry", playerEntry);

        repository.save(playerEntry);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/successfulPlayerRegistration.jsp");
        view.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

        List<Player> players = repository.findAllPlayers();
        request.setAttribute("players", players);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/displayAllPlayers.jsp");
        view.forward(request, response);

    }


}