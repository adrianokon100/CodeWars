import java.util.ArrayList;
import java.util.List;

/*
 Given an array of strings, reverse them and their order
 in such way that their length stays the same as the length of the original inputs.

Input:  {"I", "like", "good", "books", "and", "I", "cannot", "lie!"}
        Output: {"!", "eilt", "onna", "cIdna", "sko", "o", "bdooge", "kilI"}
*/

public class ReverseStringsAndLetters {


    public static void main(String[] args) {

        String[] tableOfStrings = {"I", "like", "good", "books", "and", "I", "cannot", "lie!"};
        //  String[] tableOfStrings = {"Yesterday", "was", "very!", "GOOD", "day", "Really", "nice", ":)"};

        //I create one sequence of chars and reverse
        String takeEverything = new StringBuilder(String.join("", tableOfStrings)).reverse().toString();

        ArrayList<String> reverseTable = new ArrayList<>();
        int x = 0, i = 0;

        //In loop i am filling table with reverse (strings and letters)
        for (String s : tableOfStrings) {

            reverseTable.add(x++, takeEverything.substring(i, i += s.length()));
        }

        System.out.println("\n\n My reverse table is: " + reverseTable);


// ANOTHER SOLUTION
/*

        String[] tableOfStrings = {"I", "like", "good", "books", "and", "I", "cannot", "lie!"};
        //  String[] tableOfStrings = {"Yesterday", "was", "very!", "GOOD", "day", "Really", "nice", ":)"};


        //Check what is in the input
        System.out.println("My input: ");
        for (String i : tableOfStrings) {
            System.out.print(i + ", ");
        }

        //better performance too add in the loop - StringBuilder
        StringBuilder bigString = new StringBuilder();

        //I create one big string with variables from the table with strings
        for (String i : tableOfStrings) {
            bigString.append(i);
        }

        System.out.println("\n\nMy big string is: \n" + bigString);

        String allStrings = bigString.reverse().toString();

        List<String> reverseStrings = new ArrayList<>();
        int k = 0;
        int l = 0;

        for (String i : tableOfStrings) {

            reverseStrings.add(k++, allStrings.substring(l, l += i.length()));

        }

        System.out.println("\n\nMy new reverse table is: \n");
        for (String i : reverseStrings) {
            System.out.print(i + " ");
        }
*/

    }

}
