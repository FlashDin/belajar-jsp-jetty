package org.eclipse.jetty.belajar.service;

import org.eclipse.jetty.belajar.dao.UserDAO;
import org.eclipse.jetty.belajar.dao.impl.UserDAOImpl;
import org.eclipse.jetty.belajar.entity.User;
import org.eclipse.jetty.belajar.service.dao.UserServiceDAO;

import java.util.List;

public class UserService implements UserServiceDAO {

    private UserDAO userDAO = (UserDAO) new UserDAOImpl();

    @Override
    public User save(User param) {
        User data = userDAO.save(param);
        return data;
    }

    @Override
    public User update(User param) {
        User data = userDAO.update(param);
        return data;
    }

    @Override
    public int delete(User param) {
        int data = userDAO.delete(param);
        return data;
    }

    @Override
    public User findById(User param) {
        User data = userDAO.findById(param);
        return data;
    }

    @Override
    public List<User> findAll() {
        List<User> users = userDAO.findAll();
        return users;
    }
}
