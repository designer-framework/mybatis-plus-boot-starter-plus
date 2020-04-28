package com.baomidou.mybatisplus.plus.service;

import com.baomidou.mybatisplus.plus.base.service.BaseWrapperService;

import java.io.Serializable;

/**
 * 业务层接口包装类
 *
 * @param <T> 实体类
 */
public interface WrapperService<T extends Serializable> extends BaseWrapperService<T> {
}
