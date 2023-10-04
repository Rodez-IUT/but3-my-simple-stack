package but.info3.fsil;

import java.util.EmptyStackException;

/**
 * Interface of a simple Stack.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     *
     * @return true if the stack is empty
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     *
     * @return the size of the stack.
     */
    int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item the item to add.
     */
    void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     *
     * @return the item on the top of the stack.
     *
     * @throws EmptyStackException if this stack is empty.
     *
     */
     Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object
     *  as the value of this function.
     *
     * @return the item on the top of the stack.
     *
     * @throws EmptyStackException if this stack is empty.
     */
     Item pop() throws EmptyStackException;
}
