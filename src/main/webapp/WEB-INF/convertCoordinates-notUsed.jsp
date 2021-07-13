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

    <form method="post" action="/convertCoordinates" modelAttribute="coordinatesToConvert">
        <label for="inputCoordinates">Paste your coordinates:</label>
        <br>
        <textarea id="inputCoordinates" name="inputCoordinates" path="coordinates" rows="10" cols="50"></textarea>
        <br>
        <label for="categoryConvertion">Choose a type of convertion:</label>
        <select name="categoryConvertion" path="coordinatesFormat">
            <form:options items="${typeOfConvertion}" ></form:options>
        </select>
        <input type="submit" value="Convert">
    </form>
    <br>

</body>