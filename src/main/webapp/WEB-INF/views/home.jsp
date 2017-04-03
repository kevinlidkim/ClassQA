<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta name="google-signin-client_id" content="874074052748-hsjcp5bhstjnp8osn72ktpgaq16kk1ia.apps.googleusercontent.com">
  <link rel="shortcut icon" href="../../resources/images/favicon.ico" type="image/x-icon"/>
  <script src="../../resources/js/jquery.js"></script>
  <script src="../../resources/js/foundation.min.js"></script>
  <script src="../../resources/js/what-input.js"></script>

  <link rel="stylesheet" href="../../resources/css/foundation.min.css">
  <link rel="stylesheet" href="../../resources/css/home.css">

  <title>Home</title>
</head>

<body>

  <%-- ADDING CLASS BUTTON --%>
  <a class="button" data-open="addModal">Add Class</a>

  <%-- ADDING CLASS MODAL --%>
  <div class="reveal" id="addModal" data-reveal>

    <div class="revealHeader">
      Add Class
    </div>

    <form class="" action="/addCourse" method="post">
      <div class="row">
        <div class="large-6 medium-6 columns">
          <label>Class Id:</label>
          <input type="text" name="classId" value="">
        </div>
        <div class="large-6 medium-6 columns">
          <label>Password</label>
          <input type="text" name="classPw" value="">
        </div>

        <input class="sucess button" type="submit" name="" value="Add Class">
      </div>
    </form>

    <button class="close-button" data-close aria-label="Close modal" type="button">
      <span aria-hidden="false">&times;</span>
    </button>
  </div>

  <%-- CREATING CLASS BUTTON --%>
  <a class="button" data-open="createModal">Create Class</a>

  <%-- CREATING CLASS MODAL --%>
  <div class="reveal" id="createModal" data-reveal>

    <div class="revealHeader">
      Create Class
    </div>

    <form class="" action="/createCourse" method="post">
      <div class="row">
        <div class="large-6 medium-6 columns">
          <label>Class Id:</label>
          <input type="text" name="classId" value="">
        </div>
        <div class="large-6 medium-6 columns">
          <label>Password</label>
          <input type="text" name="classPw" value="">
        </div>
      </div>

      <div class="row">
        <div class="large-12 medium-12 columns">
          <label>Additional Info</label>
          <textarea placeholder="..."></textarea>
        </div>
      </div>

      <input class="sucess button" type="submit" name="" value="Create Class">

    </form>

    <button class="close-button" data-close aria-label="Close modal" type="button">
      <span aria-hidden="false">&times;</span>
    </button>
  </div>

  <%-- CREATING CLASS MODAL --%>
  <form class="" action="/classPage" method="post">
    <input class="button" type="submit" name="" value="class Page">
  </form>


  <a href="#" onclick="signOut();">Sign out</a>
  <%-- ACTIVATE FOUNDATION --%>
  <script>
    $(document).foundation();
  </script>
  <script src="../../logout.js"></script>
  <script src="https://apis.google.com/js/platform.js?onload=onLoad" async defer></script>
</body>
</html>
