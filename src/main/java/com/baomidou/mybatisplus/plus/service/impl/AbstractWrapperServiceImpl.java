package com.baomidou.mybatisplus.plus.service.impl;

import com.baomidou.mybatisplus.plus.dao.WrapperMapper;
import com.baomidou.mybatisplus.plus.base.service.impl.AbstractBaseWrapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * 封装好的抽象业务层接口，直接继承即可。如接口中有通用的方法，则直接在此实现，否则留给子类实现
 *
 * @param <T> 实体类
 * @author Designer
 */
public abstract class AbstractWrapperServiceImpl<M extends WrapperMapper<T>, T extends Serializable> extends AbstractBaseWrapperServiceImpl<M, T> {

    @Autowired
    protected M wrapperMapper;

}
