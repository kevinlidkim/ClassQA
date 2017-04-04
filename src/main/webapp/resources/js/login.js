function onSuccess(googleUser) {
  console.log('Logged in as: ' + googleUser.getBasicProfile().getName());

  //var user = googleUser.getBasicProfile().getName();
  var firstName = googleUser.getBasicProfile().getGivenName();
  var lastName = googleUser.getBasicProfile().getFamilyName();
  var email = googleUser.getBasicProfile().getEmail();

  var form = document.createElement("form");
  form.setAttribute("method", "post");
  form.setAttribute("action", "/home");
  var params = {firstName: firstName, lastName: lastName, email: email};
  for(var key in params) {
    if(params.hasOwnProperty(key)) {
      var hiddenField = document.createElement("input");
      hiddenField.setAttribute("type", "hidden");
      hiddenField.setAttribute("name", key);
      hiddenField.setAttribute("value", params[key]);

      form.appendChild(hiddenField);
    }
  }
  document.body.appendChild(form);
  form.submit();
}

function onFailure(error) {
  console.log(error);
}

function renderButton() {
  gapi.signin2.render('my-signin2', {
    'scope': 'profile email',
    'width': 240,
    'height': 50,
    'longtitle': true,
    'theme': 'dark',
    'onsuccess': onSuccess,
    'onfailure': onFailure
  });
}
