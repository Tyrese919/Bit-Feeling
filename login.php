<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>classes.html</title>
    <link rel="stylesheet" type="text/css" href="classes.css" />
  </head>
  <style>
    A {
      text-decoration: none;
    }
  </style>
  <body>
      <?php
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "bit_mood";
        $charset = "utf8mb4";

        $dsn = "mysql:localhost=" . $servername . ";dbname=" . $dbname . ";charset=" . $charset;
        $pdo = new PDO($dsn, $username, $password);
        ?>

    <nav>
        <img id="Logo" src="BitMoodtransparantedited.png">
        <button class="button1"><a href="classes.html">Classes</a></button>
        <button class="button2"><a href="home.html">Home</a></button>
        <button class="button3"><a href="feelings.html">Feelings</a></button>
    </nav>

    <form action="">
        <h1>Teacher Code:</h1><input type="text" placeholder="Enter teacher code"><br><br>
        <h1>Password:</h1><input type="password" placeholder="Enter password"><br><br>
        <input id="btn" type="submit" value="Submit">
    </form>

    <footer>
      <span>
       Created By Bit Academy &#169;
      </span>
    </footer>

  </body>
</html>
