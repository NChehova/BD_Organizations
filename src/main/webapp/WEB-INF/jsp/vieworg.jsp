<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Employees List</h1>
<table border="2" width="70%" cellpadding="2">
    <tr><th>Id</th><th>Name</th><th>Year</th><th>phone</th><th>Address</th><th>City</th><th>Type organization</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="organization" items="${list}">
        <tr>
            <td>${organization.id}</td>
            <td>${organization.name_organization}</td>
            <td>${organization.year_organization}</td>
            <td>${organization.phone_organization}</td>
            <td>${organization.address_organization}</td>
            <td>${organization.id_city}</td>
            <td>${organization.id_type_organizations}</td>
            <td><a href="editorg/${organization.id}">Edit</a></td>
            <td><a href="deleteorg/${organization.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="orgform">Add New Employee</a>