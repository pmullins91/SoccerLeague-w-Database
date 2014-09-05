<%@ page import="java.util.List" %>
<%@ page import="com.patmullins.soccerleague.domain.PlayerPayCheck" %>
<%@ page import="com.patmullins.soccerleague.repository.PayCheckRepositoryImpl" %>
<%@ page import="java.sql.Ref" %>
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
        body{
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
            <a class="navbar-brand" href="../../View/HomePage.jsp">DSMSL</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="nav navbar-nav">
                <li><a href="../../View/HomePage.jsp" >Home</a></li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Players <b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href=../Player/playerRegistrationForm.jsp>Player Registration</a></li>
                        <li><a href="/playerList">Registered Players</a></li>
                        <li><a href="../payCheckForm.jsp">Compensation</a></li>
                        <%--<li class="divider"></li>--%>
                        <%--<li><a href="#">Trash</a></li>--%>
                    </ul>
                </li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Teams <b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href="../Player/playerTeamSelection/TeamSelection.jsp">View Teams</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<h2><center>Pay Check Form Information</center></h2>
<%

    List<PlayerPayCheck> playerPayChecks = (List<PlayerPayCheck>) request.getAttribute("playerPayCheckEntry");
%>

<div class="bs-example">
    <table class="table table-striped">
        <thead>
        <tr>

            <th>Name</th>
            <th>Division</th>
            <th>Champions</th>
            <th>Goals Scored</th>
            <th>Goals Saved</th>
            <th>Age</th>


        </tr>
        </thead>
        <tbody>
        <tr>
            <% for (PlayerPayCheck playerPayCheck : playerPayChecks) { %>

            <td><%=playerPayCheck.getFirstName() %> <%=playerPayCheck.getLastName() %></td>
            <td><%=playerPayCheck.getDivision() %></td>
            <td><%=playerPayCheck.getChampions() %></td>
            <td><%=playerPayCheck.getGoalsScored() %></td>
            <td><%=playerPayCheck.getGoalsSaved() %></td>
            <td><%=playerPayCheck.getPlayerAge() %></td>


        </tr>

        <% } %>

        </tbody>
    </table>

</div>


</body>
</html>

