package assign10;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        taskB_8();
    }

    //Part A

    //problem1 Text Editor Simulator
    public static void task1(){
        Scanner sc = new Scanner(System.in);
        StringBuilder editor = new StringBuilder();

        //append
        System.out.println("Enter text to append:");
        String appendText = sc.nextLine();
        editor.append(appendText);

        //insert
        System.out.println("Enter text to insert:");
        String insertText = sc.nextLine();

        System.out.println("Enter position to insert at:");
        int position = sc.nextInt();
        sc.nextLine(); // consume newline to move the next line in input buffer

        if (position >= 0 && position <= editor.length()) {//checking if the enetered index is valid or not
            editor.insert(position, insertText);
        } else {
            System.out.println("Invalid insert position");
        }

        //delete
        System.out.println("Enter start index to delete:");
        int start = sc.nextInt();

        System.out.println("Enter end index to delete:");
        int end = sc.nextInt();

        if (start >= 0 && end <= editor.length() && start < end) {//similary check for delete start index and delete index
            editor.delete(start, end);
        } else {
            System.out.println("Invalid delete range");
        }

        //display final text
        System.out.println("Final text in editor:");
        System.out.println(editor);
    }

    //problem2 String Compressor
    public static void task2(String s) {

        if (s == null || s.length() == 0) {
            System.out.println("Compressed string: ");
            return;
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
            else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        System.out.println("Compressed string: " + sb);
    }

    //problem3 Reverse Words in Sentence
    public static void task3(String sentence) {

        String[] words = sentence.split(" ");// assuming words are separated by single space
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer(words[i]);
            result.append(sb.reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Reversed sentence: " + result.toString());
    }

    //Problem 4 Large Data Concatenation
    public static void task4(){
        int n = 10_000;

        //using String
        String s = "";
        long start1 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            s += "data";
        }

        long end1 = System.nanoTime();

        //using StringBuilder
        StringBuilder sb = new StringBuilder();
        long start2 = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("data");
        }

        long end2 = System.nanoTime();

        // results
        System.out.println("Time taken using String: " + (end1 - start1) + " ns");
        System.out.println("Time taken using StringBuilder: " + (end2 - start2) + " ns");
    }

    //problem5 5. Input Type Validator
    public static void task5(String input){
        try {
            Integer intValue = Integer.valueOf(input);
            System.out.println("Input type: Integer");
            System.out.println("Stored value: " + intValue);
            return;
        }
        catch (NumberFormatException e) {
            // catch block is kept empty because if input does not match any of the specified wrappers
            //we have a print statement in the end of the method
        }

        try {
            Double doubleValue = Double.valueOf(input);
            System.out.println("Input type: Double");
            System.out.println("Stored value: " + doubleValue);
            return;
        }
        catch (NumberFormatException e) {}

        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            Boolean boolValue = Boolean.valueOf(input);
            System.out.println("Input type: Boolean");
            System.out.println("Stored value: " + boolValue);
            return;
        }

        //if nothing matches
        System.out.println("Input type: Unknown");
        System.out.println("Stored value as String: " + input);
    }

    //problem6 Banking Transaction Analyzer
    public static void task6_or_10(String[] transactions) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        System.out.println("Converted transactions:");
        for (int i = 0; i < transactions.length; i++) {
            int amount = Integer.valueOf(transactions[i]);
            System.out.println(amount);
            if (amount > max) {
                max = amount;
            }
            sum += amount;
        }

        double average = (double) sum / transactions.length;
        System.out.println("Highest transaction: " + max);
        System.out.println("Average transaction amount: " + average);
    }

    //Part B

    //problem1 Age Calculator
    public static void taskB_1(String dob) {
        //dob is in the form of yyyy-mm-dd
        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        System.out.println("Date of Birth: " + birthDate);
        System.out.println("Current Age: " + age + " years");
    }

    //problem2 Event countdown
    public static void taskB_2(String eventDateString){
        LocalDate eventDate = LocalDate.parse(eventDateString);
        LocalDate today = LocalDate.now();
        long daysLeft = ChronoUnit.DAYS.between(today, eventDate);

        if (daysLeft < 0) {
            System.out.println("The event date has already passed.");
        } else if (daysLeft == 0) {
            System.out.println("The event is today!");
        } else {
            System.out.println("Days left for the event: " + daysLeft);
        }
    }

    //Problem3 Attendance formatter
    public static void taskB_3(String dateString) {
        LocalDate date = LocalDate.parse(dateString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Attendance Date: " + formattedDate);
    }

    //problem4 EMail Validator
    public static void taskB_4(String email) {
        String regex = "^(?=.*[A-Z])(?=.*\\\\d)(?=.*[^A-Za-z0-9]).{8,}$";
        boolean isValid = Pattern.matches(regex, email);
        if (isValid) {
            System.out.println("Valid Email Entered");
        } else {
            System.out.println("Invalid Email Entered");
        }
    }

    //problem5 Password Strength Validator
    public static void taskB_5(String password){
        boolean validLength = false;
        boolean atLeastOneUpper = false;
        boolean atLeastOneDigit = false;
        boolean atLeastOneSpecial = false;

        if (password.length() >= 8) {
            validLength = true;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                atLeastOneUpper = true;
            }
            else if (Character.isDigit(ch)) {
                atLeastOneDigit = true;
            }
            else if (!Character.isLetterOrDigit(ch)) {
                atLeastOneSpecial = true;
            }
            if (atLeastOneUpper && atLeastOneDigit && atLeastOneSpecial) {
                break;
            }
        }

        if(validLength && atLeastOneUpper && atLeastOneDigit && atLeastOneSpecial){
            System.out.println("Entered Password is valid");
        }
        else{
            System.out.println("Entered password is invalid");
        }
    }

    //problem6 Mobile Number Validator
    public static void taskB_6(String mobile) {
        String regex = "^[6-9][0-9]{9}$";
        boolean isValid = Pattern.matches(regex, mobile);
        if (isValid) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
    }

    //problem7 Currency Formatter
    public static void taskB_7(double salary) {
        // Indian currency format
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        // US currency format
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Indian Format: " + indiaFormat.format(salary));
        System.out.println("US Format: " + usFormat.format(salary));
    }

    //Problem8 Invoice Date Generator
    public static void taskB_8() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE");//EEEE represents complete day name

        System.out.println("dd-MM-yyyy     : " + today.format(format1));
        System.out.println("MMMM dd, yyyy  : " + today.format(format2));
        System.out.println("Day Name       : " + today.format(format3));
    }

    //problem9 Extract Numbers from text
    public static void taskB_9(String text) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Extracted numbers:");
        while (matcher.find()) {//.find() is used for iterative extraction in case there many occurrences of numbers.
            System.out.println(matcher.group());
        }
    }

}
