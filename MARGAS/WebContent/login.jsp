<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" %>
<head>
<title>Ingreso al Sistema</title>
</head>
<body bgcolor="#413141">
<center>
<font face="arial" size=2 COLOR="#FFFFFF">
<p><font size=4>Usuario</font></p>
<font face="arial" size=2 COLOR="#FF0000"> <b>
<%
String msg=(String)session.getAttribute("mensajeServlet");
if (msg!=null)
{
out.print("Estado: "+msg);
}
%>
</b>
<font face="arial" size=2 COLOR="#FFFFFF">
<FORM ACTION=Buscar_usuario METHOD=post>
<table border="1" cellspacing=0 cellpading=0>
<td>Usuario..:</td><td><INPUT TYPE=text NAME=usuario size="23" required></td>
</tr>
<tr>
<td>Password:</td><td><INPUT TYPE=password NAME=password size="20" required></td>
</tr>
<tr>
<td colspan=2><center><INPUT TYPE=SUBMIT NAME=ingreso VALUE=Ingresar></center></td>
</tr>
</table>
</FORM>
</font>
</body>
</html>