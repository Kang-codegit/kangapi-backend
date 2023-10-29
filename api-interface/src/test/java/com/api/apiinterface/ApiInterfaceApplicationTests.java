package com.api.apiinterface;

import com.kangapi.kangapiclientsdk.client.KangApiClient;
import com.kangapi.kangapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {
    @Resource
    private KangApiClient kangApiClient;

    @Test
    void contextLoads() {
        String result=kangApiClient.getNameByGet("Testlyk2");
        User user=new User();
        user.setUsername("Testlyk2");
        String usernameByPost=kangApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
