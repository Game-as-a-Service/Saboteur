package tw.waterballsa.gaas.saboteur.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WalkingSkeletonTest {
    @Test
    void test() {
        assertEquals("Walk", new WalkingSkeleton("id", "Walk").walk());
    }
}