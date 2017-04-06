<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta name="google-signin-client_id" content="874074052748-hsjcp5bhstjnp8osn72ktpgaq16kk1ia.apps.googleusercontent.com">
  <link rel="shortcut icon" href="../../resources/images/favicon.ico" type="image/x-icon"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="../../resources/css/home.css">
  <script src="../../resources/js/jquery.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <title>Home</title>
</head>

<body>

  <%-- NavBar --%>
  <nav class="navbar navbar-default">
    <div class="container-fluid noPadding">

      <%-- ClassQA Logo --%>
      <img id="nav-logo" src="../../resources/images/logo.png" alt="Logo">

      <!-- Add Class Button -->
      <button type="button" class="btn btn-org navbar-btn" data-toggle="modal" data-target="#addModal">Add Class</button>

      <!-- Add Class Modal -->
      <div id="addModal" class="modal fade" role="dialog">
        <div class="modal-dialog">

          <!-- Modal content-->
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h4 class="modal-title">Add Class</h4>
            </div>
            <div class="modal-body">
              <label>Course Code</label>
              <input id="addCrsCode" type="text" name="" value="">

              <label>Password</label>
              <input id="addCrsPassword" type="text" name="" value="">

            </div>
            <div class="modal-footer">
              <button id="addClassBtn" type="submit" class="btn btn-success">Add Class</button>
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
          </div>

        </div>
      </div>

      <%-- Create Class Button --%>
      <button type="button" class="btn btn-org navbar-btn" data-toggle="modal" data-target="#createModal">Create Class</button>

      <!-- Create Class Modal -->
      <div id="createModal" class="modal fade" role="dialog">
        <div class="modal-dialog">

          <!-- Modal content-->
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h4 class="modal-title">Create Class</h4>
            </div>
            <div class="modal-body">
              <label>Course Code</label>
              <input id="createCrsCode" type="text" name="" value="">

              <label>Password</label>
              <input id="createCrsPassword" type="text" name="" value="">

              <div class="row">
                <div class="col-md-12">
                  <label>Additional Info</label><br>
                  <textarea id="moreInfo" name="name" placeholder="..."></textarea>
                </div>
              </div>

            </div>
            <div class="modal-footer">
              <button id="createClassBtn" type="submit" class="btn btn-success">Create Class</button>
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
          </div>
        </div>
      </div>

      <!-- Load Class Button -->

      <button id="loadClassBtn" type="button" class="btn navbar-btn btn-org">Load ClassPage</button>

      <a href="/landing" onclick="signOut();" style="float:right">Sign out</a>
    </div>
  </nav>

  <%-- Content. --%>

  <div>
    <h1> ${sessionUser.firstName} ${sessionUser.lastName} HOME PAGE</h1>

    <c:choose>
      <c:when test="${sessionUser.professor == true}">
        <p>Professor</p>
      </c:when>
      <c:otherwise>
        <p>Student</p>
      </c:otherwise>
    </c:choose>

    <h1> Enrolled Courses:</h1>
    <c:forEach items="${sessionUser.courses}" var="course">
      <h1 id="${course.id}">${course.courseCode}</h1>
      <p>${course.info}<p>
    </c:forEach>

  </div>


  <div class="footer">
    <div class="container-fluid noPadding">

    </div>
  </div>

  <%-- JAVASCRIPTS --%>

  <script src="../../resources/js/logout.js"></script>
  <script src="https://apis.google.com/js/platform.js?onload=onLoad" async defer></script>
  <%-- load button funcions --%>
  <script src="../../resources/js/home.js"></script>
</body>
</html>
