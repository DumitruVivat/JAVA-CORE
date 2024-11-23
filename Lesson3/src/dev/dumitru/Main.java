package dev.dumitru;

import lombok.Data;

import java.lang.reflect.Method;
import java.util.Random;

//@Data
public class Main {
    public static void main(String[] args) {

        var a = Math.class;
        Random r = new Random();
        Class<?> b = r.getClass();

        for (Method declaredMethod : b.getDeclaredMethods()) {
            System.out.println(declaredMethod.getName());
        }
    }
}
