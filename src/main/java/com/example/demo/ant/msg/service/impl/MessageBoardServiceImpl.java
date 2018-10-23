package com.example.demo.ant.msg.service.impl;

import com.example.demo.ant.msg.entity.MessageBoard;
import com.example.demo.ant.msg.mapper.MessageBoardMapper;
import com.example.demo.ant.msg.service.IMessageBoardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 留言板 服务实现类
 * </p>
 *
 * @author demo
 * @since 2018-10-22
 */
@Service
public class MessageBoardServiceImpl extends ServiceImpl<MessageBoardMapper, MessageBoard> implements IMessageBoardService {

}
