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
$name="name";

$surname="surname";

$schoolcode="schoolcode";

$feeling="feeling";








?>

<table border="1px" cellpadding="4" cellspacing="50">

    <tr>

        <td>name</td>

        <td>surname</td>

        <td>schoolcode</td>

        <td>feeling</td>

    </tr>

    <tr>

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