package com.beauty_project.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CosmeticProducts {
    private String productName;
    private String manufacture;
    private String countryOfOrigin;
}
