package but.info3.fsil;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

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

    @Test
    void pushItem() {
        // given a new stack
        DefaultStack stack = new DefaultStack();
        // and an item
        Item item = new DefaultItem();
        // when an item is pushed
        stack.push(item);
        // Then the stack is no more empty
        assertFalse(stack.isEmpty());
        // and the stack as a size of 1
        assertEquals(1, stack.getSize());
    }

    @Test void popItemWithEmptyList() {
        // given an empty list
        DefaultStack stack = new DefaultStack();
        // expect exception when poping
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test void popItem() {
        // given a stack with 2 items
        DefaultStack stack = new DefaultStack();
        Item item1 = new DefaultItem();
        Item item2 = new DefaultItem();
        stack.push(item1);
        stack.push(item2);
        // when pop
        Item poppedIem = stack.pop();
        // then the popped item is the last in the stack
        assertEquals(item2, poppedIem);
        assertEquals(1, stack.getSize());
    }

    @Test void peekItemWithEmptyList() {
        // given an empty list
        DefaultStack stack = new DefaultStack();
        // expect exception when poping
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test void peekItem() {
        // given a stack with 2 items
        DefaultStack stack = new DefaultStack();
        Item item1 = new DefaultItem();
        Item item2 = new DefaultItem();
        stack.push(item1);
        stack.push(item2);
        // when pop
        Item peekedIem = stack.peek();
        // then the popped item is the last in the stack
        assertEquals(item2, peekedIem);
        assertEquals(2, stack.getSize());
    }

}