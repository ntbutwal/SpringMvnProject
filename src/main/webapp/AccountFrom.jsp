<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Bank Account</title>
</head>
<body>

	<form:form id="loginForm" modelAttribute="kkc" action="Show"
		method="post">
		
		<table align="center">
			<tr>
				<td><form:label path="bankName">Bank Name : </form:label></td>
				<td><form:input path="bankName" name="bankName" id="bankName" />
				</td>
			</tr>
			<tr>
				<td><form:label path="accountHolderName">AccountHolderName : </form:label></td>
				<td><form:input path="accountHolderName" name="accountHolderName"
						id="category" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address :</form:label></td>
				<td><form:input path="address" name="address"
						id="address" /></td>
			</tr>
			<tr>
				<td><form:label path="phNumber">Phone Number :</form:label></td>
				<td><form:input path="phNumber" name="phNumber"
						id="phNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="initialAmmount">Initial Ammount :</form:label></td>
				<td><form:input path="initialAmmount" name="initialAmmount"
						id="phNumber" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="save" name="save">Save</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>