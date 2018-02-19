package com.rt.anonomousclass;
//Test Class for Anonymous Class Creation
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		Greeting obj=new Greeting(){
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Hello World");
				
			}
		};
		
		obj.print();
		
	}

}
