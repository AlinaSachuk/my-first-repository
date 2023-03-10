package com.beauty_project.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {
    private String name;
    private String position;
    private String education;
    private String workExperience;
}
