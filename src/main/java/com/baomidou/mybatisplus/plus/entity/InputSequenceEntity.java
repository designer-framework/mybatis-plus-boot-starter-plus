package com.baomidou.mybatisplus.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.plus.base.entity.BaseEntity;

/**
 * @Project: payment_reconciliation
 * @Package: com.wisdom.framwork.mybatis.base.entity
 * @Author: Designer
 * @CreateTime: 2019-10-25 14
 * @Description: 用户自定义字符串主键
 */

public class InputSequenceEntity extends BaseEntity {

    private static final long serialVersionUID = 3986983828246231182L;

    @TableId(value = "id", type = IdType.INPUT)
    protected String id;


}
