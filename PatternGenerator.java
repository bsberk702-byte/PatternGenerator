//
//  Class author:  Ben Berkowitz
//  Date created:  10/28/26
//  General description: This is a group of methods that use various types of loops to create patterns out of numbers and letters. 
//

public class PatternGenerator {
    public static void main(String[] arg) {
        //eo(6);
        //System.out.println();
        //System.out.println();
        //eo(5);
        //System.out.println();
        //System.out.println();
        triangle(9);
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
        int i = 0;
        int number = 0;
        String print = "";
        while (count <= rows) {
            print = "";
            i = 0;
            while (i < count) {
                number = count;
                print += number;
                i++;
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
        String startLetter = "";
        String print = "";
        int count = 0;
        int nextRows = (maxE * 2) - 1;
        if (maxE % 2 == 0) {
            startLetter = "o";
        } else {
            startLetter = "e";
        }
        while (count < maxE){
            print = "";
            for (int i = 0; i < count+1; i++) {
                if (count % 2 == 0) {
                    print += startLetter;
                } else {
                    if (startLetter == "o") {
                        print += "e";
                    } else {
                        print += "o";
                    }
                }
            }
            System.out.println(print);
            count++;
        }
        while (count < nextRows) {
            print = "";
            for (int i = count; i > 0;i--){
                if (count % 2 == 0) {
                    print += startLetter;
                } else {
                    if (startLetter == "o") {
                        print += "e";
                    } else {
                       print += "o";
                    }
                }
            }
            System.out.println(print);
            count++;
        }
    }
}