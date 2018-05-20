package Demo.com.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String userName = "root";
        String password = "84548454";
        String connectionUrl = "jdbc:mysql://localhost:3306/travel";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
        Statement statement = connection.createStatement()) {
//            System.out.println("Есть коннект");

                //заносим данные
//            statement.execute("insert  into users (nickname,firstn_ame, email, password, second_name) values" +
//                    "('mot','tot','test@test.com','121212','pet')");

                //обновляем данные
//            statement.executeUpdate("update users set nickname= 'Met' where users_id ='4'");

            //вернет количество изменненых строк
//            int count = statement.executeUpdate("update users set nickname= 'Met' where users_id ='4'");

            //пакетное добавление
//            statement.addBatch("...");
//            statement.executeBatch();
//            statement.clearBatch();

            //извлекаем данные
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("users_id"));
                System.out.println(resultSet.getString("nickname"));
            }
            //защита от иньекций
            String usID = "1";
            System.out.println("-----------------------------------------");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where users_id = ?");
            preparedStatement.setString(1, usID);

            ResultSet resultSet1 = preparedStatement.executeQuery();
            while (resultSet1.next()){
                System.out.println(resultSet1.getString("nickname"));
                System.out.println(resultSet1.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
