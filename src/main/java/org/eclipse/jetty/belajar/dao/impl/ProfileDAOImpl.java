package org.eclipse.jetty.belajar.dao.impl;

import org.eclipse.jetty.belajar.connection.DatabaseConnection;
import org.eclipse.jetty.belajar.dao.ProfileDAO;
import org.eclipse.jetty.belajar.entity.Profile;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfileDAOImpl implements ProfileDAO {

    private Connection connection = DatabaseConnection.getInstance().getConnection();

    @Override
    public Profile save(Profile param) {
        try {
            String sql = "insert into table_profile (namaLengkap,alamat,umur,jk) value (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, param.getNamaLengkap());
            preparedStatement.setString(2, param.getAlamat());
            preparedStatement.setInt(3, param.getUmur());
            preparedStatement.setString(4, param.getJk());
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
    public Profile update(Profile param) {
        try {
            String sql = "update table_profile set namaLengkap=?,alamat=?,umur=?,jk=? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, param.getNamaLengkap());
            preparedStatement.setString(2, param.getAlamat());
            preparedStatement.setInt(3, param.getUmur());
            preparedStatement.setString(4, param.getJk());
            preparedStatement.setInt(5, param.getId());
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
    public int delete(Profile param) {
        int result = 0;
        try {
            String sql = "delete from table_profile where id = ?";
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
    public Profile findById(Profile param) {
        Profile profile = null;
        try {
            String sql = "select * from table_profile where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, param.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                profile = new Profile();
                profile.setId(resultSet.getInt("id"));
                profile.setNamaLengkap(resultSet.getString("namaLengkap"));
                profile.setAlamat(resultSet.getString("alamat"));
                profile.setUmur(resultSet.getInt("umur"));
                profile.setJk(resultSet.getString("jk"));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profile;
    }

    @Override
    public List<Profile> findAll() {
        List<Profile> profiles = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from table_profile");
            while (resultSet.next()) {
                Profile profile = new Profile();
                profile.setId(resultSet.getInt("id"));
                profile.setNamaLengkap(resultSet.getString("namaLengkap"));
                profile.setAlamat(resultSet.getString("alamat"));
                profile.setUmur(resultSet.getInt("umur"));
                profile.setJk(resultSet.getString("jk"));
                profiles.add(profile);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profiles;
    }

}
