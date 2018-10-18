package com.company.task1;

import java.util.Date;

public class Person {
    String title;
    String givenName;
    String middleName;
    String familyName;
    String fullName;

    String getFullName(){
        return fullName=givenName+" "+middleName+" "+familyName;
    };

    Date birthDate;
    Gender Gender;
    Address homeAddress;
    String Phone;

    Hospital []hospitals;
}
