package com.beauty_project.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Services {
    private String serviceName;
    private int duration;
    private int price;
    private String description;
}
