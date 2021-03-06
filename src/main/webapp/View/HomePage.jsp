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
<div class="container">
    <div class="jumbotron">
        <center><h1>Premier League</h1>
        <p>Top level soccer with English flare.<center><a href="../Player/playerRegistrationForm.jsp" class="btn btn-danger btn-lg">Get started today</a></center></p>
        </center>
    </div>
    <%--<div class="row">--%>
        <%--<div class="col-xs-4">--%>
            <%--<h2>Premier Teams</h2>--%>
            <%--<p>View all the teams that are registered in the Premier League. Find out what team is eligible to play with and see which is full. </p>--%>
            <%--<p><a href="PremiereLeaguePage.jsp" class="btn btn-danger">Learn More &raquo;</a></p>--%>
        <%--</div>--%>
        <%--<div class="col-xs-4">--%>
            <%--<h2>League Table</h2>--%>
            <%--<p>View the results of the Premier League.</p>--%>
            <%--<p><a href="2ndLeaguePage.jsp" class="btn btn-danger">Learn More &raquo;</a></p>--%>
        <%--</div>--%>
        <%--<div class="col-xs-4">--%>
            <%--<h2>Player Statistics</h2>--%>
            <%--<p>View all the players stats throughout the season.</p>--%>
            <%--<p><a href="CoedPage.jsp" class="btn btn-danger">Learn More &raquo;</a></p>--%>
        <%--</div>--%>
    <%--</div>--%>
    <hr>
    <div class="row">
        <div class="col-xs-12">
            <footer>
                <center><p>&copy; Mullins DSM Soccer League</p></center>
            </footer>
        </div>
    </div>
</div>
</body>
</html>

