package org.eclipse.jetty.belajar.service.impl;

import org.eclipse.jetty.belajar.dao.UserDAO;
import org.eclipse.jetty.belajar.dao.impl.UserDAOImpl;
import org.eclipse.jetty.belajar.entity.User;
import org.eclipse.jetty.belajar.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public User save(User param) {
        return userDAO.save(param);
    }

    @Override
    public User update(User param) {
        return userDAO.update(param);
    }

    @Override
    public int delete(User param) {
        return userDAO.delete(param);
    }

    @Override
    public User findById(User param) {
        return userDAO.findById(param);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
