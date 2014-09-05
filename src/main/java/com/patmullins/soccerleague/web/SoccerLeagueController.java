package com.patmullins.soccerleague.web;

import com.patmullins.soccerleague.domain.Player;
import com.patmullins.soccerleague.domain.PlayerPayCheck;
import com.patmullins.soccerleague.repository.*;

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

//        else if (userPath.equals("/payCheckList")){
//
//            PayCheckRepositoryImpl repository = new PayCheckRepositoryImpl();
//
//            List<PlayerPayCheck> payChecks = repository.findAllPayChecks();
//            request.setAttribute("payChecks", payChecks);
//
//            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/displayAllPayChecks.jsp");
//            view.forward(request, response);
//        }

         if (userPath.equals("/playerList")){

            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findAllPlayers();
            request.setAttribute("players", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayAllPlayers.jsp");
            view.forward(request, response);
        }

        else if(userPath.equals("/arsenalTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findArsenalPlayers();
            request.setAttribute("arsenalPlayers", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayArsenalPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/astonVillaTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findAstonVillaPlayers();
            request.setAttribute("astonVilla", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayAstonVillaPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/barnsleyTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findBarnsleyPlayers();
            request.setAttribute("barnsley", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayBarnsleyPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/crystalPalaceTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findCrystalPalacePlayers();
            request.setAttribute("crystalPalace", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayCrystalPalacePlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/evertonTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findEvertonPlayers();
            request.setAttribute("everton", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayEvertonPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/hullCityTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findHullCityPlayers();
            request.setAttribute("hullCity", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayHullCityPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/leicasterCityTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findLeicasterCityPlayers();
            request.setAttribute("leicasterCity", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayLeicasterCityPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/liverpoolTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findLiverpoolPlayers();
            request.setAttribute("liverpool", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayLiverpoolPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/manchesterCityTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findManchesterCityPlayers();
            request.setAttribute("manchesterCity", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayManchesterCityPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/manchesterUnitedTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findManchesterUnitedPlayers();
            request.setAttribute("manchesterUnited", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayManchesterUnitedPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/newcastleUnitedTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findNewcastleUnitedPlayers();
            request.setAttribute("newcastleUnited", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayNewcastleUnitedPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/queensParkRangersTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findQueensParkRangersPlayers();
            request.setAttribute("queensParkRangers", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayQueensParkRangersPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/southamptonTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findSouthamptonPlayers();
            request.setAttribute("southampton", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displaySouthamptonPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/stokeCityTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findStokeCityPlayers();
            request.setAttribute("stokeCity", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayStokeCityPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/sunderlandTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findSunderlandPlayers();
            request.setAttribute("sunderland", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displaySunderlandPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/swanseaTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findSwanseaPlayers();
            request.setAttribute("swansea", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displaySwanseaPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/tottenhamTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findTottenhamPlayers();
            request.setAttribute("tottenham", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayTottenhamPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/westBromTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findWestBromPlayers();
            request.setAttribute("westBrom", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayWestBromPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/westHamTeams")){
            PlayersRepositoryImpl repository = new PlayersRepositoryImpl();

            List<Player> players = repository.findWestHamPlayers();
            request.setAttribute("westHam", players);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/playerTeamSelection/displayWestHamPlayers.jsp");
            view.forward(request, response);

        }
        else if(userPath.equals("/payCheckList")){
           PayCheckRepositoryImpl repository = new PayCheckRepositoryImpl();

            List<PlayerPayCheck> playerPayCheckEntry = repository.findAllPayChecks();
            request.setAttribute("playerPayCheckEntry", playerPayCheckEntry);

            RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/displayAllPayChecks.jsp");
            view.forward(request, response);

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userPath = request.getServletPath();

        if (userPath.equals("/displayPlayers")) {
        PlayersRepository repository = new PlayersRepositoryImpl();

        Player playerEntry = new Player();
        playerEntry.setFirstName(request.getParameter("firstName"));
        playerEntry.setLastName(request.getParameter("lastName"));
        playerEntry.setPlayerTeamName(request.getParameter("playerTeamName"));
        playerEntry.setPosition(request.getParameter("position"));
        playerEntry.setCountry(request.getParameter("country"));
        playerEntry.setJersey(Integer.parseInt(request.getParameter("jersey")));

        request.setAttribute("playerEntry", playerEntry);

        repository.save(playerEntry);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/successfulPlayerRegistration.jsp");
        view.forward(request, response);
        }


            else if (userPath.equals("/displayPayChecks")) {

                PayCheckRepository repository = new PayCheckRepositoryImpl();

                PlayerPayCheck playerPayCheckEntry = new PlayerPayCheck();
                playerPayCheckEntry.setFirstName(request.getParameter("firstName"));
                playerPayCheckEntry.setLastName(request.getParameter("lastName"));
                playerPayCheckEntry.setDivision(request.getParameter("playerDivision"));
                playerPayCheckEntry.setChampions(request.getParameter("playerChampions"));
                playerPayCheckEntry.setPlayerAge(Integer.parseInt(request.getParameter("playerAge")));
                playerPayCheckEntry.setGoalsSaved(Integer.parseInt(request.getParameter("goalsSaved")));
                playerPayCheckEntry.setGoalsScored(Integer.parseInt(request.getParameter("goalsScored")));

                request.setAttribute("playerPayCheckEntry", playerPayCheckEntry);

                repository.save(playerPayCheckEntry);

                RequestDispatcher view = getServletContext().getRequestDispatcher("/Player/successfulPayCheck.jsp");
                view.forward(request, response);
            }

    }
}


