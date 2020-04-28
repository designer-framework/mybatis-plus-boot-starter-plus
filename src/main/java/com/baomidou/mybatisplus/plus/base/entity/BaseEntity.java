package com.baomidou.mybatisplus.plus.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @Project: payment_reconciliation
 * @Package: com.wisdom.framwork.mybatis.base.entity
 * @Author: Designer
 * @CreateTime: 2019-10-25 14
 * @Description:
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -2081870120341145890L;
    /**
     * 数据插入时间
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected LocalDateTime createTime;

    /**
     * 添加数据人ID
     */
    @TableField(fill = FieldFill.INSERT)
    protected BigInteger createBy;

    /**
     * 数据更新时间
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    protected LocalDateTime updateTime;

    /**
     * 数据更新人ID
     */
    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    protected BigInteger updateBy;

    /**
     * 数据版本
     */
    @Version
    protected Integer version;

}
