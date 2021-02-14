package personaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import Conexion.Conexion;
import ModelPersona.ModelPersona;

public class personaDAO {
	
	private Connection con=null;
	private PreparedStatement st;
	private Conexion conectar=new Conexion();
	public boolean estadoOp;
	
	public List<ModelPersona> modelPersona() throws ClassNotFoundException{
		ResultSet rs=null;
		List<ModelPersona> modelPersona=new ArrayList<>();
		try {
			con=conectar.conexion();
			String sql= "SELECT * FROM persona";
			st=con.prepareStatement(sql);
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				ModelPersona mp= new ModelPersona();
				mp.setidPersona(rs.getInt(1));
				mp.setNombre(rs.getString(2));
				mp.setCorreo(rs.getString(3));
				modelPersona.add(mp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return modelPersona;
	}
	
	public boolean guardarPersona(ModelPersona per) throws SQLException {
		
		try {
			con=conectar.conexion();
			String sql="INSERT INTO persona(idpersona, nombre, correo) VALUES (?,?,?)";
			st=con.prepareStatement(sql);
			
			st.setString(1,null);
			st.setString(2, per.getNombre());
			st.setString(3, per.getCorreo());
			
			estadoOp=st.executeUpdate()>0;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return estadoOp;
	}
	
	public boolean editarPersona(ModelPersona per) throws SQLException {
		try {
			con=conectar.conexion();
			String sql="UPDATE persona SET nombre=?, correo=? WHERE idpersona=?";
	
			st=con.prepareStatement(sql);
			st.setString(1,per.getNombre());
			st.setString(2,per.getCorreo());
			st.setInt(3, per.getidPersona());
			
			estadoOp=st.executeUpdate()>0;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return estadoOp;
	}
	
	public ModelPersona obtenerId(int id) throws Exception {
		
		con=conectar.conexion();
		ResultSet rs=null;
		ModelPersona mp=new ModelPersona();
		try {
			String sql="SELECT * FROM persona WHERE idpersona= ?";
			st=con.prepareStatement(sql);
			st.setInt(1,id);
			
			rs=st.executeQuery();
			
			if(rs.next()) {
				mp.setidPersona(rs.getInt(1));
				mp.setNombre(rs.getString(2));
				mp.setCorreo(rs.getString(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return mp;
	}
	
	public boolean eliminar(int id) throws ClassNotFoundException{
		
		con=conectar.conexion();
		
		try {
			String sql="DELETE FROM persona WHERE idpersona=?";
			st=con.prepareStatement(sql);
			st.setInt(1,id);
			estadoOp=st.executeUpdate()>0;
			
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		return estadoOp;
	}

}
