package but.info3.fsil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStackTest {

    @Test
    void isEmpty() {
        // given a new stack
        DefaultStack stack = new DefaultStack();
        // Expect the stack is empty
        assertTrue(stack.isEmpty());
        assertEquals(0,stack.getSize());
    }
}