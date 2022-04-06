
import java.sql.*;

import com.mysql.cj.jdbc.Driver;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/ad")
public class AdsServer extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "adUser",
                    "4495"
            );

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM ads;"); // Grabs info from database and bring back
//            statement.execute() --- DELETE
//              statement.executeUpdate() --- UPDATE



            while (rs.next()){
                quoteList.add(rs.getString("ads") + " | " + rs.getString("description"));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }


    }


    public AdsServer() throws SQLException {

    }
}
