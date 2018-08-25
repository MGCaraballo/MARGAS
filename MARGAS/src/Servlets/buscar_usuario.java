package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import clases.conectar;
public class buscar_usuario extends HttpServlet
{
Connection con = null;
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter out = response.getWriter();
try {
boolean existeUsuario = false;
//Guardamos los datos enviados desde index
String usuario="";
String password="";
if (request.getParameter("usuario")!=null)
{
usuario=request.getParameter("usuario");
}
if (request.getParameter("password")!=null)
{
password=request.getParameter("password");
}
//Establecemos la conexion
con = conectar.getConexion();
String consulta = "Select * from usuarios where Usuario=? and Password=?";
ResultSet rs = null;
PreparedStatement pst = null;
pst = con.prepareStatement(consulta);
pst.setString(1, usuario);
pst.setString(2, password);
rs = pst.executeQuery();
String elUsuarioEs="";
while(rs.next()){
//En caso de existir una coincidencia
existeUsuario = true;
//Y reemplazamos los atributos de dicho Usuario
elUsuarioEs = rs.getString("usuario");
}
if(existeUsuario){
//Para el usuario existente:
//Reemplazamos atributos que luego obtendremos desde las páginas .jsp
request.setAttribute("usuario", elUsuarioEs);
// Iniciamos la sesión
HttpSession sesionOk=request.getSession();
sesionOk.setAttribute("usuario",usuario);
//Mandamos estos atributos a la página bienvenida.jsp
request.getRequestDispatcher("/bienvenida.jsp").forward(request, response);
}else{
	
	//De lo contrario vamos a la página errorLogin.jsp
	HttpSession sesionBad=request.getSession();
	sesionBad.setAttribute("usuario",null);
	sesionBad.invalidate();
	request.getSession().setAttribute("mensajeServlet", "Usuario o Contraseña equivocada");
	request.getRequestDispatcher("/login.jsp").forward(request, response);
	}
	out.close();
	} catch (SQLException ex) {
	out.println(ex.toString());
	} catch (ClassNotFoundException e) {

	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	@Override
	public String getServletInfo() {
	return "Short description";
	}
	}

