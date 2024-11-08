public class TwoSum {

    // Main method to test the findTarget function with different target values
    public static void main(String[] args) {

        // Testing the findTarget method with various target values to find pairs that sum up to the target
        findTarget(50);    // Expected output: pairs that sum up to 50, if any
        findTarget(100);   // Expected output: pairs that sum up to 100, if any
        findTarget(250);   // Expected output: pairs that sum up to 250, if any
        findTarget(85);    // Expected output: pairs that sum up to 85, if any
        findTarget(20);    // Expected output: pairs that sum up to 20, if any
    }

    // Method to find and print pairs of numbers from numsArray that add up to the specified target
    public static void findTarget(int target) {

        // Array of numbers to check for pairs that sum up to the target
        int[] numsArray = {50, 20, 50, 10, 50, 25, 10, 10, 35, 10, 25};

        // Counter to keep track of the number of pairs that match the target
        int counter = 0;

        // Length of the numsArray stored in a variable for easier access
        int value = numsArray.length;

        // Display the current target being checked
        System.out.println(" 🏆🏆 " + target + " 🏆🏆");

        // Loop through each element in numsArray to find pairs that add up to the target
        for (int i = 0; i < value; i++) {
            for (int j = i + 1; j < value; j++) {  // Start inner loop from the next element to avoid duplicates

                // Calculate the sum of the elements at indices i and j
                int twoSums = numsArray[i] + numsArray[j];

                // If the sum matches the target, print the indices and values of the matching pair
                if (twoSums == target) {
                    counter++; // Increment counter for each found pair
                    System.out.println("---------------");
                    System.out.println("index [" + i + "] = " + numsArray[i]);
                    System.out.println("index [" + j + "] = " + numsArray[j]);
                }
            }
        }
        System.out.println(); // Blank line for readability

        // Display the total number of solutions found, using singular or plural form based on counter value
        if (counter != 1) {
            System.out.println(counter + " solutions found.");
        } else {
            System.out.println(counter + " solution found.");
        }
        System.out.println(); // Another blank line for readability
    }
}
