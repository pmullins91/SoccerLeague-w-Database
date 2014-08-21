<%@ page import="java.util.List" %>
<%@ page import="com.patmullins.soccerleague.domain.Player" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Des Moines Soccer League</title>
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
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="../HomePage.jsp">DSMSL</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="nav navbar-nav">
                <li><a href="HomePage.jsp" target="_blank">Home</a></li>
                <li><a href="../Player/playerRegistrationForm.jsp" target="_blank">Player Registration</a></li>
                <li class="active"><a href="/PlayerServlet" target="_blank">Registered Players</a></li>
            </ul>
        </div>
    </div>
</nav>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Des Moines Soccer League</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <style type="text/css">
        .bs-example{
            margin: 20px;
        }
    </style>
</head>
<body>
<%
    List<Player> players = (List<Player>)request.getAttribute("players");
%>
<table align="center" border=".5" style="width:600px">
    <tr>

        <td width="30%">Name</td>
        <td width="20%">Position</td>
        <td width="20%">Country</td>
        <td width="20%">Jersey</td>

    </tr>
    <% for(Player player : players) { %>
<table align="center" border=".5" style="width:600px">

    <tr>

        <td width="30%"><%=player.getFirstName() %>
        <%=player.getLastName() %>
        <td width="20%"><%=player.getPosition() %></td>
        <td width="20%"><%=player.getCountry() %></td>
        <td width="20%"><%=player.getJersey() %></td>

    </tr>
<% } %>
</body>

</html>

