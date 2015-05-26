<?php

$con = mysqli_connect("localhost","root","wahome","booking");

$name = $_POST["name"];
$email = $_POST["email"];
$username = $_POST["username"];
$password = $_POST["password"];

$query = mysqli_prepare($con, "INSERT INTO users(name, email, username, password) VALUES(?,?,?,?)");
mysqli_stmt_bind_param($query, "ssss", $name, $email, $username, $password);

mysqli_close($con);

?>