package com.lsf.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DBUtilsTest {

    public static void main(String[] args) throws SQLException {
        
        Connection connection = getConnection();
        PreparedStatement preparedStatement = getPreparedStatement(connection, "select * from t_user limit 1");
        ResultSet resultSet = getResultSet(preparedStatement);

        if (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }

        closeResultSet(resultSet);
        closeStatement(preparedStatement);
        closeConnection(connection);
    }

    public DBUtilsTest() {
    }

    // 用static静态代码块来注册驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MYSQL 驱动注册失败");
        }
    }

    // 创建连接
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("MYSQL 创建连接失败");
        }
        return connection;
    }

    // 创建运输工具，用预编译处理提高效率
    public static PreparedStatement getPreparedStatement(Connection connection, String sql) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("MYSQL 创建运输工具");
        }

        return preparedStatement;
    }

    // 执行sql语句
    public static ResultSet getResultSet(PreparedStatement preparedStatement) {
        ResultSet resultSet = null;

        try {
            resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    // 关闭连接
    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            resultSet = null;
        }
    }

    // 关闭连接
    public static void closeStatement(PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

            preparedStatement = null;
        }
    }

    // 关闭连接
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

            connection = null;
        }
    }

}
