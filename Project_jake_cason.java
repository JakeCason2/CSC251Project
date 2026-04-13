import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Project_jake_cason
{
    public static void main(String[] args)
    {
        int smokerCount = 0;
        int nonSmokerCount = 0;

        ArrayList<Policy> policies = new ArrayList<>();

        try {
            File file = new File("PolicyInformation.txt");
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext())
            {
                int policyNumber = inputFile.nextInt();
                inputFile.nextLine();

                String providerName = inputFile.nextLine();
                String firstName = inputFile.nextLine();
                String lastName = inputFile.nextLine();
                int age = inputFile.nextInt();
                inputFile.nextLine();

                String smokingStatus = inputFile.nextLine();
                double height = inputFile.nextDouble();
                double weight = inputFile.nextDouble();
                inputFile.nextLine(); // move to next line

                // Create object
                Policy policy = new Policy(policyNumber, providerName, firstName,
                        lastName, age, smokingStatus, height, weight);

                if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
                {
                    smokerCount++;
                }
                else
                {
                    nonSmokerCount++;
                }

                // Add to ArrayList
                policies.add(policy);
            }

            inputFile.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        for (Policy policy : policies)
        {
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
            System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", policy.calcBMI());
            System.out.printf("Policy Price: $%.2f\n\n", policy.calcPolicyPrice());
        }

        System.out.println("Number of Policyholders that are smokers: " + smokerCount);
        System.out.println("Number of Policyholders that are non-smokers: " + nonSmokerCount);
    }
}