var addBtn = document.getElementById("addClassBtn") || null;
var createBtn = document.getElementById("createClassBtn") || null;

addBtn.onclick = function() {

  var crsCode = document.getElementById("addCrsCode").value;
  var crsPassword = document.getElementById("addCrsPassword").value;

  var dataObj = {
    crsCode: crsCode,
    crsPassword: crsPassword
  };

  console.log(dataObj);

  $.ajax({
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    type: "POST",
    url: "/addCourse",
    data: JSON.stringify(dataObj),
    success: function(response) {
      window.location.href = "/home";
    },
    error: function(err) {
       console.log(err);
    }
  });

}

createBtn.onclick = function() {

  var crsCode = document.getElementById("createCrsCode").value;
  var crsPassword = document.getElementById("createCrsPassword").value;
  var detail = document.getElementById("moreInfo").value;

  var dataObj = {
    crsCode: crsCode,
    crsPassword: crsPassword,
    detail: detail
  };

  console.log(dataObj);
  console.log(JSON.stringify(dataObj));

  $.ajax({
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    type: "POST",
    url: "/createCourse",
    data: JSON.stringify(dataObj),
    success: function(response) {
      window.location.href = "/home";
    },
    error: function(err) {
       console.log(err);
    }
  });

}

function loadCourse(courseId) {
  console.log(courseId);
  var dataObj = {
      courseId: courseId
    };
    var courseUrl = '/loadCourse'
    $.ajax({
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      type: "POST",
      url: courseUrl,
      data: JSON.stringify(dataObj),
      success: function(response) {
        window.location.href = "/course";
      },
      error: function(err) {
         console.log(err);
      }
    });
} 
