package com.app.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Parent p=new Parent();
        p.methodOne();
     //  p.methodTwo();
        Parent p1=new Child();
        p1.methodOne();
        //p1.methodTwo();
        Child c=new Child();
        c.methodOne();
        c.methodTwo();
    }
    
}
