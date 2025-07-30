import java.util.*;
public class basic {
    public static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> marksMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name and Marks in the next few lines:");

        // Sample Data
        String[] nameList = {"Shounak", "Rahul", "Soubeer"};
        int[] marksList = {91, 87, 90};

        // Store names in lowercase for case-insensitive search
        for (int i = 0; i < nameList.length; i++) {
            marksMap.put(nameList[i].toLowerCase(), marksList[i]);
        }

        // Search for marks with exception handling
        try {
            System.out.print("\nEnter a name to search: ");
            String searchName = sc.nextLine().trim().toLowerCase();

            if (searchName.isEmpty()) {
                throw new IllegalArgumentException("Input cannot be empty!");
            }

            if (marksMap.containsKey(searchName)) {
                System.out.println("Marks of " + capitalize(searchName) + " is " + marksMap.get(searchName));
            } else {
                System.out.println("Name Not Found in the List.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {  // Generic catch block for unexpected errors
            System.out.println("An unexpected error occurred: " + e);

        } finally {
            sc.close();  // Ensuring Scanner gets closed to prevent memory leak
        }
    }
}
