$(document).ready(function () {
  // إعداد خيارات Toastr
  var toastr = window["toastr"];
  toastr.options = {
    closeButton: false,
    debug: false,
    newestOnTop: false,
    progressBar: true,
    positionClass: "toast-top-right",
    preventDuplicates: false,
    onclick: null,
    showDuration: "300",
    hideDuration: "1000",
    timeOut: "2000",
    extendedTimeOut: "500",
    showEasing: "swing",
    hideEasing: "linear",
    showMethod: "fadeIn",
    hideMethod: "fadeOut",
  };

  // Toggle Password Visibility
  $("#togglePassword").click(function () {
    const passwordField = $("#password");
    const passwordFieldType =
      passwordField.attr("type") === "password" ? "text" : "password";
    passwordField.attr("type", passwordFieldType);
    $(this).toggleClass("fa-eye fa-eye-slash");
  });

  // Form submission
  $("#loginForm").submit(function (e) {
    e.preventDefault();

    const loginData = {
      email: $("#email").val(),
      password: $("#password").val(),
    };

    const loginButton = $('button[type="submit"]');

    // Disable the button and show spinner
    loginButton.prop("disabled", true);
    loginButton.html('<i class="fas fa-spinner fa-spin"></i> Logging in...');

    $.ajax({
      url: "http://localhost:8000/api/auth/login",
      type: "POST",
      contentType: "application/json",
      data: JSON.stringify(loginData),
      success: function (response) {
        console.log(response);
        // Enable the button again and remove spinner
        loginButton.prop("disabled", false);
        loginButton.html("Login");
      },
    });
  });
});
