package com.gec.system.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gec.system.entity.po.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    //Constans.WRAPPER
    void UpdateAgeByIds(@Param("ew") LambdaQueryWrapper<User> wrapper, @Param("amount") int amount);

    void UpdateIdBuname(@Param("ew") LambdaQueryWrapper<User> wrapper, @Param("number") int number);

    @Update("UPDATE user SET balance = balance - #{money} WHERE id = #{id}")
    void deductBalance(@Param("id") Long id, @Param("money") Integer money);
}
