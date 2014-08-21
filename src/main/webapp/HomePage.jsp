<%--<!DOCTYPE html>--%>
<%--<head>--%>
    <%--<link rel="stylesheet" type="text/css" href="layout.css">--%>
    <%--<meta charset="utf-8">--%>
    <%--<title>Des Moines Soccer League</title>--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
    <%--<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">--%>
<%--</head>--%>
<%--<nav role="navigation" class="navbar navbar-default">--%>
    <%--<!-- Brand and toggle get grouped for better mobile display -->--%>
    <%--<div class="navbar-header">--%>
        <%--<button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">--%>
            <%--<span class="sr-only">Toggle navigation</span>--%>
            <%--<span class="icon-bar"></span>--%>
            <%--<span class="icon-bar"></span>--%>
            <%--<span class="icon-bar"></span>--%>
        <%--</button>--%>
        <%--<a href="#" class="navbar-brand">DSMSL</a>--%>
    <%--</div>--%>
    <%--<!-- Collection of nav links, forms, and other content for toggling -->--%>
    <%--<div id="navbarCollapse" class="collapse navbar-collapse">--%>
        <%--<ul class="nav navbar-nav">--%>
            <%--<li class="active"><a href="../HomePage.jsp">Home</a></li>--%>
            <%--<li><a href="../Player/playerRegistrationForm.jsp">Player Registration</a></li>--%>
            <%--<li class="dropdown">--%>
                <%--<a data-toggle="dropdown" class="dropdown-toggle" href="#">View All Players <b class="caret"></b></a>--%>
                <%--<ul role="menu" class="dropdown-menu">--%>
                    <%--<li><a href="#">Inbox</a></li>--%>
                    <%--<li><a href="#">Drafts</a></li>--%>
                    <%--<li><a href="#">Sent Items</a></li>--%>
                    <%--<li class="divider"></li>--%>
                    <%--<li><a href="#">Trash</a></li>--%>
                <%--</ul>--%>
            <%--</li>--%>
        <%--</ul>--%>
        <%--<form role="search" class="navbar-form navbar-left">--%>
            <%--<div class="form-group">--%>
                <%--<input type="text" placeholder="Search" class="form-control">--%>
            <%--</div>--%>
        <%--</form>--%>
        <%--<ul class="nav navbar-nav navbar-right">--%>
            <%--<li><a href="#">Login</a></li>--%>
        <%--</ul>--%>
    <%--</div>--%>
<%--</nav>--%>
<%--&lt;%&ndash;<body>&ndash;%&gt;--%>
<%--&lt;%&ndash;</body>&ndash;%&gt;--%>
<%--&lt;%&ndash;<h1>&ndash;%&gt;--%>
    <%--&lt;%&ndash;Des Moines Soccer League&ndash;%&gt;--%>
<%--&lt;%&ndash;</h1>&ndash;%&gt;--%>

<%--&lt;%&ndash;<ul id="nav">&ndash;%&gt;--%>
    <%--&lt;%&ndash;<center>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<li class="active"><a href="#">Home</a></li>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<li><a href="Player/playerRegistrationForm.jsp">Player Registration</a></li>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<li><a href="/PlayerServlet">Registered Players</a></li>&ndash;%&gt;--%>

    <%--&lt;%&ndash;</center>&ndash;%&gt;--%>
<%--&lt;%&ndash;</ul>&ndash;%&gt;--%>
<%--<script src="http://code.jquery.com/jquery.min.js"></script>--%>
<%--<script src="bootstrap/js/bootstrap.min.js"></script>--%>
<%--&lt;%&ndash;<hr>&ndash;%&gt;--%>
<%--&lt;%&ndash;<div class="footer">&ndash;%&gt;--%>
    <%--&lt;%&ndash;<p>&copy; Mullins 2014</p>&ndash;%&gt;--%>
<%--&lt;%&ndash;</div>&ndash;%&gt;--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Twitter Bootstrap 3 Fixed Layout Example</title>
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
            </button>
            <a class="navbar-brand" href="#">DSMSL</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="HomePage.jsp" target="_blank">Home</a></li>
                <li><a href="../Player/playerRegistrationForm.jsp" target="_blank">Player Registration</a></li>
                <li><a href="/PlayerServlet" target="_blank">Registered Players</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="jumbotron">
        <h1>Des Moines Soccer League</h1>
        <p>Bringing you a inner city soccer league, sign up now and enjoy a competitive edge.<center><a href="../Player/playerRegistrationForm.jsp" target="_blank" class="btn btn-success btn-lg">Get started today</a></center></p>
    </div>
    <div class="row">
        <div class="col-xs-4">
            <h2>Premiere League</h2>
            <p>The premiere league one of the most competitive leagues you can find. The top team across Iowa try to win, the strongest competition ou there.</p>
            <p><a href="premierLeaguePage.jsp" target="_blank" class="btn btn-success">Learn More &raquo;</a></p>
        </div>
        <div class="col-xs-4">
            <h2>2nd Division</h2>
            <p>The 2nd division is a strong league of teams that have the desire to play in the premiere league but have yet to make it.</p>
            <p><a href="2ndDivisionPage.jsp" target="_blank" class="btn btn-success">Learn More &raquo;</a></p>
        </div>
        <div class="col-xs-4">
            <h2>Coed</h2>
            <p>Coed is a mixture of men and women, a less competitive league but promised to have a lot of fun.</p>
            <p><a href="coedPage.jsp" target="_blank" class="btn btn-success">Learn More &raquo;</a></p>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-xs-12">
            <footer>
                <p>&copy; Mullins DSM Soccer League</p>
            </footer>
        </div>
    </div>
</div>
</body>
</html>