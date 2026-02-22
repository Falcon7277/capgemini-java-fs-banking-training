package assign3;
/*
Assignment 1 – Core Java
Name: Tanishq Sawarkar
Topic: Control Flow & Arrays
*/

public class Main {
    public static void main(String[] args) {
        //all the solutions are written in the methods
    }

    //Problem1 Print odd even count
    public static void printOddEvenCount(int[] arr){
        //this method takes an integer array and prints the count of even and odd numbers
        if(arr == null || arr.length == 0){
            System.out.println("Array is empty");
            return;
        }
        int evenCnt = 0, oddCnt = 0;
        for(int i : arr){
            if(i % 2 == 0){
                evenCnt++;
            }
            else{
                oddCnt++;
            }
        }

        System.out.println("Odd count is : " + oddCnt);
        System.out.println("Even count is : " + evenCnt);
    }

    //Problem2 Factorial with constraints
    public static void calculateFactorial(int n){
        //this method takes in a number and outputs its factorial i.e n!
        if(n < 0 || n > 20){
            System.out.println("Invalid number");
            return;
        }
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact *= i;
        }

        System.out.println("Factorial of given number is : " + fact);
    }
    //Problem 3 sum of digits until single digit
    public static void singleDigit(int n) {
        //this method takes an int input n and calculates its sum of its digits, replaces it with the calculated
        // sum then keep on doing the sum calculation and replacement until a single digit sum is obtained

        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        System.out.println("The single digit obtained at the end of the operation is : " + n);
    }

    //Problem 4 Prime numbers in range
    public static void printPrimes(int a, int b){
        //this method takes two numbers a and b and outputs all the primes in range (a, b)
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int num = Math.max(a, 2); num <= b; num++) {

            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }

    //Problem 5 Salary processing system
    public static void printSalaryInformation(int[] emp) {
        //this method takes in an int array where arr[i] represents the salary of ith employee
        //it outputs the total salary, average salary and number of employees earning more than average
        if (emp == null || emp.length == 0) {
            System.out.println("No employee salary data available.");
            return;
        }

        int totalSal = 0, empCntMoreThanAvg = 0;
        double avgSal = 0.0;
        int n = emp.length;
        for(int i = 0; i < n; i++){
            totalSal += emp[i];
        }
        avgSal = (totalSal * 1.0)/n;
        for(int i = 0; i < n; i++){
            if(emp[i] > avgSal){
                empCntMoreThanAvg++;
            }
        }

        System.out.println("The total salary is : " + totalSal);
        System.out.println("The average salary is: " + avgSal);
        System.out.println("Count of employees earning more than average: " + empCntMoreThanAvg);
    }

    //problem 6 Print Pyramid
    public static void printPyramid(int n){
        //this method takes an int input n and prints a pyramid of height n
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //problem7 Banking transaction analyzer
    public static void calculateBankingInformation(int[] transactions){
        // this method takes an int array where transactions[i] represents the amount involved in ith transaction
        //outputs the number of deposits, withdrawals and final balance
        if (transactions == null || transactions.length == 0) {
            System.out.println("No transactions available.");
            return;
        }

        int totalDeposits = 0, totalWithdrawals = 0, balance = 0;
        for (int amount : transactions) {

            if (amount > 0) {
                totalDeposits++;
            }
            else if (amount < 0) {
                totalWithdrawals++;
            }

            balance += amount;
        }

        System.out.println("Number of total deposits are : " + totalDeposits);
        System.out.println("Number of total withdrawals are : " + totalWithdrawals);
        System.out.println("Remaining Balance is : " + balance);
    }

    //problem8 Fibonacci series with limit
    public static void printFibonacci(int n){
        // this method takes in an int input n representing the limit and print fibonacci numbers till n
        // (inclusive of n)
        if(n <= 0){
            return;
        }
        int a = 0, b = 1;

        while (a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    //problem 9 Exam result analyzer
    public static void analyzeExamResult(int[] marks){
        // this method taken an int array as input where marks[i] represents marks of ith student
        //it outputs the highest marks, lowest marks and count of students who have scored more than 40 marks
        if(marks == null || marks.length == 0){
            System.out.println("Result does not exists");
        }

        int maxE = marks[0];
        int minE = marks[0];
        int passCount = 0;

        for(int i = 0; i < marks.length; i++){
            if(marks[i] > maxE){
                maxE = marks[i];
            }
            if(marks[i] < minE){
                minE = marks[i];
            }
            if(marks[i] >= 40){
                passCount++;
            }
        }

        System.out.println("Highest marks obtained by student: " + maxE);
        System.out.println("Lowest marks obtained byt strudent: "+ minE);
        System.out.println("Number of students who have obtained atleas 40 marks: " + passCount);
    }

    //problem 10 Inventory Stock alert system
    public static void lowStock(int[] stocks){
        //this method takes in an int array where stocks[i] represents value of the stock at ith index
        // this method prints the stocks having value below 10
        for(int i = 0; i < stocks.length; i++){
            if(stocks[i] < 10){
                System.out.println("Stock with index: " + i + " is below the given limit");
            }
        }
    }
}
