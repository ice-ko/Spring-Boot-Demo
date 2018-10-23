package com.example.demo.ant.tags.service.impl;

import com.example.demo.ant.tags.entity.Tags;
import com.example.demo.ant.tags.mapper.TagsMapper;
import com.example.demo.ant.tags.service.ITagsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签 服务实现类
 * </p>
 *
 * @author demo
 * @since 2018-10-22
 */
@Service
public class TagsServiceImpl extends ServiceImpl<TagsMapper, Tags> implements ITagsService {

}
