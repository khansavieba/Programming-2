package com.vieba;

class QuestionOne {
	private int count;
	
	public QuestionOne(){ //constructor must be named exactly the same as class name
		count = 1;
	}
	public void increment() {
		count = count + 1;
	}
	public int getCount() {
		return count;
	}
}
public class Q1Main {
	public static void main (String []arg) {
		QuestionOne q1;
		q1 = new QuestionOne();
		//q1.init(); delete this because we used consturctor 
		q1.increment();
		q1.increment();
		System.out.println(q1.getCount());
	}
}

//first run output is 3 
//after change the output still remain 3 
