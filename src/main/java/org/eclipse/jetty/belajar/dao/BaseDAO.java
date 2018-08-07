package org.eclipse.jetty.belajar.dao;

import java.util.List;

public interface BaseDAO<T> {

    T save(T param);

    T update(T param);

    int delete(T param);

    T findById(T param);

    List<T> findAll();

}
