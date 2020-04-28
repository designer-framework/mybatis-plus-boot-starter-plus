package com.baomidou.mybatisplus.plus.dao;

import com.baomidou.mybatisplus.plus.base.dao.BaseWrapperMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * 此接口继承mybatis plus的 ${@link com.baomidou.mybatisplus.core.mapper.BaseMapper} 接口
 * 可自行拓展全局持久层通用方法
 *
 * @param <T>
 * @author Designer
 */
@Mapper
public interface WrapperMapper<T extends Serializable> extends BaseWrapperMapper<T> {

}
