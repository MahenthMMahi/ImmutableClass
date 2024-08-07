package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        ImmutableClass immutableObject = new ImmutableClass(1, "Hello", list);

        System.out.println(immutableObject.getField1()); // 1
        System.out.println(immutableObject.getField2()); // Hello
        System.out.println(immutableObject.getField3()); // [A, B]

        // Try to modify the internal list
        immutableObject.getField3().add("C");

        // The immutableObject is unchanged
        System.out.println(immutableObject.getField3());
    }
}