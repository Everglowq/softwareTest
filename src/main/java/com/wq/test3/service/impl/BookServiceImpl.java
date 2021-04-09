package com.wq.test3.service.impl;

import com.wq.test3.entity.Book;
import com.wq.test3.mapper.BookMapper;
import com.wq.test3.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangqian
 * @since 2021-03-26
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
