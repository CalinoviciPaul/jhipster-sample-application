package com.mycompany.myapp.utils;

import java.util.UUID;

public class UUIDGenerator {
    public static String next() {
        return UUID.randomUUID().toString().replaceAll("-", ""); // replace "-" 36 -> 32 char
    }

}
