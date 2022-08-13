package com.daya.lombok.nonnull;

public class Runner {

    public static void main(String... args) {
        Lombok impl = new Lombok();
//        impl.run(null);
//        impl.run(new Student(null, null));
        impl.run(new Student("John DOE", null));
    }
}
