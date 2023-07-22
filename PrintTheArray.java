import java.util.Arrays;

public class PrintTheArray{
    public static void printArray(Object[] arr){
        Arrays.asList(arr);//.forEach(n -> System.out.println(n));
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args){
        Integer[] arr = {1,23,4,5,6,9};
        String[] a = {"Hello", "World"};
        printArray(arr);
        printArray(a);
    }
}