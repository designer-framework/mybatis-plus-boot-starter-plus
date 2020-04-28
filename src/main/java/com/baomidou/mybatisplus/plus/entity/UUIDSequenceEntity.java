package com.baomidou.mybatisplus.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.plus.base.entity.BaseEntity;
import lombok.Data;

/**
 * @Project: payment_reconciliation
 * @Package: com.wisdom.framwork.mybatis.base.entity
 * @Author: Designer
 * @CreateTime: 2019-10-25 14
 * @Description: UUID自增长通用类
 */
@Data
public class UUIDSequenceEntity extends BaseEntity {

    private static final long serialVersionUID = 5621486967769202705L;

    @TableId(value = "id", type = IdType.UUID)
    protected String id;
}
