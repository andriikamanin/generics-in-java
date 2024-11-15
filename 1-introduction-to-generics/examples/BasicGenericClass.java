// A simple example of a generic class
public class BasicGenericClass<T> {
    private T value;

    public BasicGenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        BasicGenericClass<String> stringInstance = new BasicGenericClass<>("Hello, Generics!");
        System.out.println("Value: " + stringInstance.getValue());

        BasicGenericClass<Integer> intInstance = new BasicGenericClass<>(123);
        System.out.println("Value: " + intInstance.getValue());
    }
}
