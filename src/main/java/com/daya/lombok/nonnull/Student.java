package com.daya.lombok.nonnull;

import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
public class Student {

    @NonNull
    private String name;
    @NonNull
    private Date dateOfBirth;
}
