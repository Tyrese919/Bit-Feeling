<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="feelings.css">
        <title>feelings.html</title>
            <?php
                include 'config.php'
            ?>
    </head>
    <STYLE>A {text-decoration: none;} </STYLE>
        <body>
            <?php
                $servername = "localhost";
                $username = "root";
                $password = "";
                $dbname = "bitmood_db";
                $conn = mysqli_connect($servername, $username, $password, $dbname);
            ?>
        <table border="1px" cellpadding="4" cellspacing="50">
            <tr>
                <nav>
                    <img id="Logo" src="BitMoodtransparantedited.png">
                    <button class="button"><a href="classes.php">Classes</a></button>
                    <button class="button"><a href="home.php">Home</a></button>
                    <button class="button"><a href="login.php">Loginout</a></button>
                </nav>
            <tr>
        </table>
        <form class="feeling_table">
        <?php
                $query = "SELECT * FROM feeling";
                $result = mysqli_query($conn, $query);
    
                echo "<table id='1'>";
                echo "<tr><th>Student</th><th>Message</th><th>Mood</th></tr>";
    
                while($row = mysqli_fetch_array($result)){
                    echo "<td>" . $row['student_id'] . "</td><td>" . $row['message'] . "</td><td>" . $row['mood_type'] . "</td></td></tr>";
                }
                echo "</table>";
            
                mysqli_close($conn);
            ?>
        </form>
        <footer>
            <span>
                Created By Bit Academy &#169;
            </span>
        </footer>
        </body>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="feelings.css">
    <title>feelings.html</title>
    <?php
    include 'config.php'
    ?>


</head>
<STYLE>A {text-decoration: none;} </STYLE>
<body>

<?php

$name="name";
$surname="surname";
$schoolcode="schoolcode";
$feeling="feeling";

?>

    <nav>
        <img id="Logo" src="BitMoodtransparantedited.png">
        <button class="button1"><a href="classes.php">Classes</a></button>
        <button class="button2"><a href="home.php">Home</a></button>
        <button class="button3"><a href="index.php">Login</a></button>
    </nav>

<footer>

        <a class="copyright" href="https://www.bit-academy.nl/"> Created By Bit Academy &#169;  </a>

</footer>
</body>
</html>