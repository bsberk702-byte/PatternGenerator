//
//  Class author:  Ben Berkowitz
//  Date created:  10/28/26
//  General description: This is a group of methods that use various types of loops to create patterns out of numbers and letters. 
//

public class PatternGenerator {
    public static void main(String[] arg) {
        stars(7);
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
        
    }
}