<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="feelings.css">
    <title>feelings.html</title>
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
        <button class="button2"><a href="home.php">Home</a></button>
        <button class="button3"><a href="login.php">Login</a></button>
    </nav>

<footer>
    <span>
        Created By Bit Academy &#169;
    </span>
</footer>
</body>
</html>