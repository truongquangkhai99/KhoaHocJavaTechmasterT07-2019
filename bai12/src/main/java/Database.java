

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Database {
    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    //String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/javatutorials";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String MAX_POOL = "250";
    private Connection connection;
    private static Database instance;
    private Database(){
        try {
            Class.forName(DATABASE_DRIVER);
            Properties properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
            properties.setProperty("MaxPooledStatements", MAX_POOL);
            connection = DriverManager.getConnection(DATABASE_URL, properties);
        }catch (Exception e) {
            System.out.println("Cannot connect to DB. Error:"+e.toString());
        }
    }
    public static Database getInstance() {
        //sigleton pattern = "factory method"
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
