package Generics;

public class GenericsExmple {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] str = {"Shabaj", "Asif", "Irshad"};
        Float[] point = {1.25f, 2.50f, 3.75f, 4.00f};
        showData(numbers);
        showData(str);
        showData(point);

    }   
    
    public static <T> void showData(T[] inp){
        for(T i : inp){
            System.out.printf("%s ", i);

        }
        System.out.println();
    }
}
