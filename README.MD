The romanToInt method is a function that converts a Roman numeral to an integer.

Pseudo Code
1. CreatE a new Java **class() RomanToInt().** 
2. Define the **romanToInt method** with a String parameter that
represents the Roman numeral to be converted (The method should return an int value)


3. Create a **HashMap that maps each** Roman numeral to its corresponding integer value.
 - This will be used to look up the integer value of each character in the Roman numeral string.
 - It creates a HashMap that maps each Roman numeral character to its corresponding integer value. For example,
   the character 'I' is mapped to the integer value 1, 'V' is mapped to 5, and so on.

4. Converting **Roman Numeral to Integer**
       
        *The input string s is looped through in reverse order, and each character is looked up 
         in the Map to find its corresponding integer value.If a character is not found in the Map, an exception is thrown.
             - Iterate through each character in the Roman numeral string from right to left.
            Starting from the right ensures that we can properly subtract values when a smaller 
            numeral appears before a larger one.
         *The integer value of each character is then compared to the value of the previous character. If the current value is greater than or equal to the previous value,it is added
         to the result. Otherwise, it is subtracted from the result. This is because in Roman numerals, a smaller numeral placed before a larger numeral means subtraction, while a smaller numeral placed after a larger numeral means addition.

5.**The Main Method** 
        *It prompts the user to enter a Roman numeral, reads the input from the console, and then closes the Scanner
            -  This code calls the romanToInt method to convert the user's input to an integer value. If the conversion is successful, the resulting integer value is displayed. If an exception is thrown, an error message is displayed instead