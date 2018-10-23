package com.example.demo.ant.tags.mapper;

import com.example.demo.ant.tags.entity.Tags;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 标签 Mapper 接口
 * </p>
 *
 * @author demo
 * @since 2018-10-22
 */
@Mapper
public interface TagsMapper extends BaseMapper<Tags> {

}
