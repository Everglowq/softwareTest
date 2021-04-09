package com.wq.test3.service.impl;

import com.wq.test3.entity.Type;
import com.wq.test3.mapper.TypeMapper;
import com.wq.test3.service.ITypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {

}
