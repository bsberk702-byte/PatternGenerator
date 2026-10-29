//
//  Class author:  Ben Berkowitz
//  Date created:  10/28/26
//  General description: This is a group of methods that use various types of loops to create patterns out of numbers and letters. 
//

public class PatternGenerator {
    public static void main(String[] arg) {
        stars(7);
        System.out.println();
        System.out.println();
        triangle(9);
        System.out.println();
        System.out.println();
        odds(9);
        System.out.println();
        System.out.println();
    }
    public static void stars(int rows) {
        String stars = "*";
        int count = 0;
        while (count < rows) {
            System.out.println(stars);
            stars += "**";
            count ++;
        }
    }
    public static void triangle(int rows) {
        int count = 1;
        int number = 0;
        String print = "";
        while (count <= rows) {
            print = "";
            for (int i = 0; i < count; i++) {
                number = count;
                print += number;
            }
            System.out.println(print);
            count++;
        }
    }
    public static void odds(int start) {
        int number = start;
        String print = "";
        for (int i = start; i > 0; i--) {
            if (i % 2 != 0) {
                print = "";
                number = i;
                for (int j = 0; j < i; j++) {
                    print += number;
                }
                System.out.println(print);
            }
        }
    }
    public static void eo(int maxE) {
        String letter = "";
        if (maxE % 2 == 0){
            letter = "o";
        } else {
            letter = "e";
        }
        for (int i = 0; i < maxE; i++) {
            if (i % 2 == 0) {
                
            }
        }
    }
}