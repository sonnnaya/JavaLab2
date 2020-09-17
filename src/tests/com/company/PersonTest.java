package com.company;

import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

class PersonTest {

    @Test
    void equals_sameObjects_true() {
        EqualsVerifier.forClass(Person.class).verify();
    }
}