package cn.st.spring.mybatis.base;

import java.util.List;

/**
 * Created by coolearth on 17-8-5.
 */
public class BaseServiceImpl<E,S> implements BaseService<E,S>{
    private BaseMapper baseMapper;

    public void injectBaseMapper(BaseMapper baseMapper){
        this.baseMapper=baseMapper;
    }

    @Override
    public void add(E entity) {
        baseMapper.insert(entity);
    }

    @Override
    public void update(E entity) {
        baseMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public E load(int id) {
        return (E) baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(int id) {
        baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<E> findAll(S entity) {
        return baseMapper.selectByExample(entity);
    }

    @Override
    public long count(S entity) {
        return baseMapper.countByExample(entity);
    }
}
