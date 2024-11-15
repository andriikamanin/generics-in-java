// Example of a generic method
public class GenericMethodExample {

    // A generic method that prints elements of an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"Java", "Generics", "Tutorial"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        System.out.println("String Array:");
        printArray(stringArray);

        System.out.println("Integer Array:");
        printArray(intArray);
    }
}
