package com.app.poly;

public class Test3 {
		public void methodOne(int i, float f) {
			System.out.println("int-float method");
		}

		public void methodOne(float f, int i) {
			System.out.println("float-int method");
		}

		public static void main(String[] args) {
			Test3 t=new Test3();  
			t.methodOne(10,10.5f);//int-float method   
			t.methodOne(10.5f,10);//float-int method  
			//t.methodOne(10,10); //C.E:      //CE:reference to methodOne is ambiguous,      
			//both method methodOne(int,float) in Test  
		}
	    //and method methodOne(float,int) in Test match   t.methodOne(10.5f,10.5f);//C.E:     cannot find symbol     symbol : methodOne(float, float)     location : class Test     } } 
}
