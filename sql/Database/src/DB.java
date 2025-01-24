import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wipro"; // Connecting to the 'wipro' database
        String user = "root";  // Your MySQL username
        String password = "12345678";  // Your MySQL password

        try {
            // Establishing the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful to the 'wipro' database!");

            // Creating a statement to execute the query
            Statement stmt = conn.createStatement();

            // Query to fetch all data from the employees table
            String sql = "SELECT * FROM employees";
            ResultSet rs = stmt.executeQuery(sql);

            // Displaying the result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
            }

            // Closing the resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
