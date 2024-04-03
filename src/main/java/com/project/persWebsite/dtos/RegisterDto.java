package com.project.persWebsite.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class RegisterDto {
    private String name;
    private String password;
    private String email;
}
