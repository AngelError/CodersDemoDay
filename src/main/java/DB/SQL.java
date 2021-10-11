package DB;

import java.sql.*;

public class SQL {
    private static final String url = "jdbc:postgresql://localhost:5432/hospital";
    private static final String username = "postgres";
    private static final String password = "error2002";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static Statement getStatement() {

        Statement statement = null;
        try {
            statement = getConnection().createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return statement;
    }

    public static Integer collectData() {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = SQL.getConnection().prepareStatement("select max(id) as max from patient");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ResultSet resultSet = null;
        try {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        Integer id = null;
        if (resultSet != null) {
            try {
                if (resultSet.next()) {
                    id = resultSet.getInt("max");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return id;
    }
}
