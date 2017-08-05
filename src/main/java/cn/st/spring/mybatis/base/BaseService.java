package cn.st.spring.mybatis.base;

import java.util.List;

/**
 * Created by coolearth on 17-8-5.
 */
public interface BaseService<E,S> {
    void add(E entity);
    void update(E entity);
    E load(int id);
    void delete(int id);
    List<E> findAll(S entity);
    long count(S entity);
}
