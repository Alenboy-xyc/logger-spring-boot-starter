package com.shanzhu.config;

import com.shanzhu.aop.WebLogAspect;
import com.shanzhu.property.WebLogProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shanzhu
 * @description
 * @create 2024/4/11
 */
@Configuration
@EnableConfigurationProperties({WebLogProperties.class})
@ConditionalOnProperty(prefix = "shanzhu.weblog", value = "enabled", matchIfMissing = true)
public class WebLogAutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public WebLogAspect webLogAspect() {
        return new WebLogAspect();
    }
}
