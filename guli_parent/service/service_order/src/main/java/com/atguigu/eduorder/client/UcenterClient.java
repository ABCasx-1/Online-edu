package com.atguigu.eduorder.client;

import com.atguigu.commonutils.ordervo.UcenterMemberOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name="service-ucenter",fallback = UcenterFeignClient.class)
@Component
public interface UcenterClient {
    //根据用户id获取用户信息
    @PostMapping("/api/ucenter/member/getUserInfoOrder/{id}")
    UcenterMemberOrder getUserInfoOrder(@PathVariable("id") String id);
}
