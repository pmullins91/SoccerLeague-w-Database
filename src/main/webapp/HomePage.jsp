
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