package Generics;

public class MultipleArgumnetGenerics {
    public static void main(String[] args) {
        Integer i = 5;
        Float f_Number = 2.35f;
        Character ch = 'r';
        Character ch2 = 'c';
        printData(i, f_Number, ch, ch2);
           

    }

    public static <T, U, V, W> void printData(T a, U b, V z, W y){
        System.out.println(a);
        System.out.println(b);
        System.out.println(z);
        System.out.println(y);

    }
    
}
