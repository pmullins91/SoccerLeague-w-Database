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
            <a class="navbar-brand" href="../View/HomePage.jsp">DSMSL</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="nav navbar-nav">
                <li><a href="../View/HomePage.jsp" >Home</a></li>
                <%--<li><a href="../Player/teamRegistrationForm.jsp" >Player Registration</a></li>--%>
                <%--<li><a href="/PlayerServlet" >Registered Players</a></li>--%>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Players <b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href=../Player/playerRegistrationForm.jsp>Player Registration</a></li>
                        <li><a href="/PlayerServlet">Registered Players</a></li>
                        <li><a href="#">Available Players</a></li>
                        <%--<li class="divider"></li>--%>
                        <%--<li><a href="#">Trash</a></li>--%>
                    </ul>
                </li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Teams <b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href="../Team/teamRegistrationForm.jsp">Team Registration</a></li>
                        <li><a href="/TeamServlet">Registered Teams</a></li>
                        <li><a href="#">Team Selection</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="bs-example">
    <div class="panel panel-warning">
        <div class="panel-heading">
            <h3 class="panel-title">Team Registration Form</h3>
        </div>
        <div class="panel-body">

<div class="bs-example">
    <form method="post" action="${pageContext.request.contextPath}/TeamServlet">
            <div class="form-group">
            <label for="teamName" class="control-label col-xs-2">Team Name: </label>
            <div class="col-xs-10">
                <input type="text" class="form-control" id="teamName" name="teamName" >
            </div>
        </div>
        <br>
        <br>
        <br>




        <div class="form-group">
            <label for="teamCity" class="control-label col-xs-2">Team City: </label>
            <div class="col-xs-10">
                <input type="text" class="form-control" id="teamCity" name="teamCity" >
            </div>
        </div>
        <br>
        <br>

        <div class="form-group">
            <label for="teamCompLevel" class="control-label col-xs-2">Desired Competition Level: </label>
            <div class="col-xs-10">
                <select  class="form-control" id="teamCompLevel" name="teamCompLevel">
                    <option></option>
                    <option>Premiere League</option>
                    <option>2nd Division</option>
                    <option>Coed</option>
                </select>
            </div>
        </div>
        <br>
        <br>
        <div class="form-group">
            <div class="col-xs-offset-2 col-xs-10">
                <button type="submit" class="btn btn-danger">Submit</button>
            </div>
        </div>
        <br>
        <br>

    </form>
</div>
    </div>
    </div>
    </div>
</body>
</html>
