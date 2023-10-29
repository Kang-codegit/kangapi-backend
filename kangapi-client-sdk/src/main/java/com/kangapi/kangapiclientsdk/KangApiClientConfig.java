package com.kangapi.kangapiclientsdk;


import com.kangapi.kangapiclientsdk.client.KangApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("kangapi.client")
@Data
@ComponentScan
public class KangApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public KangApiClient kangApiClient(){
        return new KangApiClient(accessKey,secretKey);
    }
}
