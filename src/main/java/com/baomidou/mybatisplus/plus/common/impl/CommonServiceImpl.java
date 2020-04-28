package com.baomidou.mybatisplus.plus.common.impl;

import com.baomidou.mybatisplus.plus.dao.WrapperMapper;
import com.baomidou.mybatisplus.plus.service.impl.AbstractWrapperServiceImpl;
import com.baomidou.mybatisplus.plus.common.CommonService;

import java.io.Serializable;

/**
 * @Project: payment
 * @Package: com.wisdom.framwork.common
 * @Author: Designer
 * @CreateTime: 2019-09-20 16
 * @Description: 通用业务层实现类
 */
public class CommonServiceImpl<M extends WrapperMapper<T>, T extends Serializable> extends AbstractWrapperServiceImpl<M, T> implements CommonService<T> {
}
