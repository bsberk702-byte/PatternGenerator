//
//  Class author:  Ben Berkowitz
//  Date created:  10/28/26
//  General description: This is a group of methods that use various types of loops to create patterns out of numbers, letters, and symbols. 
//

public class PatternGenerator {
    public static void main(String[] arg) {
        System.out.println("Here is the stars function (7 rows): ");
        stars(7);
        System.out.println();
        System.out.println();
        System.out.println("Here is the triangle function (9 rows): ");
        triangle(9);
        System.out.println();
        System.out.println();
        System.out.println("Here is the odds function (start at 9): ");
        odds(9);
        System.out.println();
        System.out.println();
        System.out.println("Here is the eo function (maxE is 6): ");
        eo(6);
        System.out.println();
        System.out.println();
        System.out.println("Here is the eo function (maxE is 5): ");
        eo(5);
        System.out.println();
        System.out.println();
        System.out.println("Here is the pyramid function (5 rows): ");
        pyramid(5);
    }
    //Precondition: A number of rows is inputted. No errors will occur because of an inputted number, but for there to be any stars printed, the input must be larger than 0. 
    //The input must also be an integer.
    //Postcondition: A triangle made of stars will be printed, with the inputted number of rows and each row having two more stars than the previous
    public static void stars(int rows) {
        String stars = "*";
        int count = 0;
        while (count < rows) {
            System.out.println(stars);
            stars += "**";
            count ++;
        }
    }
    //Precondition: A number of rows must be inputted. The input must be an integer. The input will never cause an error, but nothing will be printed if the input is 0 or lower. 
    //Postcondition: A triangle made of numbers is created, with the inputted number of rows and each row having its number of its number printed. (ex. row 5 will have 5 5s).
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
    //Precondition: A starting number must be inputted. The input must be an integer. The input will never cause an error, but nothing will be printed if the input is 0 or lower. 
    //Additionally, the input must be an odd number. If an even number is inputted, the function will become evens, and it will print a triangle made of only the even numbers from the input to 0.
    //Postcondition: A backwards triangle made of numbers will be created, with only the odds from the inputted number to 1.
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
    //Precondition: A max e must be inputted. The input must be an integer. The input will never cause an error, but nothing will be printed if the input is 0 or lower. 
    //Postcondition: A triangle made of letters will be created, alternating rows between e and o. It will go up to the max e, and then start going down. 
    //Each row will have the row number of the designated letter (ex. row 3 will have 3 e's or o's)
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
        while (count > 0) {
            print = "";
            for (int i = count - 1; i > 0;i--){
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
            count--;
        }
    }
    //Precondition: A number of rows must be inputted. The input must be an integer. The input will never cause an error, but nothing will be printed if the input is 0 or lower. 
    //Postcondition: A pyramid of numbers will be created. It will be upside down, with the largest side on the top, and the numbers will go from smallest to biggest as you go down the rows. 
    public static void pyramid(int rows) {
        String print = "";
        int printNum = 0;
        for (int i = 1; i < rows * 2; i += 2){
            print = "";
            printNum += 1;
            for (int k = 1; k < printNum; k++){
                print += " ";
            }
            for (int j = 0; j < (rows * 2) - i;j++){
                print += printNum;
            }
            System.out.println(print);
        }
    }
}