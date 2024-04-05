import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Initialize ArrayList to store days and temperatures
		ArrayList<String> daysOfWeek = new ArrayList<>();
		ArrayList<Double> temperatures = new ArrayList<>();
		
		// Prompt user to enter daily average temperatures for one week
		System.out.print("Enter daily average temperatures for one week:");
		for (int i = 0; i < 7; i++) {
			System.out.print("Enter day of the week (e.g., Monday: ");
			String day = scanner.nextLine();
			System.out.print("Enter average temperature for " + day + ": " );
			double temperature = scanner.nextDouble();
			scanner.nextLine();  // consume newLine character
			
		// Add day and temperature to respective ArrayList
		daysOfWeek.add(day);
		temperatures.add(temperature);
			
	}
		
		// Prompt user for day or week and display corresponding data
		System.out.println("\nEnter 'week' to display weekly average or enter a day of the week: ");
		String input = scanner.nextLine();	
		
		if (input.equalsIgnoreCase("week")) {
			// calculate weekly average temperature
			double weeklyAverage = calculateAverage(temperatures);
			System.out.println("\nWeekly Average Temperature: " + weeklyAverage + " C");
		} else {
			// Display temperature for the entered day
			int index = daysOfWeek.indexOf(input);
			if (index != -1) {
				double temperature = temperatures.get(index);
				System.out.println("\nTemperature on " + input + ": " + temperature + " C");
			} else {
				System.out.println("Invalid input. Please enter a valid day of the week or 'week'.");		
		}	
			
	}		
			
		scanner.close();
}		
			

		// Method to calculate average of temperatures
		public static double calculateAverage(ArrayList<Double> temperatures) {
			double sum = 0;
			for (double temp : temperatures) {
				sum += temp;

			}
			
			return sum / temperatures.size();
		}

}



