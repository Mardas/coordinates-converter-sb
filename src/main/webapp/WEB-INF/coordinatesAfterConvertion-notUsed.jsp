<%@ page session="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>
<body>
<h2>Add refueling</h2>

<spring:url value="/convertCoordinates" />
<body>
<h1>Coordinates converter</h1>
<p text="${coor}"></p>
</body>