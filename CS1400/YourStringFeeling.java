

    public class YourStringFeeling {
    
        public static String yourString(int feeling) {
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
    
        public static void main(String[] args) {
            // Example usage
            int feeling = 1;
            System.out.println(yourString(feeling));
        }
    }

