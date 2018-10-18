package com.company.task1;

import java.util.Date;

public class Patient extends Person {
    String id;
    int age;
    String name=getFullName();
    Gender gender;
    Date birthDate;
    Date accepted;
    History sickness;//history
    String prescriptions;
    String allergies;
    String specialReqs;

    OperationsStaff [] operationsStaff;
}
