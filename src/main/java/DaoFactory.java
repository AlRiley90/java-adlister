import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    static Config config = new Config();

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }

}
