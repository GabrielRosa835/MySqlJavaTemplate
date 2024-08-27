package main;

import java.sql.*;
import mylibrary.*;

public class Main extends Utils {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DB_Connection.manual_connection(
			"db_sm_planning",
			"root",
			"Jujuba310503++"
		);
		Console_UI.start();
	}
}
