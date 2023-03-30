The romanToInt method is a function that converts a Roman numeral to an integer.

Pseudo Code
1. Start by creating a new Java class. Let's call it RomanToInt. 
2. Define the romanToInt method with a String parameter that
represents the Roman numeral to be converted (The method should return an int value)
3. Create a **HashMap that maps each** Roman numeral to its corresponding integer value.
This will be used to look up the integer value of each character in the Roman numeral string.
4. Iterate through each character in the Roman numeral string from right to left.
Starting from the right ensures that we can properly subtract values when a smaller 
numeral appears before a larger one.

/
In step 4 of the implementation, we iterate through each character in the Roman numeral string
from right to left. We do this to ensure that we can properly handle cases where a smaller 
numeral appears before a larger one. For example, in the Roman numeral "IV", the "I" appears 
before the "V", which means we need to subtract the value of "I" (1) from the value of "V" (5)
to get the correct value of 4. If we were iterating from left to right, we would have added 
the value of "I" first and then added the value of "V", which would have given us the 
incorrect value of 6. To keep track of the previous numeral's value, we define a variable
called prev and set it to 0 at the start of the iteration. We then retrieve the integer 
value of the current character using the map hashmap we created earlier. 
If the current value is less than the previous value, it means we need to subtract it 
from the total value. Otherwise, we add it to the total value. For example, in the 
Roman numeral "IV", the value of "I" is less than the value of "V", so we subtract it. 
In the Roman numeral "VI", the value of "I" is greater than the previous value of 0, 
so we add it. After each iteration, we update the prev variable to be equal to the 
current value, so that we can properly handle cases where a smaller numeral appears
before a larger one in subsequent iterations.

*/