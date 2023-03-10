package com.beauty_project.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@Component
public class Customer {
    private String name;
    private Date birthDate;
    private String telephoneNumber;
    private String email;
    private String instagramAccount;
    private boolean statusSilver;
    private boolean statusGold;
}
