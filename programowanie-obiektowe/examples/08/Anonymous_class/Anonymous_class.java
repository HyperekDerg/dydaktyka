class My_class {
    public void f() {
        System.out.println("My_class.f");
    }
}

interface My_interface {
    void f();
}

public class Anonymous_class {
    public static void main(String args[]) {
        new My_class() {
            @Override public void f() {
                System.out.println("<anonymous class/class>.f");
            }
        }.f();

        new My_interface() {
            @Override public void f() {
                System.out.println("<anonymous class/interface>.f");
            }
        }.f();
    }
}
