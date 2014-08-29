<%@ page import="com.patmullins.soccerleague.repository.PlayersRepositoryImpl" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Premier League</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <style type="text/css">
        body {
            padding-top: 70px;
        }
    </style>
</head>
<body>

<nav id="myNavbar" class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>

            </button>
            <a class="navbar-brand" href="HomePage.jsp">DSMSL</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="nav navbar-nav">
                <li><a href="HomePage.jsp" >Home</a></li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Players <b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href=../Player/playerRegistrationForm.jsp>Player Registration</a></li>
                        <li><a href="/playerList">Registered Players</a></li>
                        <li><a href="#">Available Players</a></li>
                        <%--<li class="divider"></li>--%>
                        <%--<li><a href="#">Trash</a></li>--%>
                    </ul>
                </li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Teams <b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href="../Team/teamRegistrationForm.jsp">Team Registration</a></li>
                        <li><a href="/teamList">Registered Teams</a></li>
                        <li><a href="../View/TeamSelection.jsp">Team Selection</a></li>
                        <%--<li class="divider"></li>--%>
                        <%--<li><a href="#">Trash</a></li>--%>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<%
    PlayersRepositoryImpl repository = new PlayersRepositoryImpl();%>

<div class="bs-example">
    <table class="table table-striped">
        <thead>
        <tr>

            <th>Team Name</th>
            <th>Total Players</th>


        </tr>
        </thead>
        <tbody>

        <tr>
            <td><a href=../arsenalTeams>Arsenal</a></td>
            <td><%=repository.findArsenalPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../astonVillaTeams>Aston Villa</a></td>
            <td><%=repository.findAstonVillaPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../barnsleyTeams>Barnsley</a></td>
            <td><%=repository.findBarnsleyPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../crystalPalaceTeams>Crystal Palace</a></td>
            <td><%=repository.findCrystalPalacePlayers().size() %> </td>

        </tr>

        <tr>
            <td><a href=../evertonTeams>Everton</a></td>
            <td><%=repository.findEvertonPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../hullCityTeams>Hull City</a></td>
            <td><%=repository.findHullCityPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../leicasterCityTeams>Leicaster City</a></td>
            <td><%=repository.findLeicasterCityPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../liverpoolTeams>Liverpool</a></td>
            <td><%=repository.findLiverpoolPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../manchesterCityTeams>Manchester City</a></td>
            <td><%=repository.findManchesterCityPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../manchesterUnitedTeams>Manchester United</a></td>
            <td><%=repository.findManchesterUnitedPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../newcastleUnitedTeams>Newcastle United</a></td>
            <td><%=repository.findNewcastleUnitedPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../queensParkRangersTeams>Queens Park Rangers</a></td>
            <td><%=repository.findQueensParkRangersPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../southamptonTeams>Southampton</a></td>
            <td><%=repository.findSouthamptonPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../stokeCityTeams>Stoke City</a></td>
            <td><%=repository.findStokeCityPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../sunderlandTeams>Sunderland</a></td>
            <td><%=repository.findSunderlandPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../swanseaTeams>Swansea</a></td>
            <td><%=repository.findSwanseaPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../tottenhamTeams>Tottenham</a></td>
            <td><%=repository.findTottenhamPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../westBromTeams>West Brom</a></td>
            <td><%=repository.findWestBromPlayers().size() %> </td>
        </tr>

        <tr>
            <td><a href=../westHamTeams>West Ham</a></td>
            <td><%=repository.findWestHamPlayers().size() %> </td>
        </tr>


        </tbody>
    </table>

</div>
