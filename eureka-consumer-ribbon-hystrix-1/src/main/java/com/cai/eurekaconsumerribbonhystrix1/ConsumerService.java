package com.cai.eurekaconsumerribbonhystrix1;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @date 2018/4/1913:39
 * @author caijun
 * @Description: ${todo}
*/
@Service
public class ConsumerService {


    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject("http://eureka-client-1/dc", String.class);
    }

    public String fallback() {
        return "fallback";
    }

}