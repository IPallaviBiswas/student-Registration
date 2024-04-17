<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
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
  
  <form action= "updateReg" method= "post"><!-- --will call the controller -->
    <pre>
    <input type="hidden" name="id" value="${reg.id}"/>
      First Name<input type="text" name="firstname" value="${reg.firstname}"/>
      Last Name<input type="text" name="lastname" value="${reg.lastname}"/>
      Email<input type="text" name="email" value="${reg.email}"/>
      Mobile<input type="text" name="mobile" value="${reg.mobile}"/>
      <input type="submit" value="update"/>
    </pre>
  </form>
 ${msg}
</body>
</html>