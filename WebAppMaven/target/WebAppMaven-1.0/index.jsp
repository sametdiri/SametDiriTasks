<%-- 
    Document   : index
    Created on : 05.Ağu.2016, 15:45:47
    Author     : SDIRI
--%>

<%@page import="Controllers.UserController"%>
<%@page import="Models.User"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>İndex</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <table>
            <tr>
                <td>
                    Sıra No
                </td>
                <td>
                    Adı
                </td>
                <td>
                    Soyadı
                </td>
                <td>
                    Adres
                </td>
                <td>
                    Sil
                </td>
                <td>
                    Güncelle
                </td>
            </tr>
            
            <%
                List<Object> object = (List<Object>) request.getAttribute("list");
                for (int i = 0; i < object.size(); i++) {
                    User myModel = (User) object.get(i);
                    long id = myModel.getId();
                    String name = myModel.getName() != null ? myModel.getName().toString().trim() : "";
                    String surname = myModel.getSurname() != null ? myModel.getSurname().toString().trim() : "";
                    String address = myModel.getAddress() != null ? myModel.getAddress().toString().trim() : "";
            %>
            <tr>      
                <td><%=i%></td>
                <td><%=name%></td>
                <td><%=surname%></td>
                <td><%=address%></td> 
                <td>
                    <a href="?ActionDelete&Id=<%=id%>">Sil</a>
                </td>
                <td>
                    <a href="?Update&Id=<%=id%>">Güncelle</a>
                </td>
            </tr>

            <% }%>
        </table>
    </body>
</html>
