package org.eclipse.jetty.belajar.service;

import java.util.List;

public interface BaseService<T> {

    T save(T param);

    T update(T param);

    int delete(T param);

    T findById(T param);

    List<T> findAll();
}
