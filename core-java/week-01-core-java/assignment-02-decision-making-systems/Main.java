import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    //Problem1
    public static boolean approveLoan(int age, double salary, int creditScore, String employmentType){
        //this method returns true if the user is eligible for loan i.e his loan will be approved based on
        //age, salary, credit score and employment type
        if (age < 21 || age > 60) {
            return false;
        }

        if (salary < 30_000) {
            return false;
        }

        employmentType = employmentType.trim().toLowerCase();

        if (employmentType.equals("salaried")) {
            return creditScore >= 650;
        }

        if (employmentType.equals("self employed")) {
            return creditScore >= 700;
        }

        return false;
    }

    //problem2
    public static void printTax(double income, String gender){
        //this method prints the final tax amount based on income and gender
        double taxAmount = 0.0;
        if(income <= 25_000.0){
            System.out.println(taxAmount);
        }
        else if(income <= 50_000.0){
            taxAmount = income * 0.05;
        }
        else if(income <= 1_00_000.0){
            taxAmount = income * 0.2;
        }
        else{
            taxAmount = income * 0.3;
        }
        String standardGender = gender.trim().toLowerCase();
        if(standardGender.equals("female")){
            taxAmount -= 10_000.0;
            System.out.println(taxAmount);
        }
        else{
            System.out.println(taxAmount);
        }
    }

    //problem3 password strength validator
    public static boolean checkPassword(String password){
        //this method returns a true if the password eneter by the user is of valid length
        //has atleast one uppercase character, one lowercase character and one special case character
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

        return validLength && atLeastOneUpper && atLeastOneDigit && atLeastOneSpecial;
    }

    //problem4 University admission system
    public static boolean grantAdmission(int marks, int entranceScore, String category){
        // this method returns true if the student is eligible for admission based on his marks
        //entrance score and category
        String standardCategory = category.trim().toLowerCase();
        if(marks >= 70 && entranceScore >= 80 && standardCategory.equals("general")){
            return true;
        }
        if(marks >= 65 && entranceScore >= 75 && standardCategory.equals("obc")){
            return true;
        }
        return marks >= 60 && entranceScore >= 70 && (standardCategory.equals("sc") || standardCategory.equals("st"));
    }

    //problem5 Smart electricity billing system
    public static double calculateFinalBill(int slabs, boolean peakHour){
        //this method calculates the final bill based on slabs and peakhour
        double bill = 0.0;

        if (slabs <= 100) {
            bill = slabs * 2;
        }
        else if (slabs <= 200) {
            bill = (100 * 2) + ((slabs - 100) * 4);
        }
        else {
            bill = (100 * 2) + (100 * 4) + ((slabs - 200) * 6);
        }

        if (peakHour) {
            bill = bill * 1.10;
        }

        return bill;
    }

    //problem6 ATM withdrawal with multi-condition validation
    public static boolean checkTransaction(int balance, int withdrawnAmount, int dailyWithdrawn){
        //this method returns true i.e validates the atm withdrawal request only if given conditions on
        //balance, withdrawn amount and daily withdraw limit
        if(dailyWithdrawn + withdrawnAmount <= 40000){
            if(withdrawnAmount % 100 == 0){
                if(balance - withdrawnAmount >= 2000){
                    return true;
                }
            }
        }
        return false;
    }

    //problem7 Employee Bonus calculator
    public static void displayBonus(int experience, int rating, double salary){
        //this method calculates bonus amount for an employee based on his experience, rating amd salary
        double bonusAmount = 0;
        if(rating >= 4){
            if(experience >= 10){
                bonusAmount = salary * 0.2;
            }
            else if(experience >= 5){
                bonusAmount = salary * 0.15;
            }
            else{
                bonusAmount = salary * 0.1;
            }
        }
        else{
            if(experience >= 10){
                bonusAmount = salary * 0.1;
            }
            else if(experience >= 5){
                bonusAmount = salary * 0.07;
            }
            else{
                bonusAmount = salary * 0.05;
            }
        }

        System.out.println(bonusAmount);
    }

    //problem 8 insurance policy eligibility
    public static void checkPolicyEligibility(int age, boolean hasCriticalIllness, boolean isSmoker, int basePremium){
        //based on the age of the user, if he has any critical illness or is a smoker, this method will print if he is eligible
        //for the insurance and print the final premium amount or else it will print ineligible
        if(age >= 18 && age <= 60){
            if(!hasCriticalIllness){
                if(isSmoker){
                    System.out.println("Final premium amount : " + (basePremium + basePremium * 0.2));
                }
                else{
                    System.out.println("Final premium amount : " + basePremium );
                }
            }
            else{
                System.out.println("Not Eligible");
            }
        }
        else{
            System.out.println("Not Eligible");
        }
    }

    //problem9 online exam result analyzer
    public static void displayResult(int sectionA, int sectionB, int sectionC){
        //this method prints result of a student if he has passed or failed based on marks obtained in section A
        //B and C
        if(sectionA >= 40 && sectionB >= 40 && sectionC >= 40){
            if(sectionA + sectionB + sectionC >= 120){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
        }
        else{
            System.out.println("Fail");
        }
    }

    //problem 10 Cab fare estimation system
    public static void printFare(int distance, String cabType, boolean isNight){
        //this method calculates the total fare amount based on distance traveled by the cab, type of cab and was it during night hours
        double fare = 0;
        String standardCabType = cabType.trim().toLowerCase();
        if(standardCabType.equals("mini")){
            fare = distance * 10;
        }
        if(standardCabType.equals("sedan")){
            fare = distance * 15;
        }
        if(standardCabType.equals("suv")){
            fare = distance * 20;
        }
        if(isNight){
            fare += (fare * 0.25);
        }
        System.out.println("Total fare is : " + fare);
    }

}
