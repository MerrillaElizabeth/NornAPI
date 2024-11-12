package com.ZHF.nornapiclientsdk;

import com.ZHF.nornapiclientsdk.client.nornApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * nornApi 客户端配置
 *
 * @author ZHF
 *  
 */
@Configuration
@ConfigurationProperties("nornapi.client")
@Data
@ComponentScan
public class nornApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public nornApiClient nornApiClient() {
        return new nornApiClient(accessKey, secretKey);
    }

}
