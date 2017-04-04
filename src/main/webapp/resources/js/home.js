var addClassBtn = document.getElementById("addClassBtn");
var createClassBtn = document.getElementById("createClassBtn");

addClassBtn.onclick = function() {

  var crsCode = document.getElementById("addCrsCode").value;
  var crsPassword = document.getElementById("addCrsPassword").value;

  var dataObj = {
    crsCode: crsCode,
    crsPassword: crsPassword,
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
      console.log(response);
    },
    error: function(err) {
       console.log(err);
    }
  });

}

createClassBtn.onclick = function() {

  var crsCode = document.getElementById("createCrsCode").value;
  var crsPassword = document.getElementById("createCrsPassword").value;
  var detail = document.getElementById("moreInfo").value;

  var dataObj = {
    crsCode: crsCode,
    crsPassword: crsPassword,
    detai: detail
  };

  console.log(dataObj);

  $.ajax({
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    type: "POST",
    url: "/createCourse",
    data: JSON.stringify(dataObj),
    success: function(response) {
      console.log(response);
    },
    error: function(err) {
       console.log(err);
    }
  });

}
