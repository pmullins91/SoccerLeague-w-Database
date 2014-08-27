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
            <h3 class="panel-title">Player Registration Form</h3>
        </div>
        <div class="panel-body">

<div class="bs-example">
    <form method="post" action="${pageContext.request.contextPath}/displayPlayers">
            <div class="form-group">
            <label for="firstName" class="control-label col-xs-2">First Name: </label>
            <div class="col-xs-10">
                <input type="text" class="form-control" id="firstName" name="firstName" >
            </div>
        </div>
        <br>
        <br>
        <br>




        <div class="form-group">
            <label for="lastName" class="control-label col-xs-2">Last Name: </label>
            <div class="col-xs-10">
                <input type="text" class="form-control" id="lastName" name="lastName" >
            </div>
        </div>
        <br>
        <br>





        <div class="form-group">
            <label for="position" class="control-label col-xs-2">Position: </label>
            <div class="col-xs-10">
                <select  class="form-control" id="position" name="position">
                <option></option>
                <option>GK</option>
                <option>LB</option>
                <option>LWB</option>
                <option>CB</option>
                <option>RB</option>
                <option>RWB</option>
                <option>CDM</option>
                <option>LM</option>
                <option>CM</option>
                <option>RM</option>
                <option>CAM</option>
                <option>LW</option>
                <option>RW</option>
                <option>CF</option>
                </select>
            </div>
        </div>
        <br>
        <br>



        <div class="form-group">
            <label for="country" class="control-label col-xs-2">Country: </label>
            <div class="col-xs-10">
                <select  class="form-control" id="country" name="country">
                    <option></option>
                    <option>United States</option>
                    <option>Mexico</option>
                    <option>Canada</option>
                    <option>Germany</option>
                    <option>Spain</option>
                    <option>Italy</option>
                    <option>France</option>
                    <option>Brazil</option>
                </select>
            </div>
        </div>
        <br>
        <br>


        <div class="form-group">
            <label for="jersey" class="control-label col-xs-2">Jersey: </label>
            <div class="col-xs-10">
                <input type="number" class="form-control" id="jersey" name="jersey" min="0" max="99">
            </div>
        </div>
        <br>
        <br>

        <div class="form-group">
            <label for="compLevel" class="control-label col-xs-2">Desired Competition Level: </label>
            <div class="col-xs-10">
                <select  class="form-control" id="compLevel" name="compLevel">
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
