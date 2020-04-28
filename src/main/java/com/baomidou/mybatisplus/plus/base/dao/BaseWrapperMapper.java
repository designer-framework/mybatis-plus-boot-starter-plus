package com.baomidou.mybatisplus.plus.base.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.io.Serializable;

/**
 * 通用持久层接口，只需继承即可实现crud,目前WrapperMapper类继承本类作为本框架dao层的最底层数据库持久层组件
 * 如再注入本类或者它的父类或父接口，spring会抛出多个bean注入异常
 *
 * @param <T>
 */
public interface BaseWrapperMapper<T extends Serializable> extends BaseMapper<T>, BaseExpandMapper<T> {

}
