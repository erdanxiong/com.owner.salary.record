package com.owner.salary.record.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
//@Profile("dev")
@Component
@ConfigurationProperties(prefix = "system")
@PropertySource("classpath:salarytsystem.properties")
public class SystemAttribute {
    private  String version;
    private  String description;

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
