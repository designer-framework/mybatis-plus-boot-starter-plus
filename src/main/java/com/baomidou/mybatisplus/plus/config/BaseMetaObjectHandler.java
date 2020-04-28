package com.baomidou.mybatisplus.plus.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.reflection.MetaObject;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @Project: payment
 * @Package: com.wisdom.framwork.mybatis.config
 * @Author: Designer
 * @CreateTime: 2019-11-02 12
 * @Description: 字段填充器, 具体填充规则由子类实现，并注入到容器。前置后置不强制实现，提供拓展
 */
@Log4j2
public class BaseMetaObjectHandler implements MetaObjectHandler {

    public void preInsertFill(MetaObject metaObject) {

    }

    public void afterInsertFill(MetaObject metaObject) {

    }

    /**
     * 插入填充策略
     *
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        preInsertFill(metaObject);
        Object createTime = getFieldValByName("createTime", metaObject);
        Object createBy = getFieldValByName("createBy", metaObject);
        if (createTime == null) {
            setInsertFieldValByName("createTime", LocalDateTime.now(), metaObject);
        }
        if (createBy == null) {
            //创建人为1，则表示为系统调用
            setInsertFieldValByName("createBy", new BigInteger("1"), metaObject);
        }
        afterInsertFill(metaObject);
    }

    public void preUpdateFill(MetaObject metaObject) {

    }

    public void afterUpdateInsertFill(MetaObject metaObject) {

    }

    /**
     * 更新填充策略
     *
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        Object updateTime = getFieldValByName("updateTime", metaObject);
        Object updateBy = getFieldValByName("updateBy", metaObject);
        if (updateTime == null) {
            setUpdateFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        }
        if (updateBy == null) {
            setUpdateFieldValByName("updateBy", new BigInteger("1"), metaObject);
        }
    }
}
