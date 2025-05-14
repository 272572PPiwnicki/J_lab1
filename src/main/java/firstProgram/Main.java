package firstProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get data from user
        System.out.print("Enter number of items: ");
        int numberOfItems = scanner.nextInt();

        System.out.print("Enter seed: ");
        int seed = scanner.nextInt();

        System.out.print("Enter capacity: ");
        int capacity = scanner.nextInt();

        // Create problem instance
        Problem problem = new Problem(numberOfItems, seed, 1, 10);
        System.out.println("\nGenerated items:");
        System.out.println(problem);

        // Solve the problem
        Result result = problem.solve(capacity);

        // Display the result
        System.out.println("\nSelection:");
        System.out.println(result);
    }
}
