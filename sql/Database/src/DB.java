import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {

    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/wipro";  // Database URL
        String user = "root";  // MySQL username
        String password = "12345678";  // MySQL password

        // Establishing the connection and querying the database
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            System.out.println("Connection successful to the 'wipro' database!");

            // Query to fetch all data from the 'employees' table
            String sql = "SELECT * FROM employees";
            try (ResultSet rs = stmt.executeQuery(sql)) {
                // Displaying the result
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String position = rs.getString("position");
                    System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
                }
            }
        } catch (Exception e) {
            // Handling exceptions
            e.printStackTrace();
        }
    }
}
