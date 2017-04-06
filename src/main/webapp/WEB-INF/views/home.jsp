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
  <%@ include file="../components/navbar.jsp"%>
  <%-- NavBar End --%>

  <%-- Content. --%>

  <div class="container">
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
  <footer class="footer">
      <div class="container footer-container">
        <div class="row">
          <div class="col-md-6">
            <img id="nav-logo" src="../../resources/images/logo.png" alt="Logo">
          </div>
          <div class="col-md-6">
            <div class="">
              <a href="#">Contact Us</a>
            </div>
            <div class="">
              <a href="#">About Team</a>
            </div>
            <div class="">
              <a href="#">Send Us Feedback!</a>
            </div>
          </div>
        </div>
      </div>
  </footer>

  <%-- JAVASCRIPTS --%>

  <script src="../../resources/js/logout.js"></script>
  <script src="https://apis.google.com/js/platform.js?onload=onLoad" async defer></script>
  <%-- load button funcions --%>
  <script src="../../resources/js/home.js"></script>
</body>
</html>
