package com.daya.lombok.log;

public class Runner {

    public static void main(String... args)  {
        Legacy legacy = new Legacy();
        legacy.run();
        Lombok lombok = new Lombok();
        lombok.run();
    }
}
