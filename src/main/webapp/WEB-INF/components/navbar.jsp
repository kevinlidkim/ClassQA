<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-default navbar-inverse">
  <div class="container">

    <div class="navbar-header">
      <%-- ClassQA Logo --%>
      <a href="/home">
        <img id="nav-logo" src="../../resources/images/logo.png" alt="Logo">
      </a>

    </div>

    <div class="navbar-collapse ">



      <c:choose>
        <c:when test="${sessionUser.professor == true}">
          <%-- createClass Button --%>
          <button type="button" class="btn btn-org navbar-btn" data-toggle="modal" data-target="#createModal">Create Class</button>

          <!-- createClass Modal -->
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
        </c:when>
        <c:otherwise>

        </c:otherwise>
      </c:choose>

      <!-- addClass Button -->
      <button type="button" class="btn btn-org navbar-btn" data-toggle="modal" data-target="#addModal">Add Class</button>

      <!-- addClass Modal -->
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

      <!-- loadClass Button -->
      <button id="loadClassBtn" type="button" class="btn navbar-btn btn-org">Load ClassPage</button>

      <%-- logout Button --%>
      <a href="/landing" onclick="signOut();" style="float:right">
        <button id="logoutBtn" class="btn btn-org navbar-btn" type="button" name="button">Sign out</button>
      </a>
    </div>


  </div>
</nav>
