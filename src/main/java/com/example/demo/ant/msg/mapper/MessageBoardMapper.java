package com.example.demo.ant.msg.mapper;

import com.example.demo.ant.msg.entity.MessageBoard;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 留言板 Mapper 接口
 * </p>
 *
 * @author demo
 * @since 2018-10-22
 */
@Mapper
public interface MessageBoardMapper extends BaseMapper<MessageBoard> {

}
