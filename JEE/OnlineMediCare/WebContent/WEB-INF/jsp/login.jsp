<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>

<head>
  <title>login</title>
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="CSS/style.css" title="style" />
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <h1><a href="welcome.html">Online Medicare System</a>  <span style="font-size:20px; font-family:Verdana"><a href="login.html">Login</a>|<a href="Register.html">Register</a></span></h1>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li class="selected"><a href="welcome.html">Home</a></li>
          <li><a href="examples.html">Services</a></li>
          <li><a href="page.html">Facilities</a></li>
          <li><a href="another_page.html">Advantages</a></li>
          <li><a href="contact.html">Contact Us</a></li>
        </ul>
      </div>
    </div>
    <div id="site_content">
      <div class="sidebar">
        <!-- insert your sidebar items here -->
        <h3>Sign-up for Care</h3>
        
        <h3>Search</h3>
        <form method="post" action="#" id="search_form">
          <p>
            <input class="search" type="text" name="search_field" value="Enter keywords....." />
            <input name="search" type="image" style="border: 0; margin: 0 0 -9px 5px;" src="style/search.png" alt="Search" title="Search" />
          </p>
        </form>
      </div>
      <div id="content">
        <form method="post" name="login" onsubmit="return validate()" action='<c:url value="/ValidateUser.htm"/>'>
        <p1>EmailAddress<p1><br><input required class = "login-box" type="text" id="userName" placeholder="username@example.com"><br>
        <p1>Password<p1><br><input required class="login-box" type="password" id="password"><br>
        <input class="submit-button" type="submit" value="Log in">
        </form>
      </div>
    </div>
    <div id="footer">
      Copyright &copy;OMC 
    </div>
  </div>
</body> 
</html>