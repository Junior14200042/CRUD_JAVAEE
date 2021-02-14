package Conexion;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion con = new Conexion();
		try {
			System.out.println(con.conexion());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
