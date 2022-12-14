package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        System.out.println("\t\n ============ TASK 1 ============\n");

        /*
                Write a program that asks user to enter a String, and swaps first and last 4
        characters of this String and print the modified String
        Test data:
        TechGlobal
        Expected output:
        obalGlTech
        NOTE: Write a program that handles any String
        NOTE: First check if the length of String is at least 8, if the String’s length is
        less than 8, then print message “This String does not have 8 characters”

         */
        String str = ScannerHelper.getAName();

        if (str.length() >= 8){
            String first4 = str.substring(0,4);
            String middle = str.substring(4, str.length()-4);
            String last4 = str.substring(str.length()-4);
            System.out.println(last4 + middle + first4);

        }
       else{
            System.out.println("This String does not have 8 characters");
        }





        System.out.println("\t\n ============ TASK 2 ============\n");
        /*TASK-2
        Write a program that asks user to enter a sentence, and swaps first and last
        words of this sentence and print the modified sentence
        Test data:
        Selenium is an automation tool
        Expected output:
        tool is an automation Selenium
        NOTE: Write a program that handles any sentence
        NOTE: First check if the sentence has at least 2 words, if the sentence has
        only one or no word, then print message “This sentence does not have 2 or
        more words to swap”
         */
       // String input = new Scanner(System.in);
       // System.out.println("Pleas enter a sentence");
       // str = input.nextLine();
       // str = str.trim();
       // if(str.contains(""){
       //     String fworld = str.substring(0, str.indexOf(' '));
       //     String middxle = str.substring(str.indexOf(' '),str.substring(str.lastIndexOf(' ') +1));
       //     String lword = str.substring(str.lastIndexOf(' ') +1);
       //     System.out.println(fworld + middxle + lword);
       //else System.out.println("This sentence does not have 2 or more words to swap");





        System.out.println("\t\n ============ TASK 3 ============\n");

       /*
               Assume that you are given some Strings as below, and you want to replace
        bad words with good words.
        String str1 = “These books are so stupid”;
        String str2 = “I like idiot behaviors”;
        String str3 = “I had some stupid t-shirts in the past and also some idiot
        look shoes”;
        Write a Java program that checks any given String and replace bad words
        like “stupid” and “idiot” with “nice” keyword

        Expected output:
        These books are so nice
        I like nice behaviors
        I had some nice t-shirts in the past and also some nice look shoes
        NOTE: Write a program that handles any String
        */

        String str1 = "These books are so stupid";
        String s1 = str1.replace("stupid", "nice");
        System.out.println(s1);

        String str2 = "I like idiot behaviors";
        String s2 = str2.replace("idiot", "nice");
        System.out.println(s2);

        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";
        String s3 = str3.replace("idiot", "nice");
        System.out.println(s3);


        System.out.println("\t\n ============ TASK 4 ============\n");
                    /*
            Write a program that asks user to enter their name.
            First check if length of name is more than 2 and is even or odd
            If length of name is less than 2, then print “Invalid input!!!”
            If length of name is odd, then print middle character from the name
            If length of name is even, then print middle 2 characters from the name
            Test data:
            J
            Expected output:
            Invalid input!!!
            Test data:
            Lionel
            Expected output:
            on
            Test data:
            James
            Expected output:
            m
         */
        String name = ScannerHelper.getAName();
        if(name.length()>2){
            if (name.length() % 2 ==0 )
                System.out.println(name.substring(name.length()/2 -1,name.length()/2 +1));
            else System.out.println(name.charAt(name.length()/2));
        }else System.out.println("Invalid input");

        System.out.println("\t\n ============ TASK 5 ============\n");
                    /*
            Write a program that asks user to enter a country.
            First check if length of country is more than 5. If not, then print “Invalid
            input!!!”
            If length of country is more than 5, then print country name without first 2
            and last 2 characters
            Test data:
            Peru
            Expected output:
            Invalid input!!!
            Test data:
            Brazil
            Expected output:
            az
                     */
       // System.out.println("Please enter a country");
       // String country = input.nextLine();
       // if (country.length() > 5)
       //     System.out.println(country.substring(2,country.length()-2));
       //  else System.out.println("Invalid input!!!");
