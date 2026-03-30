import java.util.Scanner;

public class Project_jake_cason
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;

        //Policy Number
        System.out.print("Please enter the Policy Number: ");
        policyNumber = input.nextInt();
        input.nextLine();

        //Provider Name
        System.out.print("Please enter the Provider Name: ");
        providerName = input.nextLine();

        //First Name
        System.out.print("Please enter the Policyholder’s First Name: ");
        firstName = input.nextLine();

        // Last Name
        System.out.print("Please enter the Policyholder’s Last Name: ");
        lastName = input.nextLine();

        //Age
        System.out.print("Please enter the Policyholder’s Age: ");
        age = input.nextInt();
        while (age <= 0){
            System.out.print("Invalid age. Please enter a positive number: ");
            age = input.nextInt();
        }
        input.nextLine();

        //Smoking Status
        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        smokingStatus = input.nextLine();

        while (!smokingStatus.equalsIgnoreCase("smoker") && !smokingStatus.equalsIgnoreCase("non-smoker")) {
            System.out.print("Invalid input. Enter 'smoker' or 'non-smoker': ");
            smokingStatus = input.nextLine();
        }

        //Height
        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        height = input.nextDouble();
        while (height <= 0){
            System.out.print("Invalid height. Please enter a positive number: ");
            height = input.nextDouble();
        }

        //Weight
        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        weight = input.nextDouble();
        while (weight <= 0){
            System.out.print("Invalid weight. Please enter a positive number: ");
            weight = input.nextDouble();
        }

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("\nProvider Name: " + policy.getProviderName());
        System.out.println("\nPolicyholder’s First Name: " + policy.getPolicyholderFirstName());
        System.out.println("\nPolicyholder’s Last Name: " + policy.getPolicyholderLastName());
        System.out.println("\nPolicyholder’s Age: " + policy.getPolicyholderAge());
        System.out.println("\nPolicyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("\nPolicyholder’s Height: " + policy.getPolicyholderHeight() + " inches");
        System.out.println("\nPolicyholder’s Weight: " + policy.getPolicyholderWeight() + " pounds");
        System.out.printf("\nPolicyholder’s BMI: %.2f\n", policy.calcBMI());
        System.out.printf("\nPolicy Price: $%.2f", policy.calcPolicyPrice());

        input.close();
    }
}