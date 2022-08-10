package com.example.interceptor.config;

import com.example.interceptor.interceptor.AuthInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class MvcConfig implements WebMvcConfigurer {

    private final AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 을 통해 원하는 controller 지정
        // excludePathPatterns 을 통해 특정 controller 제외
        registry.addInterceptor(authInterceptor).addPathPatterns("/api/private/*");
        // registry에 다른 인터셉터를 추가하면 순차적으로 적용이 됨 -> 단계적 인증 절차 처리 가능
    }
}
