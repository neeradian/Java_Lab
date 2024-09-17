public class GenericMethodTest {
    //generic method printArray
    public static void printArray(E[] inputArray) 
    {
        //Display array elements
        for (E[] element:inputArray)
        {
            System.out.printf("%s", element);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        //Create array of integer, Double and Character Integer[]
        int[] intArray = {1, 2, 3, 4, 5 };
        double[] doubleArray = {1.1,2.2,3.3,4.4 };
        char[] charArray = {'H','E','L','L','O'};
        System.out.println("Array integerArray contains: ");
        printArray(intArray);
        System.out.println("\nArray doubleArray contains: ");
        printArray(doubleArray);
        System.out.println("\nArray CharacterArray contains: ");
        printArray(charArray);

    }
}
