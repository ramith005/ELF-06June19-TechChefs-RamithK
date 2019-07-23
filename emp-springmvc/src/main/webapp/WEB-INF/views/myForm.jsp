<!DOCTYPE html>
<html lang="en">
<head>
  <title>Employee Management Portal</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="../form.css" >
</head>
<style>
</style>
<body>
<br /><br />
<div class="container boxshadow container-resize">
  <h2>Employee Login</h2>
  <form action="./formSubmit6" method="post">
    <div class="form-group">
      <label for="email">Employee Id:</label>
      <input type="number" class="form-control" id="userId" placeholder="Enter Employee id" name="userId">
      <label for="password">Password:</label>
      <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password">
    </div>                                                                                                                                                                                                                                                                     
    <button type="submit" name="sbmt"  class="btn btn-primary" >Login</button>
    <br /><br />
      <a class="txt2" href="./createEmployee.jsp">
          Create Account
      </a>
      <br />
      <a class="txt2" href="forgotpassword.html">
        Forgot Password?
      </a>
  </form>
</div>
</body>
</html>