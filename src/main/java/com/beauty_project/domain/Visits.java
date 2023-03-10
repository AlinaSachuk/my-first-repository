package com.beauty_project.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data@Component
public class Visits {
    private Date dateOfVisit;
    private int finalPrice;
}
