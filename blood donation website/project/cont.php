<?php
if (isset($_POST['submit'])) {
    if (isset($_POST['Name']) && isset($_POST['Phone']) &&
        isset($_POST['email']) && isset($_POST['Comment'])) {
        
        $Name = $_POST['Name'];
        $Phone = $_POST['Phone'];
        $email = $_POST['email'];
        $Comment = $_POST['Comment'];
       
        $host = "localhost";
        $dbUsername = "root";
        $dbPassword = "";
        $dbName = "employee";
        $conn = new mysqli($host, $dbUsername, $dbPassword, $dbName);
        if ($conn->connect_error) {
            die('Could not connect to the database.');
        }
        else {
            $Select = "SELECT email FROM contact WHERE email = ? LIMIT 1";
            $Insert = "INSERT INTO contact(Name, Phone, email, Comment) values (?, ?, ?, ?)";
            $stmt = $conn->prepare($Select);
            $stmt->bind_param("s", $email);
            $stmt->execute();
            $stmt->bind_result($resultEmail);
            $stmt->store_result();
            $stmt->fetch();
            $rnum = $stmt->num_rows;
            if ($rnum == 0) {
                $stmt->close();
                $stmt = $conn->prepare($Insert);
                $stmt->bind_param("ssss",$Name, $Phone, $email, $Comment);
                if ($stmt->execute()) {
                    echo "New record inserted sucessfully.";
                }
                else {
                    echo $stmt->error;
                }
            }
            else {
                echo "Someone already registers using this email.";
            }
            $stmt->close();
            $conn->close();
        }
    }
    else {
        echo "All field are required.";
        die();
    }
}
else {
    echo "Submit button is not set";
}
?>