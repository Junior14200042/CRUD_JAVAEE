package ControllerPersona;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModelPersona.ModelPersona;
import personaDAO.personaDAO;

/**
 * Servlet implementation class ControllerPersona
 */
@WebServlet("/ControllerPersona")
public class ControllerPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerPersona() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcion=request.getParameter("action");
		
		if(opcion.equals("listar")) {
			System.out.println("Ingresó aqui");
			personaDAO persona=new personaDAO();
			List<ModelPersona> mp=new ArrayList<>();
			try {
				mp=persona.modelPersona();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			request.setAttribute("person", mp);
			RequestDispatcher rq=request.getRequestDispatcher("Vistas/listar.jsp");
			rq.forward(request, response);
			
		}else if(opcion.equals("nuevo")){
			RequestDispatcher rq=request.getRequestDispatcher("Vistas/Nuevo.jsp");
			rq.forward(request, response);
		}else if(opcion.equals("editar")) {
			
			int i=Integer.parseInt(request.getParameter("id"));
			System.out.println(i);
			personaDAO persona=new personaDAO();
			ModelPersona mp=new ModelPersona();
			try {
				mp=persona.obtenerId(i);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			request.setAttribute("per", mp);
			RequestDispatcher rq=request.getRequestDispatcher("Vistas/Editar.jsp");
			rq.forward(request, response);
		}else if(opcion.equals("eliminar")) {
			personaDAO pDAO=new personaDAO();
			int id=Integer.parseInt(request.getParameter("id"));
			
			try {
				pDAO.eliminar(id);
				RequestDispatcher rq=request.getRequestDispatcher("Index.jsp");
				rq.forward(request, response);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcion=request.getParameter("opcion");
		if(opcion.equals("guardar")) {
			System.out.print("Entró a guardar");
			String nombre=request.getParameter("nombre");
			String correo=request.getParameter("correo");
			personaDAO pDAO=new personaDAO();
			ModelPersona mp=new ModelPersona();
			mp.setNombre(nombre);
			mp.setCorreo(correo);
			try {
				pDAO.guardarPersona(mp);
				RequestDispatcher rq=request.getRequestDispatcher("Index.jsp");
				rq.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		}else if(opcion.equals("actualizar")){
			String nombre=request.getParameter("nombre");
			String correo=request.getParameter("correo");
			int i=Integer.parseInt(request.getParameter("id"));
			
			personaDAO pDAO=new personaDAO();
			ModelPersona mp=new ModelPersona();
			mp.setidPersona(i);
			mp.setNombre(nombre);
			mp.setCorreo(correo);
			try {
				pDAO.editarPersona(mp);
				RequestDispatcher rq=request.getRequestDispatcher("Index.jsp");
				rq.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
	}

}
