<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta name="google-signin-client_id" content="874074052748-hsjcp5bhstjnp8osn72ktpgaq16kk1ia.apps.googleusercontent.com">
</head>

<body>

  <nav class="navbar navbar-default">
    <div class="container-fluid noPadding">

      <%-- ClassQA Logo --%>
      <img id="nav-logo" src="../../resources/images/logo.png" alt="Logo">


        <a href="/landing"><button class="btn btn-org navbar-btn" type="button" name="button" onclick="signOut();" style="float:right" >Sign out</button></a>
    </div>
  </nav>



  <div>
    QA PAGE
  </div>


  <header>
    <a href="/home">Put Logo Here</a>
    <a href="#">Add Class</a>
    <a href="/landing" onclick="signOut();">Sign out</a>
  </header>

  <script src="../../resources/js/logout.js"></script>
  <script src="https://apis.google.com/js/platform.js?onload=onLoad" async defer></script>
</body>
</html>
