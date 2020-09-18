package com.company;

import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

class PersonTest {

    @Test
    void testEquals() {
        EqualsVerifier.forClass(Person.class).verify();
    }
}