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
    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ads";
//        Statement stmt = null;
//        ResultSet rs = null;
        List<Ad> adList = new ArrayList<>();
    try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);

        while (rs.next()) {
            adList.add(new Ad(
                    rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description")
            ));


            System.out.println("Here is an ad: ");
            System.out.println(" Ad id: " + rs.getLong("id"));
            System.out.println(" Ad title: " + rs.getString("title"));
            System.out.println(" Ad description: " + rs.getString("description"));
        }
    } catch (SQLException e){
        e.printStackTrace();
    }
        return adList;
    }

    @Override
    public Long insert(Ad ad) {
        long newId = 0;
        try {
            String sql = "INSERT INTO ads (user_id, title, description) " +
                    "VALUES("+ad.getUserId()+", '"+ad.getTitle()+"', '"+ad.getDescription()+"')";
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                newId = rs.getLong(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return newId;
    }

//    public static void main(String[] args) throws SQLException {
//        MySQLAdsDao testDAO = new MySQLAdsDao();
//
//        testDAO.all();
//    }
}
