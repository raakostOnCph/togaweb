package persistens;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KundeMapper {

    public static List<Kunde> lavKundeListe() {

        List<Kunde> kundeList = new ArrayList<>();


        try {
            Connection con = Connector.connection();
            String sql = "select * from kunder";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery(sql);


            while (resultSet.next()) {

                Kunde kunde = new Kunde (resultSet.getInt("idkunder"),
                resultSet.getString("navn"));
                kundeList.add(kunde);

            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return kundeList;
    }

}
