package com.example.admin.javareview;

import java.util.ArrayList;
import java.util.List;

public class CodingReview {


//psvm: creates a main function
//sout: creates system out

//Problem 1
//Create a function to print the duplicates in a list of strings

//Problem 2
//Create function to check if the string is a palindrome

//Problem 3
//Create a function that will print
//fizz if the number is divisible by 3
//buzz if the number is divisible by 5
//fizzbuzz if the number is divisible by both
//The integer for the rest
//you can use a for loop for using the first 20 integers

        //Problem 4
//Create a function to check if the two strings are Anagrams
//Ex. COAT and TACO would be anagrams
//Problem 5
// Print a multiplication table from 1 to 10 using multidimensional array
//Output
//1 2 3 4 5 6 7 8 9 10
//2 4 6 8 10 12 14 16 18 20
//..
        public static void findDuplicates(List<String> strList){

            List<String> strDuplicates = new ArrayList<>();

            for(int i=0;i<strList.size();i++){

                for(int j=i+1;j<strList.size();j++){

                    if(strList.get(i).equals(strList.get(j))){

                        strDuplicates.add(strList.get(i));

                    }

                }

            }
            System.out.println(strDuplicates);
        }


        public static boolean checkforPalindrome(String str){

            int i=0;
            int j=str.length()-1;
            boolean isPalindrome=true;

            while(!(i>=j)){

                if(!(str.charAt(i)==str.charAt(j))){
                    isPalindrome=false;
                    break;

                }

                i++;
                j--;

            }
            return isPalindrome;
        }


        public static void fizzBuzz(int n){


            String output="";

            if(n%3==0){
                output+="fizz";
            }

            if(n%5==0){
                output+="buzz";
            }
            if(output.equals("")){
                System.out.println(n);
            }
            else{
                System.out.println(output);
            }
        }

        public static boolean findAnagrams(String str1,String str2){

            boolean areAnagrams=true;

            //Check that the lengths of the strings are equal
            if(str1.length()!=str2.length())
                return false;

            //Confirm that both strings share letters

            boolean duplicateFound=false;

            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str1.toUpperCase().charAt(i)==str2.toUpperCase().charAt(j)){
                        duplicateFound=true;
                    }
                }
                if(!duplicateFound) {
                    areAnagrams = false;
                    break;
                }
            }

            return areAnagrams;
        }

        public static void printMultiplicationTable(){
            int[][]multiplicationTable = new int[10][10];
            for(int i=0;i<10;i++){
                multiplicationTable[0][i]=i+1;
            }

            for(int i=1;i<multiplicationTable.length;i++){
                for(int j=0;j<multiplicationTable.length;j++){
                    multiplicationTable[i][j]=multiplicationTable[0][i]*multiplicationTable[0][j];
                }
            }

            for(int[] a: multiplicationTable){
                for(int n:a){
                    System.out.print(n+" ");
                }
                System.out.println();
            }


        }

    public static void main(String[] args) {
        System.out.println("Problem 1:");
            ArrayList<String> strList = new ArrayList<>();
            strList.add("cat");
            strList.add("dog");
            strList.add("cat");

            findDuplicates(strList);

        System.out.println("Problem 2:");
            String palindrome="abba";
        System.out.println(checkforPalindrome(palindrome));

        palindrome="abbca";
        System.out.println(checkforPalindrome(palindrome));

        System.out.println("Problem 3:");
        for(int i=0;i<=20;i++)
        fizzBuzz(i);

        System.out.println("Problem 4:");
        System.out.println(findAnagrams("coat","taco"));

        System.out.println("Problem 5:");

        printMultiplicationTable();
    }


}
