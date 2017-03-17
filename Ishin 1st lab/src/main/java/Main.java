/**
 * Created by Ivan on 17.03.17.
 */
public class Main {
    public static void main(String[] args) {

        FirstThread T1 = new FirstThread("1st");
        T1.start();

        SecondThread T2 = new SecondThread("2nd");
        T2.start();
    }
}
