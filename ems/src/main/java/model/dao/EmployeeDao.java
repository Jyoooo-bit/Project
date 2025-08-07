package model.dao;
import model.entity_Classes.Employee;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class EmployeeDao {

	FileInputStream fis;
	Properties property = new Properties();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	{



		try {
			fis = new FileInputStream(
					"C:\\Users\\viswanivi\\OneDrive\\advance java\\JDBC\\ems\\src\\main\\resources\\data.properties");
			property.load(fis);

			String driver = property.getProperty("driver");

			Class.forName(driver);

			System.out.println("Driver Loaded ..");

			// Step 2 : Connection
			String url = property.getProperty("url");

			con = DriverManager.getConnection(url, property);

			System.out.println("Connection Done .....");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} 

	public boolean validateAdmin(Employee emp) {

		String query = "select password, role from employee where id = ?";

		try {
			ps = con.prepareStatement(query);

			ps.setInt(1, emp.getId());
	        System.out.println("Executing query: " + query + " with ID: " + emp.getId());


			rs = ps.executeQuery();

			if (rs.next()) {

				if (rs.getString(1).equals(emp.getPassword()) && rs.getString(2).equalsIgnoreCase("admin")) {
					return true;
				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public static void main(String[] args) {
		EmployeeDao eDao = new EmployeeDao();
	}
	

}
 


			