package org.eclipse.jetty.belajar.dao.impl;

import org.eclipse.jetty.belajar.connection.DatabaseConnection;
import org.eclipse.jetty.belajar.dao.UserDAO;
import org.eclipse.jetty.belajar.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private Connection connection = DatabaseConnection.getInstance().getConnection();

    @Override
    public User save(User param) {
        try {
            String sql = "insert into table_user (username,password) value (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, param.getUsername());
            preparedStatement.setString(2, param.getPassword());
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Data berhasil disimpan");
            } else {
                System.out.println("Gagal simpan data");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Gagal insert data error : " + e.getMessage());
        }
        return param;
    }

    @Override
    public User update(User param) {
        try {
            String sql = "update table_user set username=?,password=? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, param.getUsername());
            preparedStatement.setString(2, param.getPassword());
            preparedStatement.setInt(3, param.getId());
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Data berhasil update");
            } else {
                System.out.println("Gagal update data");
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Gagal update data error : " + e.getMessage());
        }
        return param;
    }

    @Override
    public int delete(User param) {
        int result = 0;
        try {
            String sql = "delete from table_user where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, param.getId());
            result = preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Gagal delete data error : " + e.getMessage());
        }
        return result;
    }

    @Override
    public User findById(User param) {
        User user = null;
        try {
            String sql = "select * from table_user where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, param.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from table_user");
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                users.add(user);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User getUserByUsername() {
        return null;
    }
}
