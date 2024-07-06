package collections;

import java.util.Stack;

public class Stack3 
{
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push("doggyDon");
		stack.push("cochroches");
		stack.push("bhaiyaa");
		System.out.println(stack);
		
		//search();		returns the position number of the element in the stack
		System.out.println(stack.search("doggyDon"));		// 3
		System.out.println(stack.search("bhaiyaa"));		// 1
		System.out.println(stack.search("cochroches"));		// 2
	}

}
