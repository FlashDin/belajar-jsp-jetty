package org.eclipse.jetty.belajar.dao;

import org.eclipse.jetty.belajar.entity.User;

public interface UserDAO extends BaseDAO<User> {

    public User getUserByUsername();

}
