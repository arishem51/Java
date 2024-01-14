
public class MyString {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("chrome");
        } catch (Exception e) {
        }
    }
}