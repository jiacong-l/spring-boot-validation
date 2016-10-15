<%--
  Created by IntelliJ IDEA.
  User: zhenglian
  Date: 2016/10/15
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>登录页面</title>

    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>

</head>
<body>
    <form:form action="login" method="post" commandName="user">
        <form:errors path="*" cssClass="errorblock" element="div" />
        <table>
            <tr>
                <td>Customer Name :</td>
                <td><form:input path="username" /></td>
                <td><form:errors path="username" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Customer Password :</td>
                <td><form:input path="password" /></td>
                <td><form:errors path="password" cssClass="error" /></td>
            </tr>
            <tr>
                <td colspan="3"><input type="submit" /></td>
            </tr>
        </table>
    </form:form>

</body>
</html>
