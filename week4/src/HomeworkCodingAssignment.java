public class HomeworkCodingAssignment {
    public static void main(String[] args) {
        /*1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  

b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

i. Make sure that there are 9 elements of type int in this new array.  

ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

c. Use a loop to iterate through the array and calculate the average age. Print the result to the console. */

        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int[] ages2 = {1,2,3,4,5,6,7,8,9};

        System.out.println("1a. --------------------------");
        System.out.println(subtractAge(ages, ages));

        System.out.println("1.ii -------------------------");
        System.out.println(subtractAge(ages2, ages2));

        System.out.println("1c. --------------------------");
        int sum = 0;
        for(int i = 0;i < ages.length;i++){
            sum += ages[i];
        }
        System.out.println(sum / ages.length);




//         2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

//               a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

//               b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        System.out.println("2a.---------------------------");
        String[] names = {"Sam", "Tommy", "Tim", "Sally","Buck", "Bob"};
        int nameLength = 0;
        for (int i = 0; i < names.length; i++){
            nameLength += names[i].length();
            System.out.println(names[i] + " length is: " +  names[i].length());
        }
        System.out.println("average length is " + nameLength / names.length);

        System.out.println("2b. --------------------------");
        String allNames = "";
        for(String name : names){
            allNames += name + " ";
        }
        System.out.println(allNames);



        // 3. How do you access the last element of any array?
        // arrayExample[arrayExample.length - 1]

        // 4. How do you access the first element of any array?
        // arrayExample[0]

        // 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array
        // and add the length of each name to the nameLengths array.
        System.out.println("5. --------------------------------");
        int[] nameLengths = new int[names.length];
        for(int i = 0; i < names.length; i++){
            nameLengths[i] = names[i].length();
            System.out.println(nameLengths[i]);



        }



        // 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        System.out.println("6. -----------------");
        int sumOfLengths = 0;
        for(int value : nameLengths){
            sumOfLengths += value;

        }
        System.out.println(sumOfLengths);

        // 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
        //concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
        System.out.println("7.------------");
        repeat("Hello", 3);

        
        // 8. Write a method that takes two Strings, firstName and lastName, and 
        //returns a full name (the full name should be the first and the last name as a String separated by a space).
        System.out.println("\n8. ------------------");
        System.out.println(concatStrings("Camille", "West"));


        // 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        System.out.println("9. -----------------------");

        int[] arraySum100 = {25,25,25,25,5};
        System.out.println(ifSum100(arraySum100));


        int[] sumNot100 = {2,6,19,25};
        System.out.println(ifSum100(sumNot100));



        //10. Write a method that takes an array of double and returns the average of all the elements in the array.
        System.out.println("10. ---------------------");
        double[] doubleArr = {2.2, 4.4, 6.6, 8.8};
        System.out.println(averageOfDouble(doubleArr));

        double[] doubleArr2 = {25.3,25.15,12.2,9.9,100.5};
        System.out.println(averageOfDouble(doubleArr2));


        //11. Write a method that takes two arrays of double and returns true if the average of 
        //the elements in the first array is greater than the average of the elements in the second array.
        System.out.println("11. ------------------------------");
        System.out.println(compareDoubles(doubleArr, doubleArr2));



        //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
        // and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        System.out.println("12. ----------------");
        System.out.println(willBuyDrink(true, 11));
        System.out.println(willBuyDrink(false, 11));
        System.out.println(willBuyDrink(true, 9));


        //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
        System.out.println("13. ---------------------");
        System.out.println(isCute("Monkey"));
        System.out.println(isCute("Cat"));
        //It tells me if an animal is cute or not




        




    }
    //  1.
    public static int subtractAge(int[] arr1,int[] arr2) {
            return arr1[arr1.length-1] - arr2[0];
        }


    //7.
    public static void repeat(String word, int n){
            for(int i = 0; i < n; i++){
                System.out.print(word);
            }
        }


    // 8.
    public static String concatStrings(String a, String b){
        return a + " " + b;
    }


    //9.
    public static boolean ifSum100(int[] arr){
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        if(sum > 100){
            return true;
        }else{
            return false;
        }
    }


    //10.
    public static double averageOfDouble(double[] arr){
        double sum = 0;
        for(double a : arr){
            sum += a;
        }
        return sum / arr.length;
    }

    //11.
    public static boolean compareDoubles(double[] arr1,double[] arr2){
        double arr1Average = averageOfDouble(arr1);
        double arr2Average = averageOfDouble(arr2);
        if(arr1Average > arr2Average){
            return true;
        }else{
            return false;
        }
    
    }


    //12.
    public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket){
        if( isHotOutside && moneyInPocket > 10.50){
            return true;
        }else{
            return false;
        }
    }

    //13.
    public static boolean isCute(String animal){
        if(animal == "Cat" || animal == "Hedgehog"){
            return true;
        }else{
            return false;
        }
    }
}
