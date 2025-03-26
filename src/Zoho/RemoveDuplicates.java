package Zoho;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 1, 2, 4, 5};
//        int[] input2 = {4, 5, 7, 7, 7, 2, 5};
//        int[] input3 = {2, 3, 4, 6};

        processArray(input1);
//        processArray(input2);
//        processArray(input3);
    }

    public static void processArray(int[] arr) {
        int[] uniqueArray = new int[arr.length]; // To store unique elements
        int uniqueSize = 0; // To track the number of unique elements

        int[] duplicateElements = new int[arr.length]; // To store duplicate elements
        int[] duplicateCounts = new int[arr.length]; // To store the count of each duplicate element
        int duplicateSize = 0; // To track the number of duplicate elements

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // Check if element is already in uniqueArray
            for (int j = 0; j < uniqueSize; j++) {
                if (arr[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    // Check if it's already recorded as a duplicate
                    boolean alreadyCounted = false;
                    for (int k = 0; k < duplicateSize; k++) {
                        if (duplicateElements[k] == arr[i]) {
                            duplicateCounts[k]++;
                            alreadyCounted = true;
                            break;
                        }
                    }
                    // If not recorded, add to duplicate tracking
                    if (!alreadyCounted) {
                        duplicateElements[duplicateSize] = arr[i];
                        duplicateCounts[duplicateSize] = 1;
                        duplicateSize++;
                    }
                    break;
                }
            }
            // If not duplicate, add to uniqueArray
            if (!isDuplicate) {
                uniqueArray[uniqueSize] = arr[i];
                uniqueSize++;
            }
        }

        // Print unique elements
        System.out.print("Unique Elements: ");
        for (int i = 0; i < uniqueSize; i++) {
            System.out.print(uniqueArray[i]);
            if (i < uniqueSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Print duplicate elements
        if (duplicateSize == 0) {
            System.out.println("No Duplicates");
        } else {
            System.out.println("Duplicates:");
            for (int i = 0; i < duplicateSize; i++) {
                System.out.println("Element: " + duplicateElements[i] + ", Number of Duplicates: " + duplicateCounts[i]);
            }
        }
        System.out.println();
    }
}
