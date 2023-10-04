package but.info3.fsil;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Basic implementation of SimpleStack.
 */
public class DefaultStack implements SimpleStack {

    /**
     * The list storing tje items.
     */
    private List<Item> itemList = new ArrayList<>();

    /**
     * Tests if this stack is empty.
     *
     * @return true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return itemList.isEmpty();
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return the size of the stack.
     */
    @Override
    public int getSize() {
        return itemList.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item the item to push.
     */
    @Override
    public void push(final Item item) {
        itemList.add(item);
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
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return itemList.get(itemList.size() - 1);
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
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int indexLastItem = itemList.size() - 1;
        Item lastItem = itemList.get(indexLastItem);
        itemList.remove(indexLastItem);
        return lastItem;
    }
}
