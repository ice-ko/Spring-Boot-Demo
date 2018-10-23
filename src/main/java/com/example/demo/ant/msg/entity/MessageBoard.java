package com.example.demo.ant.msg.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 留言板
 * </p>
 *
 * @author demo
 * @since 2018-10-22
 */
@TableName("MessageBoard")
public class MessageBoard implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 留言板标识
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 标题
     */
    @TableField("Title")
    private String Title;

    /**
     * 内容
     */
    @TableField("Content")
    private String Content;

    /**
     * 邮箱
     */
    @TableField("Email")
    private String Email;

    /**
     * 名称
     */
    @TableField("Name")
    private String Name;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime CreateTime;

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
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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
    public Integer getValid() {
        return Valid;
    }

    public void setValid(Integer Valid) {
        this.Valid = Valid;
    }

    @Override
    public String toString() {
        return "MessageBoard{" +
        "Id=" + Id +
        ", Title=" + Title +
        ", Content=" + Content +
        ", Email=" + Email +
        ", Name=" + Name +
        ", CreateTime=" + CreateTime +
        ", Valid=" + Valid +
        "}";
    }
}
