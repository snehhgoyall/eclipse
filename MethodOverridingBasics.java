package OopConcepts;
//method overriding is used by making the same method in another class which extends the supar class.

class A{
    public int a;
    public int Normal(){
        return 4;
    }
    public void meth2(){//overriding doesnt work in static methods.
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){//if i will change the return type or int a(put parameters) that method wont be overrided)
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class MethodOverridingBasics {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();//it will print the newest
    }
}



