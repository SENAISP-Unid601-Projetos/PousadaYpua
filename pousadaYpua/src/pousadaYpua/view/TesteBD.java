package pousadaYpua.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import pousadaYpua.DAO.PearsonDao;
import pousadaYpua.DAO.QuartosDao;
import pousadaYpua.database.Database;
import pousadaYpua.model.Pearson;
import pousadaYpua.model.Quarto;

public class TesteBD {
;
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		Connection con = null;

		try {
			con = Database.getinstance().getConnection();
			
			
			
			
			
			
			


		

			Statement statement = con.createStatement();

			ResultSet rs = statement.executeQuery("select * from pearson");

			while (rs.next()) {
				// read the result set
				System.out.println("name = " + rs.getString("name"));
				System.out.println("id = " + rs.getInt("id"));
			}
		} catch (Exception e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			e.printStackTrace(System.err);
		}
	}
}
