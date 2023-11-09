package com.gec.system;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.gec.system.entity.po.User;
import com.gec.system.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Autowired
    private UserMapper userMapper;
@Test
public void testSelect(){
    List<User> userList=userMapper.selectList(null);
   userList.forEach(System.out::println);
// userList.forEach(user -> System.out.println(user.getId()+"-"+user.getName()+"-"+user.getAge()+"-"+user.getEmail()));
}
//@Test
//    public void testAdd(){
//    User user=new User();
//    user.setName("LuBenWei");
//    user.setAge(108);
//    user.setEmail("1008611@163.com");
//
//
//    int insert = userMapper.insert(user);
//    System.err.println(insert);
//    System.out.println(user.getId());
////    testSelect();
//
//}
//@Test
//    public void testDelete(){
//
//    int i = userMapper.deleteById(0);
//    System.out.println(i);
//}
//@Test
//    public void testQueryWrapper(){
//    QueryWrapper<User> wrapper=new QueryWrapper<User>().select("id","name","age","email").like("name", "e").ge("age",20);
//    List<User> users=userMapper.selectList(wrapper);
//    users.forEach(System.out::println);
//}
//    @Test
//    public void LambdaQueryWrapper(){
//        LambdaQueryWrapper<User> wrapper=new LambdaQueryWrapper<User>().select(User::getId,User::getName,User::getAge,User::getEmail).like(User::getName, "n").ge(User::getAge,10);
//        List<User> users=userMapper.selectList(wrapper);
//        users.forEach(System.out::println);
//    }
//@Test
//    public void testQueryWrapper2(){
//    User user=new User();
//    user.setAge(99);
//    QueryWrapper<User> wrapper=new QueryWrapper<User>().eq("name", "Tom");
//userMapper.update(user, wrapper);
//    testSelect();
//
//}
//
//@Test
//    public void testUpdateWrapper(){
//    List<Long> ids = new ArrayList<>();
//    ids.add(1L);
//    ids.add(2L);
//    ids.add(4L);
//    UpdateWrapper<User> wrapper=new UpdateWrapper<User>().setSql("age=age-10" ).in("id",ids);
//    userMapper.update(null, wrapper);
//}
//@Test
//    public void testCustomSqlUpdate(){
//    List<Long> ids=new ArrayList<>();
//    ids.add(1l);
//    ids.add(2l);
//    ids.add(3l);
//    int amount=100;
//    LambdaQueryWrapper<User> wrapper=new LambdaQueryWrapper<User>().in(User::getId,ids);
//    userMapper.UpdateAgeByIds(wrapper,amount);
//
//}
//@Test
//    public void testIdChange(){
//    List<Long> list=new ArrayList<>();
//    int number=5;
//    User user=new User();
//    LambdaQueryWrapper<User> wrapper=new LambdaQueryWrapper<>().like(user::getName,"o");
//userMapper.UpdateIdBuname(wrapper,number);
//}
}
