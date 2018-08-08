package org.eclipse.jetty.belajar.dao;

import org.eclipse.jetty.belajar.dao.impl.UserDAOImpl;
import org.eclipse.jetty.belajar.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserDAOImplTest {

    private UserDAO userDAO;

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
        User user = new User();
        user.setUsername("name");
        user.setPassword("pass");
        user.setId(1);
        User data = userDAO.update(user);
        assertEquals(1, data);
        assertNotNull(data);
    }

    @Test
    public void delete() {
        User user = new User();
        user.setId(1);
        int data = userDAO.delete(user);
        assertNotNull(data);
    }

    @Test
    public void findById() {
        User user = new User();
        user.setId(2);
        User data = userDAO.findById(user);
        assertEquals(1, data);
        assertNotNull(data);
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