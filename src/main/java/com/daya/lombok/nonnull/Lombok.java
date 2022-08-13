package com.daya.lombok.nonnull;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;

@Slf4j
public class Lombok {

    public void run(@NonNull Student student) {
        log.info("Computing age for student {} with DOB {}", student.getName(), student.getDateOfBirth());
        Calendar calToday = Calendar.getInstance();
        Calendar calDOB = Calendar.getInstance();
    }
}
