<%@ page import="java.util.List" %>
<%@ page import="com.patmullins.soccerleague.domain.Player" %>
<html>
<head>
    <LINK REL="stylesheet" HREF="../layout.css" TYPE="text/css">
</head>

<ul id="nav">
    <center>
        <li><a href="../HomePage.jsp">Home</a></li>
        <li><a href="playerRegistrationForm.jsp">Player Registration</a></li>
        <li><a href="../Team/TeamInfo.jsp">Team Registration</a></li>
    </center>
</ul>
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

