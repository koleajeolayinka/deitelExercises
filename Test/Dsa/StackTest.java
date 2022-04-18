package Dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setup() {
        stack = new Stack();
    }

    @Test
    public void stackCanBeCreatedTest() {
//            Stack stack = new Stack();
        assertNotNull(stack);
    }

    @Test
    public void stack_is_EmptyTest() {
//            Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushOneElement_StackIsNotEmpty() {
        stack.push(13);
        assertFalse(stack.isEmpty());

    }

    @Test
    public void pushX_popX_StacksIsNotEmpty() {
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());


    }

    @Test
    public void pushXAndY_popYShouldNotBeEmptyTest() {
        stack.push(13);
        stack.push(13);
        stack.pop();
        assertFalse(stack.isEmpty());

    }

    @Test
    public void pushX_popX_elementShouldBeXTest() {
        stack.push(34);
        int element = stack.pop();
        assertEquals(34, element);
    }

    @Test
    public void pushXAndY_popYAndX_elementIsYThenXTest() {
        stack.push(34);
        stack.push(67);
        int element = stack.pop();
        assertEquals(67, element);
        element = stack.pop();
        assertEquals(34, element);
    }

    @Test
    public void pushXAndY_peekReturnYTest() {
        stack.push(32);
        stack.push(69);
        int element  = stack.peek();
        assertEquals(69, element);
        element = stack.pop();
        assertEquals(69, element);
        element = stack.peek();
        assertEquals(32, element);
    }
}