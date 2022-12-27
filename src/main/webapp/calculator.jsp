<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 27/12/2022
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/simple-calculator">
    <h1>Simple Calculator</h1>
    <p><strong>Calculator</strong></p>
    <p>First Operand:   </p>
    <input type="text" name="firstOperand">
    <br>
    <p>Operator:</p>
    <label>
        <select name="operator">
            <option value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
        </select>
    </label>
    <br>
    <p>Second Operand:   </p>
        <input type="text" name="secondOperand">
    <br>
    <br>
    <input type="submit" value="Calculate">
</form>
</body>
</html>
