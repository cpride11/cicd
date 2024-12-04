package edu.una.csis.cicd;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void testUsingJavaNewFeature() {

        SequencedSet<String> alphabet = new LinkedHashSet<>();

        alphabet.add("A");

        assertEquals("A", alphabet.getFirst());
    }
    
    @Test
    void testMath() {
        assertEquals(4, 2 + 2, "bad math");
    }
}
