<%@ page import="java.util.List" %>
<%@ page import="com.patmullins.soccerleague.domain.Player" %>
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
                        <li><a href="/Player/payCheckForm.jsp">Compensation</a></li>
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

<%
com.patmullins.soccerleague.domain.Player playerEntry = (com.patmullins.soccerleague.domain.Player) request.getAttribute("playerEntry");
%>
<center>
<h3>Player registration is now completed. Please review your entered information.</h3><br>

<h5><b>Player Name:</b> <%= playerEntry.getFirstName() + " " + playerEntry.getLastName()%><br></h5>
    <h5><b>Team: </b> <%= playerEntry.getPlayerTeamName()%></h5>
    <h5><b>Position:</b> <%= playerEntry.getPosition()%><br></h5>
    <h5><b>Country:</b> <%= playerEntry.getCountry()%><br></h5>
    <h5><b>Jersey:</b> <%= playerEntry.getJersey()%></h5>


</center>
<center><a hre f="../View/HomePage.jsp" class="btn btn-primary btn-sm">Home</a></center>
</body>
</html>
