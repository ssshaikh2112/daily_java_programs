package collections;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		stack.push(101);
		stack.push("oggy");
		stack.push("entertainment");
		stack.push(102.21);
		System.out.println(stack);
		
		System.out.println(stack.peek());	// Only extract the object from stack not remove from stack
		System.out.println(stack);
		
		System.out.println(stack.pop());	// remove element or object from top of the stack
		System.out.println(stack);
		
		System.out.println(stack.empty());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.empty());		// return true if stack is empty

	}

}
