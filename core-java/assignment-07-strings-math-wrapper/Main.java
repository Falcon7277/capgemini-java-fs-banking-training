import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1(sc.next());//sentence is taken as input during method call
        task2(sc.next());
        task3(sc.next(), sc.next());
        task4(sc.next());
        task5(sc.next());
        task6(sc.next());
        task7(sc.next());
        task8(sc.next());
        task9(sc.next());
        task10(sc.next());
        task11();
        task12(sc.nextInt(), sc.nextInt());
        task13();
        task14(sc.nextInt());
        task15(sc.nextFloat());
        task16();
        task17();
        //Input for task 18
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers space seperated for array input: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        task18(arr);
        sc.nextLine();
        task19(sc.next());
        task20();
    }

    public static void task1(String sentence){
        System.out.println("length of the sentence is: " + sentence.length());
        System.out.println("Substring from index 5 to 10 is: " + sentence.substring(5, 11));
        System.out.println("LowerCase String is: " + sentence.toLowerCase());
        System.out.println("Uppercase String is: " + sentence.toUpperCase());
    }

    public static void task2(String s){//this method checks if the given string is palindrome
        int i = 0, j = s.length() - 1;
        boolean isPalindrome = true;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;j--;
        }

        if(isPalindrome){
            System.out.println("The given string is Palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
    }

    public static void task3(String a, String b){//this method checks if the
        // given strings are anagram of each other
        int[] freq = new int[26];
        String al = a.toLowerCase();
        String bl = b.toLowerCase();
        for(char c : al.toCharArray()){
            freq[c - 'a']++;
        }
        for(char c : bl.toCharArray()){
            freq[c - 'a']--;
        }

        boolean isAnagram = true;
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("The given strings are anagram of each other");
        }
        else{
            System.out.println("The given strings are not anagram");
        }
    }

    public static void task4(String s){//this methods prints frequency of each character in given string
        int[] freq = new int[52];
        for(char c : s.toCharArray()){
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                freq[c - 'A' + 26]++;
            }
        }

        for(int i = 0; i < 52; i++){
            if(i < 26) {
                System.out.println("The frequency of character: " + (char)('a' + i) + " is: " + freq[i]);
            }
            else{
                System.out.println("The frequency of character: " + (char)('A' + i - 26) + " is: " + freq[i]);
            }
        }
    }

    public static void task5(String word){//this method reverses the given string
        char[] arr = word.toCharArray();
        int n = arr.length;
        char[] revArr= new char[n];
        for(int i = 0; i < n; i++){
            revArr[i] = arr[n - i - 1];
        }
        System.out.println("The original String is: " + word);
        System.out.println("The reverse String is: " + new String(revArr));
    }

    public static void task6(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.append(" Java Programming");
        sb.insert(5, "is fun ");
        int start = sb.indexOf("Programming");
        int end = start + "Programming".length();
        sb.replace(start, end, "Language");
        sb.reverse();

        System.out.println(sb);
    }

    public static void task7(String s){//performace of string concatenation vs stringbuffer
        String ogString = new String(s);
        long start1 = System.nanoTime();
        for(int i = 0; i < 1000; i++){
            s += "a";
        }
        long end1 = System.nanoTime();

        StringBuffer sb = new StringBuffer(ogString);
        long start2 = System.nanoTime();
        for(int i = 0; i < 1000; i++){
            sb.append('a');
        }
        long end2 = System.nanoTime();

        System.out.println("Time taken for string concatenation is: " + (end1 - start1));
        System.out.println("Yime taken for concatenation using StringBuffer is : " + (end2 - start2));

    }

    public static void task8(String s){//this method removes vowels from the string
        StringBuffer sb = new StringBuffer(s);
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                sb.deleteCharAt(i--);
            }
        }

        System.out.println("After removing the vowels the String is: " + sb.toString());
    }

    public static void task9(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.delete(2, 6);
        sb.append(" Efficient Programming");
        System.out.println("The String after operation is: " + sb.reverse().toString());
    }

    public static void task10(String sentence){// this method calculates the total words in a
        // sentence and adds it at the last of the sentence
        StringBuilder sb = new StringBuilder(sentence);
        String trimmed = sentence.trim();

        int wordCount = 0;
        if (!trimmed.isEmpty()) {
            wordCount = trimmed.split("\\s+").length;
        }

        sb.append(" | Word Count: ").append(wordCount);

        System.out.println(sb);
    }

    public static void task11(){//string concatenation vs stringbuilder vs stringbuffer
        int iterations = 10_000;

        // 1. String
        String s = "";
        long start1 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            s += "a";
        }
        long end1 = System.nanoTime();

        // 2. StringBuffer
        StringBuffer sbuf = new StringBuffer();
        long start2 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuf.append("a");
        }
        long end2 = System.nanoTime();

        // 3. StringBuilder
        StringBuilder sbld = new StringBuilder();
        long start3 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbld.append("a");
        }
        long end3 = System.nanoTime();

        System.out.println("Time taken by String        : " + (end1 - start1) + " ns");
        System.out.println("Time taken by StringBuffer  : " + (end2 - start2) + " ns");
        System.out.println("Time taken by StringBuilder : " + (end3 - start3) + " ns");
    }

    public static void task12(int x, int y){
        System.out.println("Power of the given numbers is: " + Math.pow(x, y));
        System.out.println("Square root of first number is: " + Math.sqrt(x) + "\n" + "Square root of second number is: " + Math.sqrt(y));
        System.out.println("The Absolute difference between given numbers is: " + Math.abs(x - y));

    }

    public static void task13(){//generates 10 random numbers between 1 to 100
        System.out.print("10 Random numbers between 1 to 100 are: ");
        for(int i = 0; i < 10; i++){
            System.out.print((int)((Math.random() * 100) + 1) + " ");
        }
    }

    public static void task14(int r){//calculates circumference and area of circle
        System.out.println("Circumference of the circle with given radius is: " + (2 * Math.PI * r));
        System.out.println("Area of the circle with given radius is: " + Math.PI * Math.pow(r, 2));
    }

    public static void task15(float a){//gives floor, ceil and round for a given float value
        System.out.println("The floor of the given number is: " + Math.floor(a));
        System.out.println("The ceil of the given number is: " + Math.ceil(a));
        System.out.println("The round of the given number is: " + Math.round(a));
    }

    public static void task16(){//sine, cosine, and tangent for 0 to 360
        for(int i = 0; i <= 360; i++){
            System.out.println("The sine for " + i + " degree is" + Math.sin(Math.toRadians(i)));
            System.out.println("The cosine for " + i + " degree is" + Math.cos(Math.toRadians(i)));
            System.out.println("The tangent for " + i + " degree is" + Math.tan(Math.toRadians(i)));
        }
    }

    public static void task17(){
        int a = 12;
        Integer b = new Integer(a); // boxing
        int c = b.intValue(); // unboxing
    }

    public static void task18(int[] arr){
        int n = arr.length;
        List<Integer> intList = new ArrayList<>(n);
        int sum = 0;
        for(int i = 0; i < n; i++){
            intList.add(arr[i]);// auto-boxing
            sum += intList.get(i);// auto unboxing
        }
    }

    public static void task19(String s){
        int num1 = Integer.parseInt(s);
        double num2 = Double.parseDouble(s);
        long num3 = Long.parseLong(s);
    }

    public static void task20(){
        int a = 10, b = 10;
        Integer aI = 10, bI = 20;
        System.out.println("Primitive int comparason: " + (a == b));
        System.out.println("Wrapper Integer comparison based on reference: " + (aI == bI));
        System.out.println("Wrapper Integer comparison based on value" + aI.equals(bI));
    }
}
