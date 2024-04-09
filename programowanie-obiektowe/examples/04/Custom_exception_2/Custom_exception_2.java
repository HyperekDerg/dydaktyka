public class Custom_exception_2 extends Exception {
    public Custom_exception_2(String msg) {
        super(msg);
    }
    
    public Custom_exception_2(String msg, Throwable e) {
        super(msg, e);
    }
}
