package com.mmosiej.desingpatterns.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PersonLombok {

    private String firstName;
    private String lastName;
    private Integer age;
    private String nationality;
    private String phone;
    private Integer weight;
    private Integer height;
    private Integer shoeSize;
}
