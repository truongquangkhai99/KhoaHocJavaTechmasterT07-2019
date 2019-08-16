

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Department;

import java.sql.*;
import java.util.Properties;

public class Database {
    //private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/javatutorials";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String MAX_POOL = "250";
    private Connection connection;
    private static Database instance;
    private Database(){
        try {
            getConnection();
        }catch (Exception e) {
            System.out.println("Cannot connect to DB. Error:"+e.toString());
            connection = null;
        }
    }
    private void getConnection() throws Exception{
        Class.forName(DATABASE_DRIVER);
        Properties properties = new Properties();
        properties.setProperty("user", USERNAME);
        properties.setProperty("password", PASSWORD);
        properties.setProperty("MaxPooledStatements", MAX_POOL);
        connection = DriverManager.getConnection(DATABASE_URL, properties);
        System.out.println("ddddd");
    }
    public static Database getInstance() {
        //sigleton pattern = "factory method"
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
    public ObservableList<Department> getDepartments() {
        ObservableList<Department> departments = FXCollections.observableArrayList();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tblDepartment");
            while (resultSet.next()) {
                Long departmentId = resultSet.getLong("departmentId");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                departments.add(new Department(departmentId, name, description));
            }

        } catch(SQLException e) {

        } finally {
            return departments;
        }
    }
}
