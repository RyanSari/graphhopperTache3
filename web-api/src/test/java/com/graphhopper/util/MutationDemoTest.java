package com.graphhopper.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MutationDemoTest {

    @Test
    void sign_coversAllBranches() {
        MutationDemo demo = new MutationDemo();

        assertEquals(1, demo.sign(5));    // x > 0
        assertEquals(-1, demo.sign(-3));  // x < 0
        assertEquals(0, demo.sign(0));    // x == 0
    }
}
