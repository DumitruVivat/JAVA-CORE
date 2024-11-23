package org.example.dev.dumitru;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Cat {
    public static String voice;
    private String name;
    private int age;

    public int add(int a, int b) {
        return a + b;
    }
}
