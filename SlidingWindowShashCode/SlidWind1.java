import java.util.*;

class SlidWind1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int window = 3;
        func(array, window);
    }

    public static void func(int[] array, int window) {
        int endloop = window - 1; // Initialize the end index of the window
        List<Integer> list = new ArrayList<>();
        
        // Iterate over the array until the last possible start of the window
        for (int i = 0; i <= array.length - window; i++) {
            list.clear(); // Clear the list for the new window
            endloop = endloop + 1; // Move the end index of the window
            // Add elements within the current window to the list
            for (int j = i; j < endloop; j++) {
                list.add(array[j]);
            }
            // Print the elements within the current window
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
