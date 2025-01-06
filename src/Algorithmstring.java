import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Algorithmstring {
    //    public static int findMaximum (int a, int b, int c) {
//        if (a > b) {
//            if (a > c || a == c) {
//                return a;
//            }
//        }
//        if (b > c) {
//            return b;
//        }
//        return c;
//    }
//    public static int findMaximum2(int a, int b, int c) {
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        return max;
//    }

    // Validating String
//    public static boolean isUppercase(String s) {
//        // Use java Stream API
//        return s.chars().allMatch(Character::isUpperCase);
//    }
    //String Validation
//    public static boolean isLowercase(String s) {
//        return s.chars().allMatch(Character::isLowerCase);
//    }
    // Validate strings in Java: Specific Properties
//    public static boolean isPasswordComplex(String s) {
//        return s.chars().anyMatch(Character::isUpperCase) &&
//                s.chars().anyMatch(Character::isLowerCase) &&
//                s.chars().anyMatch(Character::isDigit);

    // Normalize String
//    public static String normalizeString(String s){
            //       String lowercased =  s.toLowerCase();
            //       String trimmed = lowercased.trim();
            //       String normalized = trimmed.replace(",", "");
//        return s.toLowerCase().trim().replace(",", "");

    // Basic Parsing and Searching Strings in Java
// public static void parseContents(String s) {
//    System.out.println("Option 1");
//    for (char c : s.toCharArray()) {
//        System.out.println(c);
//    }
//    System.out.println();
//    System.out.println("Option 2");
//    // use regular for loop
//    for (int i = 0; i < s.length(); i++) {
//        char c = s.charAt(i);
//        System.out.println(c);
//    }
//}

//public static boolean isAtEvenIndex(String s, char item){
//    if (s == null || s.isEmpty()) {
//        return false;
//    }
//    for (int i = 0; i < s.length()/ 2 + 1; i=i+2) {
//        if (s.charAt(i) == item) {
//            return true;
//        }
//    }
//    return false;
//}

    //Create algorithm-driven string.
    //Common Task: Create a new string based on input data
    // Create a function that build a string dynamically using input data.
    // The algorithm created will build the reverse of
    // whatever string is inputted.
//    public static String reverse(String s) {
//        if (s == null || s.isEmpty()) {
//            return s;
//        }
//        StringBuilder reversed = new StringBuilder();
//        for (int i = s.length() -1; i >= 0; i--) {
//            reversed.append(s.charAt(i));
//        }
//        return reversed.toString();
//    }
    // In an interview case use the the built-in methods, which is easy
    // not wrong!
//    public static String reverse2(String s) {
//        if (s == null || s.isEmpty()){
//            return s;
//        }
//        StringBuilder sb = new StringBuilder(s);
//        return sb.reverse().toString();
//    }

    // Challenge code: Reverse each word
    // Create an algorithm that reverses each word in a sentence

//    static String reverseEachWord(String sentence){
//        if (sentence == null || sentence.isEmpty()) {
//            return "";
//        }
//
//        StringBuilder result = new StringBuilder();
//
//        // use split function on the input to create an array of words
//        String [] words = sentence.split(" ");
//        // Iterate through the array and reverse each word individually
//        // then add them to your result StringBuilder
//        for (String word : words) {
//            result.append(reverse(word));
//            // add the spaces back, this works except for the last word,
//            // which doesn't have space at the end.
//            result.append(" ");
//            // To account the last word spacing use trimToSize call,
//            // which will trim the spaces off the end.
//            result.trimToSize();
//            // return the new string, with each word reversed.
//            // use result variable and call toString and return it from the function.
//            return result.toString();
//        }
//
//
//
//    }

    public static void main(String[] args) {
//        System.out.println(findMaximum2(1, 2, 3));
//        System.out.println(findMaximum2(8, 8, 1));
//        System.out.println(findMaximum2(3, 2, 3));
//        System.out.println(findMaximum2(1, 1, 9));
//        System.out.println(findMaximum2(1, 9, 9));

        // Validation String
//        System.out.println(isUppercase("hello"));
//        System.out.println(isUppercase("HELLO"));
//
//        System.out.println(isUppercase("hello"));
//        System.out.println(isUppercase("HELLO"));
        //Specific properties like password validation
//        System.out.println(isPasswordComplex("Hell0"));
//        System.out.println(isPasswordComplex("HellO"));
//        System.out.println(isPasswordComplex("HeLLO"));
//        System.out.println(isPasswordComplex(" "));

        //Normalizing Strings
//        System.out.println(normalizeString("  Hello There, BUDDY "));

        // Basic Parsing and Searching Strings

//        String s = "HeLLo";
//        System.out.println(s.contains("LL"));

//        parseContents(s);

        //Applying custom parsing
//        String s = "HeLLo";
//        System.out.println(isAtEvenIndex(s, 'L'));
//        System.out.println(isAtEvenIndex(s, 'T'));
//        System.out.println(isAtEvenIndex(s, 'H'));
//        System.out.println(isAtEvenIndex( "", 'H'));
//        System.out.println(isAtEvenIndex( null, '|'));

        // Algorithm-driven/ Reversed String. You can use both case revers, reverse2
//        System.out.println(reverse2(null));
//        System.out.println(reverse2(""));
//        System.out.println(reverse2("Hello"));
//        System.out.println(reverse2("Hi"));
//        System.out.println(reverse2("Makhtal"));


    }
}
