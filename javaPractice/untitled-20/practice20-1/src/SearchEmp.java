import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchEmp {
    public static void main(String[] args) {
        Connection con;
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/test";
        String user="root";
        String password="xzl953277";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("数据库连接成功");
            }
            Statement statement = con.createStatement();
            String sql = "select * from new_table;";
            ResultSet resultSet = statement.executeQuery(sql);
            String name;
            String id;
            while (resultSet.next()) {
                name = resultSet.getString("name");
                id = resultSet.getString("id");
                System.out.println("编号：" + id+",姓名："+name);
            }
            resultSet.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            System.out.println("数据库连接失败");
        }
    }
}
