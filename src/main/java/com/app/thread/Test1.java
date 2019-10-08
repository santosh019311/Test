package com.app.thread;

public class Test1 {
public static void main(String[] args) {
	MyThread m=new MyThread();
	Thread t =new Thread(m);
	t.start();
	System.out.println("Main - thread");
}
}
