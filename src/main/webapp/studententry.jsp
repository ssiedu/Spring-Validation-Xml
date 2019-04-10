<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Admission-Form</h2>
        <table border="0" width="90%">
        <form:form action="register" commandName="student">
                <tr>
                    <td align="left" width="20%">Name:</td>
                    <td align="left" width="40%"><form:input path="studentName" size="30"/></td>
                    <td align="left"><form:errors path="studentName" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Hobby </td>
                    <td><form:input path="studentHobby" size="30"/></td>
                    <td><form:errors path="studentHobby" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Mobile </td>
                    <td><form:input path="studentMobile" size="30"/></td>
                    <td><form:errors path="studentMobile" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>DOB </td>
                    <td><form:input path="studentDOB"    size="30"/></td>
                    <td><form:errors path="studentDOB" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Email </td>
                    <td><form:input path="studentEmail" size="30"/></td>
                    <td><form:errors path="studentEmail" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Skills </td>
                    <td><form:select path="studentSkills" items="${skills}"/></td>
                    <td><form:errors path="studentSkills" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>HouseNo </td>
                    <td><form:input path="studentAddress.houseNo" size="30"/></td>
                    <td><form:errors path="studentAddress.houseNo" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Street </td>
                    <td><form:input path="studentAddress.street" size="30"/></td>
                    <td><form:errors path="studentAddress.street" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>City </td>
                    <td><form:input path="studentAddress.city" size="30"/></td>
                    <td><form:errors path="studentAddress.city" cssClass="error"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td align="left"><input type="submit" value="Register"/></td>
                    <td></td>
                </tr>
        </form:form>
        </table>
    </div>
</body>
</html>