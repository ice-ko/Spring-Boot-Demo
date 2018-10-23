package com.example.demo.ant.tags.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 标签
 * </p>
 *
 * @author demo
 * @since 2018-10-22
 */
@TableName("Tags")
public class Tags implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签标识
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 标签名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 修改时间
     */
    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    /**
     * 该字段表示是否被删除(0-删除,1-未删除)，默认为1
     */
    @TableField("Valid")
    private Integer Valid;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }
    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }
    public Integer getValid() {
        return Valid;
    }

    public void setValid(Integer Valid) {
        this.Valid = Valid;
    }

    @Override
    public String toString() {
        return "Tags{" +
        "Id=" + Id +
        ", Name=" + Name +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        ", Valid=" + Valid +
        "}";
    }
}
