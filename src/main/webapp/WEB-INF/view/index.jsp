<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>CAR</h1>
<form:form action="/show/car" method="get" modelAttribute="car">
    Brand: <form:input path="brand"/>
    <form:errors path="brand"/>
    <br><br>
    Model: <form:input path="model"/>
    <form:errors path="model"/>
    <br><br>
    Engine: <form:select path="engine">

            <form:option value="petrol"/>
            <form:option value="gas"/>
            <form:option value="diesel"/>
            <form:option value="electro"/>
    </form:select>
    <form:errors path="engine"/>
    <br><br>

    Transmission:
                    <form:radiobutton path="transmission" value="Automatic" label="Automatic"/>
                    <form:radiobutton path="transmission" value="Robot" label="Robot"/>
                    <form:radiobutton path="transmission" value="stick shift" label="stick shift"/>
    <form:errors path="transmission"/>
    <br><br>
    ls: <form:input path="ls"/>
    <form:errors path="ls"/>
    <br><br>
    Add Options:
            <form:checkbox path="addOptions" value="four-wheel drive" label="four-wheel drive"/>
            <form:checkbox path="addOptions" value="toning" label="toning"/>
            <form:checkbox path="addOptions" value="disks 21 radius" label="disks 21 radius"/>
    <form:errors path="addOptions"/>
    <br><br>
    PhoneNumber: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    <button type="submit">Submit</button>
</form:form>
</body>
</html>
