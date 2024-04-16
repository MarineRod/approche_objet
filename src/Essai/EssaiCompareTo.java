package Essai;

public class EssaiCompareTo {
	
    public static void main(String[] args) {
    	
        String str1 = "hello";
        String str2 = "world";

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println("str1 est inférieur à str2");
        } else if (result > 0) {
            System.out.println("str1 est supérieur à str2");
        } else {
            System.out.println("str1 est égal à str2");
        }
    }
}