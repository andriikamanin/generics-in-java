// Comparison of code with and without Generics
import java.util.ArrayList;

public class NonGenericVsGeneric {
    public static void main(String[] args) {
        // Without Generics
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123); // This can cause runtime errors
        String value = (String) list.get(0); // Requires casting
        System.out.println("Without Generics: " + value);

        // With Generics
        ArrayList<String> genericList = new ArrayList<>();
        genericList.add("Hello");
        // genericList.add(123); // Compile-time error: prevents runtime issues
        String genericValue = genericList.get(0); // No casting needed
        System.out.println("With Generics: " + genericValue);
    }
}
