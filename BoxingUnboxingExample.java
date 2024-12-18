
public class BoxingUnboxingExample {
	
    public static void main(String[] args) {
        // Boxing: Converting a primitive int to an Integer object
        int primitiveInt = 10;
        Integer boxedInt = Integer.valueOf(primitiveInt); // Explicit boxing
        Integer autoBoxedInt = primitiveInt; // Autoboxing

        // Unboxing: Converting an Integer object back to a primitive int
        Integer anotherBoxedInt = 20;
        int unboxedInt = anotherBoxedInt.intValue(); // Explicit unboxing
        int autoUnboxedInt = anotherBoxedInt; // Autounboxing

        // Displaying the values
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Another boxed Integer: " + anotherBoxedInt);
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);

    }
    
}

