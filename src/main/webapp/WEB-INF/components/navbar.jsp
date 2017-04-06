<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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

    <a href="/landing" onclick="signOut();" style="float:right">
      <button class="btn btn-warning navbar-btn" type="button" name="button">Sign out</button>
    </a>
  </div>
</nav>
