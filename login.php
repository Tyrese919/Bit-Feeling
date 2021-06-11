<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>classes.html</title>
    <link rel="stylesheet" type="text/css" href="login.css" />
  </head>
  <style>
    A {
      text-decoration: none;
    }
  </style>
  <body>
  <?php
  $servername = "51.68.47.8";
  $username = "scrumteam5";
  $password = "G2rc3L400dI024Ce";
  $dbname = "scrumteam5";
  $charset = "utf8mb4";

  $dsn = "mysql:host=" . $servername . ";dbname=" . $dbname . ";charset=" . $charset;
  try {
      $pdo = new PDO($dsn, $username, $password);
  } catch (PDOException $e) {
      print "Error!: " . $e->getMessage() . "<br/>";
      die();
  }
  ?>

    <nav>
        <img id="Logo" src="BitMoodtransparantedited.png">
        <button class="button1"><a href="classes.php">Classes</a></button>
        <button class="button2"><a href="home.php">Home</a></button>
        <button class="button3"><a href="feelings.php">Feelings</a></button>
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
