<%--<jsp:useBean id="players" scope="request" type="java.util.List<com.patmullins.soccerleague.domain.Player>"/>--%>
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
com.patmullins.soccerleague.domain.Player playerEntry = (com.patmullins.soccerleague.domain.Player) request.getAttribute("playerEntry");
%>
<p>Player registration is now completed. Please review your entered information.<br>
<p><a href="/PlayerServlet">All Players</a><br>
<br>
<b>Player Name:</b> <%= playerEntry.getFirstName() + " " + playerEntry.getLastName()%><br>
<b>Position:</b> <%= playerEntry.getPosition()%><br>
<b>Country:</b> <%= playerEntry.getCountry()%><br>
<b>Jersey:</b> <%= playerEntry.getJersey()%>
</body>
</html>
