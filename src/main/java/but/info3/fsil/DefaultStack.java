package but.info3.fsil;

import java.util.EmptyStackException;

/**
 * Basic implementation of SimpleStack.
 */
public class DefaultStack implements SimpleStack {
    /**
     * Tests if this stack is empty.
     *
     * @return true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return true;
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return the size of the stack.
     */
    @Override
    public int getSize() {
        return 0;
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item the item to push.
     */
    @Override
    public void push(final Item item) {

    }

    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     *
     * @return the Item fetched.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    /**
     * Removes the object at the top of this stack and returns that object
     * as the value of this function.
     *
     * @return the Item fetched.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
