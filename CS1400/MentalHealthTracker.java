import java.util.Scanner;

public class MentalHealthTracker {
    static Scanner scanner = new Scanner(System.in);
    static int[] a = new int[5];
    static int feeling;

    public static void main(String[] args) {
        System.out.println("Mental Health Daily Check-in: \n");
        System.out.println("Mental Health Tracker");
        System.out.println("=====================");
        System.out.println("How are you feeling today?");
        System.out.println("1: Relaxed/Content\n2: Lonely/Insecure\n3: Productive/Motivated\n4: Tired/Drained\n5: Average/Fine\n6: Anxious/Frustrated");

        //valid choices//
        int[] ints = {1, 2, 3, 4, 5, 6}; 
        a[0] = askForInt("", ints);
        feeling = a[0];
        
        System.out.println("Today you have inputed that you are feeling: " + getFeelingDescription(feeling));
    }

    public static String getFeelingDescription(int feeling) {
        switch (feeling) {
            case 1: return "Relaxed/Content";
            case 2: return "Lonely/Insecure";
            case 3: return "Productive/Motivated";
            case 4: return "Tired/Drained";
            case 5: return "Average/Fine";
            case 6: return "Anxious/Frustrated";
            default: return "Unknown";
        }
    }

    public static int askForInt(String prompt, int[] validChoices) {
        int input;
        while (true) {
            System.out.println(prompt); // Reprint the menu string
            System.out.print("Enter your choice: ");
            try {
                input = Integer.parseInt(scanner.nextLine());
                for (int choice : validChoices) {
                    if (input == choice) {
                        return input;
                    }
                }
                System.out.println("Invalid choice. Please try again.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}



