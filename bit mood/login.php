<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>classes.html</title>
    <link rel="stylesheet" type="text/css" href="login.css" />
      <?php
      include 'config.php';
      ?>
  </head>
  <style>
    A {
      text-decoration: none;
    }
  </style>
  <body>
  <?php

  // session start
  session_start();

  // if the user is logged in welcome to home page
  if (isset($_SESSION["username"]) && $_SESSION["username"] == true) {
      header("location: home.php");
      exit;
  }
  ?>

    <nav>
        <img id="Logo" src="BitMoodtransparantedited.png">
    </nav>

    <form action="">
        <h1>Teacher Code:</h1><input type="text" placeholder="Enter teacher code"><br><br>
        <h1>Password:</h1><input type="password" placeholder="Enter password"><br><br>
        <button class="btn"><a href="home.php">Submit</a></button>
    </form>

    <footer>
      <span>
       Created By Bit Academy &#169;
      </span>
    </footer>

  </body>
</html>
