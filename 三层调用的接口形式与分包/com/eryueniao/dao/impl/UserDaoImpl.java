package com.eryueniao.dao.impl;

import com.eryueniao.dao.UserDao;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    //jdbc操作:连接数据库,执行sql语句
    @Override
    public void jdbcMethod(String username,String password) {
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
            ps.setString(1, username);
            ps.setString(2, password);
            //7.执行sql语句
            resultSet = ps.executeQuery();
            //8.处理结果
        /*while (resultSet.next()){

        }*/
            if (resultSet != null && resultSet.next()) {
                String account = resultSet.getString(2);
                String passwordStr = resultSet.getString("password");
                String userName = resultSet.getString("user_name");
                System.out.println(account);
                System.out.println(passwordStr);
                System.out.println(userName);
            }else {
                System.out.println("用户名或密码有误");
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
    }
}
