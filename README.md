# TwoSum Java Program
The TwoSum program is a Java application that finds pairs of numbers in an array that add up to a specified target value. Designed for those learning basic array manipulation and control flow in Java, this project demonstrates techniques for iterating over arrays and managing nested loops to find specific conditions.

Project Overview:
The TwoSum project is a simple yet powerful program that accepts an integer target value, then searches through a predefined array to find all pairs of numbers that add up to that target. It prints each valid pair’s indices and values, providing a clear example of how to work with loops and conditional logic in Java.

This program can serve as a foundational tool for building more complex algorithms or for practicing coding techniques often used in programming interviews and coding assessments.

Features
---------------------

Target Search: Finds pairs of numbers within a fixed array that add up to a user-defined target.
Output Display: Displays the indices and values of each matching pair, making it easy to understand where in the array the target-sum pairs are located.
Count of Solutions: Tracks and displays the total number of solutions found for each target, including a message if no pairs are found.

How It Works
---------------------

Initialization: The program defines a static array of integers to search through, containing several test cases for different values.
Target Check: A method called findTarget accepts an integer target and iterates through all unique pairs of values in the array.

Nested Loop Logic
---------------------

An outer loop iterates through each element in the array.
An inner loop checks each subsequent element, ensuring that the same pairs aren’t counted twice.
Sum Validation: For each pair of numbers, the program calculates their sum. If the sum matches the target, it prints the indices and values.
Result Output: After all pairs are checked, the program displays the count of matching pairs. If no matches are found, it informs the user that no solutions exist for the given target.

Future Enhancements
---------------------
Possible improvements for this program include:

Dynamic Array Input: Allow users to input their own arrays rather than using a fixed one.
Single-Pass Solution: Implement a single-pass algorithm with a hash map for improved efficiency.
Extended Target Combinations: Find combinations of three or more numbers that sum up to the target.
Graphical User Interface (GUI): Create a basic UI to input array values and target dynamically.
