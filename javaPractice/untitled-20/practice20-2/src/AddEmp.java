import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class AddEmp {
    public static void insertdata(Connection conn)  //插入数据函数
    {
        try
        {
            PreparedStatement psql = conn.prepareStatement("insert into tb_stu (id,name,sex,birthday)"+"values(?,?,?,?)");  //用preparedStatement预处理来执行sql语句
            psql.setInt(1, 3);  //给其四个参量分别“赋值”
            psql.setString(2, "李护士");
            psql.setString(3, "女");
            DateFormat mydateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date mydate = mydateFormat.parse("1999-10-20");
            psql.setDate(4, new java.sql.Date(mydate.getTime()));
            psql.executeUpdate();  //参数准备后执行语句
            psql.close();
        }catch(SQLException e){
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("数据库数据插入成功！"+"\n");
        }
    }
    public static void main(String[] args) {
        Connection con;
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8";   //声明utf-8，插入数据避免中文乱码
        String user="root";
        String password="xzl953277";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("数据库连接成功");
            }
            insertdata(con);             //插入数据
            Statement statement = con.createStatement();
            String sql = "select * from tb_stu;";
            ResultSet resultSet = statement.executeQuery(sql);
            String name;
            String id;
            String sex;
            String bir;
            while (resultSet.next()) {
                name = resultSet.getString("name");
                id = resultSet.getString("id");
                sex = resultSet.getString("sex");
                bir = resultSet.getString("birthday");
                System.out.println("编号：" + id + ",姓名：" + name + ",性别：" + sex + "，出生日期：" + bir);
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
