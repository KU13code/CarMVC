<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>your car</h1>
<p>brand: ${car.brand}</p>
<p>model: ${car.model}</p>
<p>engine: ${car.engine}</p>
<p>Transmission: ${car.transmission}</p>
<p>ls: ${car.ls}</p>
<p>Add Options:</p>
<ul>
    <c:forEach var="lang" items="${car.addOptions}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<p>PhoneNumber: ${car.phoneNumber}</p>
<p>email: ${car.email}</p>

</body>
</html>