<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-
transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta content="es-ar" http-equiv="Content-Language" />
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Ingreso Correcto</title>
<style type="text/css">

.auto-style1 {
font-family: Arial, Helvetica, sans-serif;
font-size: small;
text-align: center;
}
.auto-style2 {
font-size: large;
}
.auto-style3 {
font-size: small;
text-align: right;
font-weight: bold;
color: #FFFFFF;
background-color: #000080;
}
.auto-style4 {
text-align: center;
font-family: Arial, Helvetica, sans-serif;
font-size: medium;
}
.auto-style5 {
color: #FFFFFF;
background-color: #000080;
}
</style>
</head>
<%
//Capturamos los datos enviados desde el servlet
String usuario = (request.getAttribute("usuario")).toString();
%>
<body title="Acceso Permitido" style="background-color: #E3E4FF">
<p class="auto-style1"><strong><span class="auto-style2">Uso de JSP y Servlets para conexión y logueo a
una Base de Datos</span></strong><table style="width: 22%" align="right">
<tr>
<td class="auto-style3" style="width: 155px"><strong>Usuario:</strong></td>
<td class="auto-style5"><strong><%=usuario%></strong></td>
</tr>
</table>
</p>
<hr />
<h5 class="auto-style4">Bienvenido! </h5>
<hr />
</body>
</html>