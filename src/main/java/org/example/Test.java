package learn3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动(固定格式)
        Class.forName("com.mysql.cj.jdbc.Driver");//有异常直接快捷键alt+回车键抛出就好了

        //2.获取连接--连接库my
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ivandb","root","110406");//root和123456是自己的数据库账号和密码

        //定义sql语句---例子：删除数据库中的cy表
        String sql = "drop table if exists cy";

        //获取sql的对象
        Statement stmt = conn.createStatement();

        //执行sql
        stmt.executeUpdate(sql);
    }
}
