import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLQuotesDao implements Quotes{
    private Connection connection;
    private Config config = new Config();

    public MySQLQuotesDao() throws SQLException{ new Driver();
        this.connection = DriverManager.getConnection(
                config.getURL(),
                config.getUser(),
                config.getPassword()
        );
    }

    @Override
    public List<Quote> all() throws SQLException {
        String selectQuery = "SELECT * FROM quotes";
        Statement statement = connection.createStatement();

        ResultSet resultSet = null;

        List<Quote> quoteList = new ArrayList<>();

        resultSet = statement.executeQuery(selectQuery);
        while(resultSet.next()){
            System.out.println("Here's a quote: ");
            System.out.println(" id: " + resultSet.getLong("id"));
            System.out.println(" Author first name: " + resultSet.getString("author_first_name"));
        }


        return null;
    }

    public static void main(String[] args) throws SQLException {
        MySQLQuotesDao mySQLQuotesDao = new MySQLQuotesDao();

        List<Quote> liveCodeQuotes = MySQLQuotesDao.all();
    }

}
