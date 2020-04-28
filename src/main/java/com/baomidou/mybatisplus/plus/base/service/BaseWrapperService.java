package com.baomidou.mybatisplus.plus.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.plus.base.dao.BaseExpandMapper;

/**
 * 如果是业务层接口继承，实现类必须实现类该方法
 * 如果是持久层继承，则无需实现接口
 *
 * @param <T> 泛型
 */
public interface BaseWrapperService<T> extends IService<T>, BaseExpandMapper<T> {
}
