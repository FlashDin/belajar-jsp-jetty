package org.eclipse.jetty.belajar.test;


import org.eclipse.jetty.belajar.dao.UserDAO;
import org.eclipse.jetty.belajar.dao.impl.UserDAOImpl;
import org.eclipse.jetty.belajar.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserDAOImplTest {

    UserDAO userDAO;

    @Before
    public void setUp() throws Exception {
        userDAO = new UserDAOImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void save() {
        User user = new User();
        user.setUsername("name");
        user.setPassword("pass");
        User data = userDAO.save(user);
        assertNotNull(data);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void findAll() {
        List<User> users = userDAO.findAll();
        assertNotNull(users);
        assertEquals(2, users.size());
    }

    @Test
    public void getUserByUsername() {
    }
}