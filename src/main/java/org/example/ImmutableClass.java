package org.example;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final Integer field1;
    private final String field2;
    private final List<String> field3;

    public ImmutableClass(final Integer field1,
                          final String field2,
                          final List<String> field3) {
        this.field1 = field1;
        this.field2 = field2;
        // Deep copy of the mutable field
        this.field3 = new ArrayList<>(field3);
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public List<String> getField3() {
        // Return a copy of the mutable field
        return new ArrayList<>(field3);
    }
}
