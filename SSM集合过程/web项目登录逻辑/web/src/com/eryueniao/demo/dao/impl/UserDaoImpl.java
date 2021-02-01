package com.eryueniao.demo.dao.impl;

import com.eryueniao.demo.bean.UserInfo;
import com.eryueniao.demo.dao.UserDao;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(UserInfo userInfo) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            //1.导入依赖的jar包 : jar放到lib文件夹中,还需要右键选择add as library
            //2.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //3.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/epidemic", "root", "root");
            //4.创建sql语句
            String sql = "SELECT * FROM users WHERE account=? AND PASSWORD=?";
            //5.获取执行对象
            ps = conn.prepareStatement(sql);
            //6.使用执行对象给?赋值
            ps.setString(1, userInfo.getAccount());
            ps.setString(2, userInfo.getPassword());
            //7.执行sql语句
            resultSet = ps.executeQuery();
            //8.处理结果
            if (resultSet != null && resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //9.关闭连接,释放资源
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
