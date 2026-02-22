package assign4;

public class Main {
    public static void main(String[] args) {
        //all the solutions are written in methods
    }

    //Problem 1: Maximum and Minimum in Array
    public static int[] findMaxMin(int[] arr){
        if(arr == null || arr.length == 0){
            return new int[]{-1, -1};
        }
        int maxE = arr[0];
        int minE = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxE) maxE = arr[i];
            if(arr[i] < minE) minE = arr[i];
        }
        return new int[]{minE, maxE};
    }

    //Problem 2: Array Left Rotation
    public static int[] leftRotate(int[] arr, int d){
        if (arr == null || arr.length == 0) return arr;
        int n = arr.length;
        int places = d % n;
        if (places < 0) places += n;// for negative d
        reverseArray(arr, places, n - 1);
        reverseArray(arr, 0, places - 1);
        reverseArray(arr, 0, n - 1);
        return arr;
    }
    //problem2 submethod
    public static void reverseArray(int[] arr, int left, int right){
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    //Problem 3: Count Even and Odd
    public static void printOddEvenCount(int[] arr){
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

    //Problem 4: Second Largest Element
    public static int findSecondLargest(int[] arr){
        if (arr == null || arr.length == 0) return -1;
        if(arr.length == 1) return arr[0];
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    //Problem 5: Row-wise Sum of Matrix
    public static int[] findRowSum(int[][] arr){
        int[] sum  = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum[i] += arr[i][j];
            }
        }
        return sum;
    }

    //Problem 6: Palindrome String
    public static boolean isPalindrome(String s){
        if(s == null) return false;
        if(s.isEmpty()) return true;
        boolean isPalindrome = true;
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    //Problem 7: Count Vowels
    public static int countVowels(String s){
        if(s == null || s.isEmpty()) return 0;
        int cnt = 0;
        String converted = s.trim().toLowerCase();
        for(int i = 0; i < converted.length(); i++){
            char c = converted.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                cnt++;
            }
        }
        return cnt;
    }

    //Problem 8: Character Frequency
    public static int countFrequency(String s, char c){
        if(s == null || s.isEmpty()) return 0;
        int freq = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                freq++;
            }
        }
        return freq;
    }

    //Problem 9: Longest Word
    public static String findLongestWord(String sentence){
        if (sentence == null || sentence.trim().isEmpty()) {
            return null;
        }

        String longestWord = "";
        String[] words = sentence.split("[^a-zA-Z]+");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    //Problem 10: Names Starting with Character 
    public static int countNames(String[] names, char c){
        if(names == null) return 0;
        char ch = Character.toLowerCase(c);
        int count = 0;
        // Count names starting with given character
        for (String name : names) {
            if (!name.isEmpty() &&
                    Character.toLowerCase(name.charAt(0)) == ch) {
                count++;
            }
        }

        // Output result
        return count;
    }

}
