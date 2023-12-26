import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConverter {

    public static String convertToMilitaryTime(String time12Hour) {
        try {
            // Parse input time in 12-hour format
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
            Date date = inputFormat.parse(time12Hour);

            // Format the date in 24-hour format
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace(); // Handle parsing exceptions if any
            return null;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        String time12Hour = "03:30:45 PM";
        String militaryTime = convertToMilitaryTime(time12Hour);

        if (militaryTime != null) {
            System.out.println("Input time (12-hour format): " + time12Hour);
            System.out.println("Military time (24-hour format): " + militaryTime);
        } else {
            System.out.println("Invalid input time format.");
        }
    }
}
