package com.baomidou.mybatisplus.plus.base.dao;

/**
 * 》每个《 拓展接口都需要注入到config
 *
 * @param <T>
 */
public interface BaseExpandMapper<T> {


    /**
     * 自定义拓展接口，例子
     *
     * @param entity 实体类
     * @param id     主键
     * @return 返回结果集
     */
    //List<T> example(T entity, Serializable id);


}
