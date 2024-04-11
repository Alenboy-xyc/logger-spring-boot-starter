package com.shanzhu.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author shanzhu
 * @description
 * @create 2024/4/11
 */
@ConfigurationProperties("shanzhu.weblog")
public class WebLogProperties implements Serializable {
    public Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
