
import static org.junit.Assert.*;

import org.junit.Test;


public class TestStack {

    private static Stack stack;
    private static String textTest;

    //f
    @Test
    public void TestStackException()  {
        Stack <String> stack = new Stack<String>();
        try{
            stack.top();
        }catch(Exception e){
            String temp = "test test test";
            stack.push(temp);
        }
    }

    //b
    @Test
    public void testStackTopSecond() throws Exception
    {
        Stack <String> stack = new Stack<String>();
        String temp = "test test test";
        stack.push(temp);
        stack.top();
        stack.top();
        stack.top();
        assertSame(temp, stack.top());
        assertFalse(stack.isEmpty());
    }

    //a
    @Test
    public void testEmptyStack() throws Exception {
        Stack<String> stack = new Stack<String>();
        assertTrue(stack.isEmpty());
    }

    //a
    @Test(expected = Exception.class)
    public void testStackPop() throws Exception{
        Stack<String> stack = new Stack<String>();
        stack.pop();
    }

    //a
    @Test(expected = Exception.class)
    public void testStackTop() throws Exception{
        Stack<String> stack = new Stack<String>();
        stack.top();
    }

    //e
    @Test
    public void testPutNull() throws Exception {
        Stack<String> stack = new Stack<String>();
        stack.push(null);
        assertNull(stack.pop());
    }

    //c
    @Test
    public void testPop() throws Exception {
        Stack<String> stack = new Stack<String>();
        String napis = "test test test";
        stack.push(napis);
        assertSame(napis, stack.pop());
        assertTrue(stack.isEmpty());
        try{
            stack.pop();
        } catch(Exception ex) {
            System.out.println("Exception on textPop!");
        }
    }

    //d
    @Test
    public void testManyPushPop() throws Exception {
        Stack<String> stack = new Stack<String>();
        String temp1 = "test1", temp2 = "test2",
                temp3 = "test3", temp4 = "test4", temp5 = "test5";

        stack.push(temp1);
        stack.push(temp2);
        stack.push(temp3);
        stack.push(temp4);
        stack.push(temp5);

        assertSame(temp5,stack.pop());
        assertSame(temp4,stack.pop());
        assertSame(temp3,stack.pop());
        assertSame(temp2,stack.pop());
        assertSame(temp1,stack.pop());

        assertTrue(stack.isEmpty());
        try{
            stack.pop();
        }catch (Exception e){
            System.out.println("Exception on testManyPushPop");
        }
    }


}
