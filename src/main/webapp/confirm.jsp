<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome </title>
</head>
<body>
   <div align="center">
        <h2>Admission-Form</h2>
        <table border="2" width="90%">
                <tr>
                    <td align="left" width="20%">Name:</td>
                    <td align="left" width="80%">${student.studentName }</td>
                </tr>
                <tr>
                    <td>Hobby </td>
                    <td>${student.studentHobby}</td>
                </tr>
                <tr>
                    <td>Mobile </td>
                    <td>${student.studentMobile }</td>
                </tr>
                <tr>
                    <td>DOB </td>
                    <td>${student.studentDOB }</td>
                </tr>
                <tr>
                    <td>Email </td>
                    <td>${student.studentEmail }</td>
                </tr>
                <tr>
                    <td>Skills </td>
                    <td>${student.studentSkills }</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>${student.studentAddress}</td>
                </tr>
        </table>
        <a href="studententry">Edit-Form</a>
        <A href="index.jsp">home</A>
    </div>
</body>
</html>