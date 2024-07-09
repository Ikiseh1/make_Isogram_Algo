package day1;

public class makeIsogram {
    //An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    // Implement a function that determines whether a string that contains only letters is an isogram.
    // Assume the empty string is an isogram. Ignore letter case.
    public static boolean  isIsogram(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        int count = 0;
        while(count < chars.length){
            char temp = chars[count];
            for(int i = 0; i < chars.length; i++){
                if (temp == chars[i] && count !=i){
                    return false;
                }
            }
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram(""));             // true, the empty string is an isogram
        System.out.println(isIsogram("isogram"));      // true
        System.out.println(isIsogram("eleven"));       // false
        System.out.println(isIsogram("subdermatoglyphic")); // true
        System.out.println(isIsogram("Alphabet"));
    }
}
