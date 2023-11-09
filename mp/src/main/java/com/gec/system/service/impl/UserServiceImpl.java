package com.gec.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.system.entity.po.User;
import com.gec.system.mapper.UserMapper;
import com.gec.system.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    @Transactional
    public void deductBalance(Long id, Integer money) {
        User user = getById(id);
        if (user == null || user.getStatus() == 2) {
            throw new RuntimeException("用户状态异常!");
        }
        if (user.getBalance() < money) {
            throw new RuntimeException("用户余额不足!");
        }
        int remainBalance=user.getBalance()-money;
        lambdaUpdate()
                .set(User::getBalance,remainBalance)
                .set(remainBalance==0,User::getStatus,2)
                .eq(User::getId,id)
                .eq(User::getBalance,user.getBalance())//乐观锁
                .update();
    }

    @Override
    public List<User> queryUsers(String name, Integer status, Integer minBalance, Integer maxBalance) {

        return lambdaQuery()
                .like(name != null, User::getUsername, name)
                .eq(status != null, User::getStatus, status)
                .ge(minBalance != null, User::getBalance, minBalance)
                .le(maxBalance != null, User::getBalance, maxBalance)
                .list();

    }
}
