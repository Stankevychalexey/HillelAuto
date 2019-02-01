package lesson2;

public class SwitchCase {
    public static void main(String[] args) {

        // 1-й пример:
        
        String grade = "A";
        switch (grade) {
            case "A":

                System.out.println("Well done!");

                break;

            case "B":

            case "C":
                System.out.println("Done");

            default:
                System.out.println("Bad result");

                // 2-й пример:

                int day = 3;
                String dayString;
                switch (day) {
                    case 1:
                        dayString = "Monday";
                        break;
                    case 2:
                        dayString = "Tuesday";
                        break;
                    case 3:
                        dayString = "Wednesday";
                        break;
                    case 4:
                        dayString = "Thursday";
                        break;
                    case 5:
                        dayString = "Friday";
                        break;
                    case 6:
                        dayString = "Saturday";
                        break;
                    case 7:
                        dayString = "Sunday";
                        break;
                    default:
                        dayString = "Error";
                        break;
                }
                System.out.print(dayString);
        }
    }
}