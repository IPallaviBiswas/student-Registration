<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!-- --this page to call from controller layer -->
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    form {
      font-family: Arial, sans-serif;
    }

    pre {
      margin: 0;
    }

    input[type="text"] {
      width: 200px;
      margin-bottom: 10px;
    }

    input[type="submit"] {
      font-weight: bold;
      background-color: #4caf50;
      color: white;
      padding: 10px 15px;
      border: none;
      border-radius: 3px;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <form action= "saveReg" method= "post"><!-- --will call the controller -->
    <pre>
      First Name<input type="text" name="firstname" placeholder="Firstname">
      Last Name<input type="text" name="lastname" placeholder="Lastname">
      Email<input type="text" name="email" placeholder="Email">
      Mobile<input type="text" name="mobile" placeholder="Mobile">
      <input type="submit" name="save" value="Save">
    </pre>
  </form>
 ${msg}
</body>
</html>