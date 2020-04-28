package com.baomidou.mybatisplus.plus.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.plus.dao.WrapperMapper;

import java.io.Serializable;


/**
 * 业务层接口实现
 *
 * @param <M> 封装好的通用mapper接口
 * @param <T> mapper接口泛型实体类
 */
public abstract class AbstractBaseWrapperServiceImpl<M extends WrapperMapper<T>, T extends Serializable> extends ServiceImpl<M, T> {


}
