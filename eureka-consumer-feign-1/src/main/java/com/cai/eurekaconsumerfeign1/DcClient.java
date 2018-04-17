package com.cai.eurekaconsumerfeign1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-1")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}