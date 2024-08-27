package mylibrary;

import java.sql.*;
import java.util.*;

public class DB_Connection {
    public  static Connection connection;
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://127.0.0.1:3306/";
    private static String db_name;
    private static String user;
    private static String password;
    
    public static boolean advanced_connection() throws ClassNotFoundException, SQLException {
    	Scanner input = new Scanner(System.in);
        
        System.out.println("\n===== CONECTING JAVA AND MYSQL =====");
        System.out.print("DRIVER: ");
        String DRIVER = input.nextLine();
        System.out.print("URL: ");
        String URL = input.nextLine();
        System.out.print("NOME DO BANCO: ");
        String db_name = input.nextLine();
        System.out.print("USUÁRIO: ");
        String user = input.nextLine();
        System.out.print("SENHA: ");
        String password = input.nextLine();
        
        return DB_Connection.set_connection(
            DRIVER, 
            URL, 
            db_name, 
            user, 
            password
        );
    }
    
    public static boolean manual_connection() throws ClassNotFoundException, SQLException {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n===== CONECTING JAVA AND MYSQL =====");
        System.out.println("Database: ");
        String db_name = input.nextLine();
        System.out.println("User: ");
        String user = input.nextLine();
        System.out.println("Password: ");
        String password = input.nextLine();
        
        return DB_Connection.set_connection(
            DRIVER, 
            URL, 
            db_name, 
            user, 
            password
        );
    }
    
	public static boolean manual_connection(
		String db_name, 
		String user, 
		String password
	) throws ClassNotFoundException, SQLException {
		System.out.println("\n===== CONECTING JAVA AND MYSQL =====");
        System.out.println("Database: " + db_name);
        System.out.println("User: " + user);
        System.out.println("Password: " + password);
        return DB_Connection.set_connection(
            DRIVER, 
            URL, 
            db_name, 
            user, 
            password
        );
    }
            
    public static boolean set_connection (
        String driver, 
        String url, 
        String db_name, 
        String user, 
        String password
    ) throws ClassNotFoundException, SQLException {
        DB_Connection.DRIVER = driver;
        DB_Connection.URL = url;
        DB_Connection.db_name = db_name;
        DB_Connection.user = user;
        DB_Connection.password = password;
        return DB_Connection.test_connection();
    }
    
    public static boolean test_connection() throws ClassNotFoundException, SQLException {
        System.out.println("\n===== TESTING CONNECTION =====");
        try {
            DB_Connection.connection = DriverManager.getConnection(URL + db_name, user, password);
            System.out.println("Connected!");
            System.out.println();
            return true;
        } catch (SQLException e) {
            System.out.println("It didn't connect");
            System.out.println(String.format("ERROR: %s", e.getMessage()));
            System.out.println();
            return false;
        }
    }
}