package org.eclipse.jetty.belajar.service.dao;

import java.util.List;

public interface BaseServiceDAO<T> {

    T save(T param);

    T update(T param);

    int delete(T param);

    T findById(T param);

    List<T> findAll();
}
