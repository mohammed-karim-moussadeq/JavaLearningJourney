package Algo.brocode.hello;

public class arrayCopy {

    public static void main(String[] args) {

        int [] original = {1, 36, 25, 33, 66, 54, 22, 87, 45, 366};
        int [] copy = new  int [6];
        System.arraycopy(original, 0,copy,0,6);
        System.out.println(copy[0]);
        System.out.println(copy[1]);
        System.out.println(copy[2]);
        System.out.println(copy[3]);
        System.out.println(copy[4]);
        System.out.println(copy[5]);




    }
}
