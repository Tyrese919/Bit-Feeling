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
     table, th, td {
         font-size: 24px;
         text-align: center;
         border-collapse: collapse;
         padding: 5px;
         width: 400px;
         border: 1px solid black;
     }

      table {
          margin-top: 100px;
          margin-left: 12%;
          display: inline-block;
      }
  </style>
  <body>
    <nav>
      <img id="Logo" src="BitMoodtransparantedited.png" />
      <button class="button1"><a href="login.php">Login</a></button>
      <button class="button2"><a href="home.php">Home</a></button>
      <button class="button3"><a href="feelings.php">Feelings</a></button>
    </nav>
    <?php

    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "bitmood_db";

    $conn = mysqli_connect($servername, $username, $password, $dbname);

    $query = "SELECT * FROM student WHERE class_id = 1";
    $result = mysqli_query($conn, $query);

    echo "<table id='1'>";

    echo "<tr><th>Name</th><th>Class</th></tr><tr>";

    while($row = mysqli_fetch_array($result)){
        echo "<td>" . $row['name'] . "</td><td>" . $row['class_id'] . "</td></td></tr>";
    }

    echo "</table>";

    $query2 = "SELECT * FROM student WHERE class_id = 2";
    $result2 = mysqli_query($conn, $query2);

    echo "<table id='2'>";

    echo "<tr><th>Name</th><th>Class</th></tr><tr>";

    while($row = mysqli_fetch_array($result2)){
        echo "<td>" . $row['name'] . "</td><td>" . $row['class_id'] . "</td></td></tr>";
    }

    echo "</table>";

    $query3 = "SELECT * FROM student WHERE class_id = 3";
    $result3 = mysqli_query($conn, $query3);

    echo "<table id='3'>";

    echo "<tr><th>Name</th><th>Class</th></tr><tr>";

    while($row = mysqli_fetch_array($result3)){
        echo "<td>" . $row['name'] . "</td><td>" . $row['class_id'] . "</td></td></tr>";
    }

    echo "</table>";

    mysqli_close($conn);
    ?>
    <footer>
      <span > Created By Bit Academy &#169; </span>
    </footer>
  </body>
</html>