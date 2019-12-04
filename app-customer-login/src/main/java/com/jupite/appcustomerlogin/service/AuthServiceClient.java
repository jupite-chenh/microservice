package com.jupite.appcustomerlogin.service;

import com.jupite.appcustomerlogin.entity.JWT;
import com.jupite.appcustomerlogin.service.impl.AuthServiceClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 映射认证中心的/oauth/token类，获取令牌，当出现问题时可以fallback
 * @author huizh
 */
@FeignClient(value = "auth-server", fallback = AuthServiceClientFallback.class)
public interface AuthServiceClient {
    @PostMapping("/oauth/token")
    JWT getToken(@RequestHeader("Authorization") String Authorization,
                 @RequestParam("grant_type") String grant_type,
                 @RequestParam("username") String username,
                 @RequestParam("password") String password);
}
