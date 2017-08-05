package cn.st.spring.mybatis.base;

import java.util.List;

/**
 * Created by coolearth on 17-8-5.
 */
public interface BaseMapper<E,S> {

    long countByExample(S example);

    int deleteByPrimaryKey(Integer id);

    int insert(E record);

    List<E> selectByExample(S example);


    E selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(E record);

}
