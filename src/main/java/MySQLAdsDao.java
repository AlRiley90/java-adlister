import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;


public class MySQLAdsDao implements Ads{
    private Connection connection;
    private Config config = new Config();

    public MySQLAdsDao() throws SQLException { new Driver();
        this.connection = DriverManager.getConnection(
                config.getURL(),
                config.getUser(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        String selectQuery = "SELECT * FROM ads";
//        Statement stmt = null;
//        ResultSet rs = null;
        List<Ad> adList = new ArrayList<>();

       Statement stmt = connection.createStatement();
       ResultSet rs = stmt.executeQuery(selectQuery);

        while(rs.next()){
            Ad currentAd = new Ad(rs.getLong("id"), rs.getString("title"), rs.getString("description"));
            adList.add(currentAd);

            System.out.println("Here is an ad: ");
            System.out.println(" Ad id: " + rs.getLong("id"));
            System.out.println(" Ad title: " + rs.getString("title"));
            System.out.println(" Ad description: " + rs.getString("description"));
        }
        return null;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads (user_id, title, description) VALUES('PS4', 'brand new playstation')";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if(rs.next()){
            System.out.println("Added a new ad to collection: " + rs.getString("title"));
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        MySQLAdsDao testDAO = new MySQLAdsDao();

        testDAO.all();
    }
}
