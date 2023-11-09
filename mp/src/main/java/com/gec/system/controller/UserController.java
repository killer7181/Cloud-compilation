package com.gec.system.controller;

import cn.hutool.core.bean.BeanUtil;
import com.gec.system.entity.dto.UserFormDTO;
import com.gec.system.entity.po.User;
import com.gec.system.entity.vo.UserVO;
import com.gec.system.query.UserQuery;
import com.gec.system.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "用户管理接口")
@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;

    @ApiOperation("新增用户接口")
    @PostMapping
    public void saveUser(@RequestBody UserFormDTO userDTO) {
        User user = BeanUtil.copyProperties(userDTO, User.class);
        userService.save(user);
    }

    @ApiOperation("删除用户接口")
    @DeleteMapping("{id}")
    public void deleteUserById(@ApiParam("用户id") @PathVariable("id") Long id) {
        userService.removeById(id);
    }

    @ApiOperation("根据id查询用户接口")
    @GetMapping("{id}")
    public UserVO querUserById(@ApiParam("用户id") @PathVariable("id") Long id) {
        User user = userService.getById(id);
        return BeanUtil.copyProperties(user, UserVO.class);
    }

    @ApiOperation("根据id批量查询用户接口")
    @GetMapping("/ids/{ids}")
    public List<UserVO> queryUserByIds(@ApiParam("用户id集合") @PathVariable("ids") List<Long> ids) {
        List<User> users = userService.listByIds(ids);
       return BeanUtil.copyToList(users,UserVO.class);
    }

    @ApiOperation("扣减用户余额接口")
    @PutMapping("/{id}/deduction/{money}")
    public void deductBalance(
            @ApiParam("用户id") @PathVariable("id") Long id,
            @ApiParam("扣减的金额") @PathVariable("money") Integer money) {
        userService.deductBalance(id,money);
    }

    @ApiOperation("根据复杂条件查询用户接口")
    @GetMapping("/list")
    public List<UserVO> queryUsers(UserQuery query) {
        List<User> users=userService.queryUsers(
        query.getName(),query.getStatus(),query.getMinBalance(),query.getMaxBalance());
        return BeanUtil.copyToList(users,UserVO.class);
    }
}
