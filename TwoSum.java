public class TwoSum {
    public static void main(String[] args) {

        //array
        findTarget(0);
        findTarget(1);
        findTarget(2);
        findTarget(3);
        findTarget(4);
        findTarget(5);
        findTarget(6);
        findTarget(7);
        findTarget(8);
        findTarget(9);
        findTarget(10);
        findTarget(11);
    }


    // find target function
    public static void findTarget(int target){
        int[] numsArray = {0,1,2,3,4,5,6,7,8,9,10};
        int counter = 0;
        int value = numsArray.length;

        System.out.println(" 🏆🏆 " + target + " 🏆🏆");

        // for loops
        for (int i=0; i<value; i++){
            for (int j=i+1; j<value; j++){

                int twoSums = numsArray[i] + numsArray[j];

                if (twoSums == target){
                    System.out.println("--------------");

                }

                if (twoSums == target){
                    counter++;
                    System.out.println("index [" + i + "] = " + numsArray[i]);
                    System.out.println("index [" + j + "] = " + numsArray[j]);
                }
            }
        }
        System.out.println();
        if (counter != 1) {
            System.out.println(target + " has " + counter + " solutions.");
        } else {
            System.out.println(target + " has " + counter + " solution.");
        }
        System.out.println();
    }
}
