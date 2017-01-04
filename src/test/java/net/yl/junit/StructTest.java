package net.yl.junit;

import net.yl.system.user.entity.User;

import org.junit.Test;

public class StructTest {

    
    @Test
    public void test(){
         User user = new User();
         user.setCreater(new User());
         System.out.println(user);
    }
}
