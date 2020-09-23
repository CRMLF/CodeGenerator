package com.hznu.codegenerator.lz.service.impl;

import com.hznu.codegenerator.lz.entity.User;
import com.hznu.codegenerator.lz.mapper.UserMapper;
import com.hznu.codegenerator.lz.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LingZhi
 * @since 2020-09-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
