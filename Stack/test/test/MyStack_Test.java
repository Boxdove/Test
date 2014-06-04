package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

import Stack.MyStack;

public class MyStack_Test {


//	int MAX_STACK_SIZE;
	public MyStack myStack = new MyStack(5);

	    
	@Test (expected = IndexOutOfBoundsException.class)
	public void If_Stack_Full_push (){ 
		MyStack st = new MyStack(4);
		st.push(2);
		st.push(4);
		st.push(6);
		st.push(8);
		st.push(10);
	}
	
	@Test(expected = EmptyStackException.class)
	public void If_Stack_Empty_peek() {
		myStack.empty();
		myStack.peek();
	}
	

	@Test(expected = EmptyStackException.class)
	public void If_Stack_Empty_pop() {
		myStack.empty();
		myStack.pop();
	}
	
	@Test
	public void Integer_peek_check() {
		int i = 5;
		myStack.push(i);
		String str = Integer.toString(myStack.peek());
		String str_1 = Integer.toString(5);
		assertEquals(str, str_1);
	}

	@Test
	public void Integer_pop_check() {
		MyStack st = new MyStack();
		st.push(2);
		st.push(4);
		st.push(6);
		st.push(8);
		st.pop();
		
		String str = Integer.toString(st.peek());
		String str_1 = Integer.toString(6);
		assertEquals(str, str_1);
		assertNull(st.pop()); 
	}
	
	@Test
	public void Integer_push_check() {
		int i = 5;
		myStack.push(i);
		String str = Integer.toString(myStack.peek());
		String str_1 = Integer.toString(5);
		assertEquals(str, str_1);
	}
}
