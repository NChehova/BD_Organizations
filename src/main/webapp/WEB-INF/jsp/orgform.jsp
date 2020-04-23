<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Add New Employee</h1>
<form:form method="post" action="save">
    <table >
        <tr>
            <td>Name : </td>
            <td><form:input path="name_organization"  /></td>
        </tr>
        <tr>
            <td>Year :</td>
            <td><form:input path="year_organization" /></td>
        </tr>
        <tr>
            <td>Phone :</td>
            <td><form:input path="phone_organization" /></td>
        </tr>
        <tr>
            <td>Address :</td>
            <td><form:input path="address_organization" /></td>
        </tr>
        <tr>
            <td>City :</td>
            <td><form:input path="id_city" /></td>
        </tr>
        <tr>
            <td>Type organization :</td>
            <td><form:input path="id_type_organizations" /></td>
        </tr>
        <tr>
            <td> </td>
            <td><input type="submit" value="Save" /></td>
        </tr>
    </table>
</form:form>