//

        System.out.println("\t\n ============ TASK 6 ============\n");
        /*
        Write a program that asks user to enter their full address.
        Replace all letter ‘a’ or ‘A’ with ‘*’
        Replace all letter ‘e’ or ‘E’ with ‘#’
        Replace all letter ‘i’ or ‘I’ with ‘+’
        Replace all letter ‘u’ or ‘U’ with ‘$’
        Replace all letter ‘o’ or ‘O’ with ‘@’
        Then, print result after replacements
        Test data:
        2860 S River Rd Suite 350, Des Plaines IL 60018
        Expected output:
        2860 S R+v#r Rd S$+t# 350, D#s Pl*+n#s +L 60018

        */

       String address = ScannerHelper.getAddress();

       address = address.replace('a', '*').replace('A','*').
                         replace('e','#').replace('E', '#').
                         replace('i','+').replace('I','+').
                         replace('u','$').replace('U','$').
                         replace('o','@').replace('O', '@');
       System.out.println(address);




        System.out.println("\t\n ============ TASK 7 ============\n");
        /*
        TASK-7
        Write a program that generates 2 random numbers between 0 and 25 (0 and
        25 are included), Then print all numbers between 2 random numbers that
        cannot be divided by 5 in ascending order.
        Test data:
        int randomNumber1 = 12;
        int randomNumber1 = 4;
        Expected output:
        4 – 6 – 7 – 8 – 9 – 11 – 12

         */
        int randomNumber1 = RandomNumberGenerator.getARandomNumber(0,25);
        int randomNumber2 =RandomNumberGenerator.getARandomNumber(0,25);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        String counter = "";
        Math.min(randomNumber1,randomNumber1);
        Math.max(randomNumber2,randomNumber1);
        for (int i = 0; i <= 25; i++){
            if( i % 5 == 0 )System.out.print(counter += i + " - ");
        }
        System.out.print(counter.substring(0, counter.length()-3));



        System.out.println("\t\n ============ TASK 8 ============\n");
                    /*
            TASK-8
            Write a program that asks user to enter a sentence as a String, and count
            how many words that sentence has, and print it with given below message.
            NOTE: Write a program that handles any String
            NOTE: First check if the given sentence has 2 words at least. If not, then just
            print “This sentence does not have multiple words”.
            Test data 1:
            Java is fun
            Expected output 1:
            This sentence has 3 words.
            Test data 2:
            Hello World
            Expected output 2:
            This sentence has 2 words.
            Test data 3:

            Expected output 3:
            This sentence does not have multiple words
         */



        System.out.println("\t\n ============ TASK 9 ============\n");
                /*
        TASK-9
        Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the
        numbers divided by 2, “Bar” for the numbers divided by 3 and “FooBar” for
        the numbers divided by both 2 and 3.
        Test data:
        6
        Expected output:
        1
        Foo
        Bar
        Foo
        5
        FooBar
         */
        int num = ScannerHelper.getANumber();
        System.out.println(" Positive number is " + num);
        for  (int i = 0; i < num; i++ ){
            if( i % 2 == 0 && i % 3 == 0) System.out.println("FooBar");
            else if( i % 2 == 0 ) System.out.println( "Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);

        }


        System.out.println("\t\n ============ TASK 10 ============\n");
                    /*
            TASK-10
            Write a program that asks user to enter a word, and check if it is palindrome
            or not.
            Palindrome: It is a word that is read the same backward as forward
            •EX/ kayak, civic, madam
            NOTE: Write a program that handles any String
            NOTE: First check if the given String has at least 1 character, if the String
            does not have at least one character, then print message “This word does
            not have 1 or more characters”
            Test data 1:
            T
            Expected output 1:
            This word is palindrome
            Test data 2:
            civic
            Expected output 2:
            This word is palindrome
            Test data 3:
            Madam
            Expected output 3:
            This word is not palindrome
            Test data 4:
            Hello
            Expected output 4:
            This word is not palindrome
            Test data 5:
            Expected output 5:
            This word does not have 1 or more characters
                     */

        ScannerHelper.getAString();
        String word = "";
        String reverse = "";
        for (int i = word.length()-1; i >=0; i--) {
            reverse += reverse + word.charAt(i);
        }
         if(word.equals(reverse)) System.out.println("This word is not palindrome");
         else{
            System.out.println("This word is not palindrome");
        }
        System.out.println("\t\n ============ TASK 11 ============\n");
                /*
        TASK-11
        Write a program that asks user to enter a sentence as a String and count
        how many a or A letters that sentence has and print it with given below
        message.
        NOTE: Write a program that handles any String
        NOTE: First check if the given sentence has 1 character at least. If not, then
        just print “This sentence does not have any characters”.
        Test data 1:
        Expected output 1:
        This sentence does not have any characters.
        Test data 2:
        Apple is one of the largest IT companies.
        Expected output 2:
        This sentence has 3 a or A letters.
        Test data 3:
        I like banana and pineapple.
        Expected output 3:
        This sentence has 5 a or A letters.
          */
        ScannerHelper.


    }


}
