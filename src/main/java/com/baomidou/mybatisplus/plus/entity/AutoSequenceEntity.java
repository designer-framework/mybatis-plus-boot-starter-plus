package com.baomidou.mybatisplus.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.plus.base.entity.BaseEntity;

import java.math.BigInteger;

/**
 * @Project: payment_reconciliation
 * @Package: com.wisdom.framwork.mybatis.base.entity
 * @Author: Designer
 * @CreateTime: 2019-10-25 14
 * @Description: INT自增长主键通用类
 */
public class AutoSequenceEntity extends BaseEntity {

    private static final long serialVersionUID = 8838147299896208756L;
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    protected BigInteger id;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
}
