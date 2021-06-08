<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="home.css">
    <title>feelingweb.html</title>
</head>
<STYLE>A {text-decoration: none;} </STYLE>
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
        <button class="button1"><a href="classes.php">Classes</a></button>
        <button class="button2"><a href="feelings.php">Feelings</a></button>
        <button class="button3"><a href="login.php">Login</a></button>
    </nav>
    <marquee direction="left" behavior="alternate"><text>Welcome to</text></marquee>
    <div id="Bit Mood anim"><h1>Bit Mood</h1></div>

<footer>
    <span>Created By Bit Academy &#169;</span>
</footer>

</body>
</html>