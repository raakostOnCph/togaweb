<%@ page import="java.util.List" %>
<%@ page import="persistens.Kunde" %><%--
  Created by IntelliJ IDEA.
  User: nbh
  Date: 2019-03-01
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>vis resultater</title>
</head>
<body>

<h1>Kundeliste resultat </h1>


<%

    List<Kunde> kundeList = (List<Kunde>) request.getAttribute("listen");

    for (int i = 0; i < kundeList.size(); i++) {

        response.getWriter().println(kundeList.get(i).getKundeId());
        response.getWriter().println(kundeList.get(i).getNavn());
        response.getWriter().println("<br/>");
    }

%>



</body>
</html>
