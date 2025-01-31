package in.sp.backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String myname = req.getParameter("name1");
        String myemail = req.getParameter("email1");
        String mypass = req.getParameter("pass1");
        String mygender = req.getParameter("gender1");
        String mycity = req.getParameter("city1");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "12345678");

            PreparedStatement ps = con.prepareStatement("INSERT INTO register(name, email, password, gender, city) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, myname);
            ps.setString(2, myemail);
            ps.setString(3, mypass);
            ps.setString(4, mygender);
            ps.setString(5, mycity);

            int count = ps.executeUpdate();
            resp.setContentType("text/html");

            if (count > 0) {
                out.print("<h3 style='color:green'>User Registered Successfully</h3>");
            } else {
                out.print("<h3 style='color:red'>User Not Registered Due to Some Error</h3>");
            }

            RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
            rd.include(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            out.print("<h3 style='color:red'>Exception Occurred: " + e.getMessage() + "</h3>");

            RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
            rd.include(req, resp);
        }
    }
}