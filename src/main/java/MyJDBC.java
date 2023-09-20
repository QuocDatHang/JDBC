import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-test", "root", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from people");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("age"));
            }
//================================================================================================
/*
            // Truy vấn SQL INSERT với tham số (?)
            String insertData = "INSERT INTO people (id, name, age) VALUES (?, ?, ?)";

            // Tạo PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(insertData);

            // Đặt giá trị cho các tham số (?)
            preparedStatement.setInt(1, 5);
            preparedStatement.setString(2, "huy");
            preparedStatement.setInt(3, 18);

            // Thực thi truy vấn INSERT
            preparedStatement.executeUpdate();
*/
//================================================================================================
            /*
            // Truy vấn SQL UPDATE với tham số (?)
            String sql = "UPDATE people SET age = ?, name = ? WHERE id = ?";

            // Tạo PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Đặt giá trị cho các tham số (?)
            preparedStatement.setInt(1, 35); // Đặt tuổi mới
            preparedStatement.setString(2, "dat"); // Đặt tên mới
            preparedStatement.setInt(3, 1); // Chọn id cần UPDATE


            // Thực thi truy vấn UPDATE
            preparedStatement.executeUpdate();
            */
//================================================================================================
            /*
            // Truy vấn SQL DELETE với tham số (?)
            String sql = "DELETE FROM people WHERE name = ?";

            // Tạo PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Đặt giá trị cho các tham số (?)
            preparedStatement.setString(1, "huy"); // Đặt tên người cần xóa

            // Thực thi truy vấn DELETE
            preparedStatement.executeUpdate();
            */
//================================================================================================
/*
            CallableStatement callableStatement = connection.prepareCall("{call sortAge()}");

            // Thực thi thủ tục lưu trữ
            callableStatement.execute();
*/
            // Đóng PreparedStatement và kết nối
//            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



