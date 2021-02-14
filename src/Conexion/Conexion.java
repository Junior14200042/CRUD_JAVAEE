package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private String url = "jdbc:mysql://localhost:3306/HolaMySQL?useSSL=false&&serverTimezone=UTC";
	private String name = "root";
	private String pass = "admin";
	private Connection con = null;

	public Connection conexion() throws ClassNotFoundException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(this.url, this.name, this.pass);
			if (con != null) {
				System.out.println("Se conectó");
			} else {
				System.out.println("cno");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
