<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta name="google-signin-client_id" content="874074052748-hsjcp5bhstjnp8osn72ktpgaq16kk1ia.apps.googleusercontent.com">
  <link rel="shortcut icon" href="../../resources/images/favicon.ico" type="image/x-icon"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="../../resources/css/main.css">
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
      <h1 id="${course.id}" class="clickOnCourse">${course.courseCode}</h1>
      <button onClick="loadCourse(${course.id})">load course</button>
      <p>${course.info}<p>
    </c:forEach>

    <%-- PANEL --%>
    <h2>Class example:</h2>
    <div class="panel panel-default" style="width:20%">
      <div class="panel-heading">Class name</div>
      <div class="panel-body" style="height:100px">
        class Content
        <br>
        click to go to class
      </div>
    </div>

    <div height="300px;"></div>

  </div>

  <%-- Footer --%>
  <%@ include file="../components/footer.jsp"%>
  <%-- Footer End --%>


  <%-- JAVASCRIPTS --%>
  <script src="../../resources/js/main.js"></script>
  <script src="../../resources/js/logout.js"></script>
  <script src="https://apis.google.com/js/platform.js?onload=onLoad" async defer></script>
  <%-- load button funcions --%>
</body>
</html>
