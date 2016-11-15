package com.example;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Noel on 11/15/16.
 */
@Getter
@Setter
public class Contact {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
}
