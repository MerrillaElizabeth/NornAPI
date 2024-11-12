package com.ZHF.nornapiinterface;

import com.ZHF.nornapiclientsdk.client.nornApiClient;
import com.ZHF.nornapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *
 * @author ZHF
 *  
 */
@SpringBootTest
class nornapiInterfaceApplicationTests {

    @Resource
    private nornApiClient nornApiClient;

    @Test
    void contextLoads() {
        String result = nornApiClient.getNameByGet("ZHF");
        User user = new User();
        user.setUsername("ZHF");
        String usernameByPost = nornApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
