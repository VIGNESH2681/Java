class A extends Object{    // extends Object--> By default all class extends object. object is a class in java.
   public A(){  //This is constructor. constructor must have class name.
       // super();   By default super method is present inside constructor. But we can't see it.
       //super method will call the parent class constructor.
       super(); //this super method will call parent class that is object class. In Object class the default constructor has no values.
       System.out.println("in A");
   }
    public A(int a){  //This is constructor. constructor must have class name.
        // super();   By default super method is present inside constructor. But we can't see it.
        //super method will call the parent class constructor.

        System.out.println("in A int");
    }
}
class B extends A{    //By default all class extends object. object is a class in java.
    public B(){  //This is constructor. constructor must have class name.
       // super();   By default super method is present inside constructor. But we can't see it.
        //super method will call the parent class constructor.
        super(); //this will execute parent class constructor. the default constructor will execute, because we didn't pass argument
        System.out.println("in B");
    }
    public B(int b){  //This is constructor. constructor must have class name.
        // super();   By default super method is present inside constructor. But we can't see it.
        //super method will call the parent class constructor.
        //this(); this method will execute the constructor of the same class --> class B.
        this(); //this will execute default constructor B().
        System.out.println("in B int");
    }
}
public class This_and_SuperMethod {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
