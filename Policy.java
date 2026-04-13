public class Policy
{
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

    /**
     * A constructor with no arguments that sets all variables to default values.
     * **/
    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        smokingStatus = "";
        policyholderHeight = 0.0;
        policyholderWeight = 0.0;
    }

    /**
     * A constructor with arguments that allowing users to make a custom policy.
     * @param _policyNumber the policy number
     * @param _providerName the name of the provider
     * @param firstName policyholder's first name
     * @param lastName policyholder's last name
     * @param age policyholder's age
     * @param _smokingStatus policyholder's smoking status
     * @param height policyholder's height
     * @param weight policyholder's weight
     */
    public Policy(int _policyNumber, String _providerName, String firstName, String lastName, int age, String _smokingStatus, double height, double weight)
    {
        policyNumber = _policyNumber;
        providerName = _providerName;
        policyholderFirstName = firstName;
        policyholderLastName = lastName;
        policyholderAge = age;
        smokingStatus = _smokingStatus;
        policyholderHeight = height;
        policyholderWeight = weight;
    }
    // Mutator Methods
    /**
     * Sets the policy number.
     * @param _policyNumber the policy number to set
     */
    public void setPolicyNumber(int _policyNumber){
        policyNumber = _policyNumber;
    }
    /**
     * Sets the provider name.
     * @param _providerName the provider name to set
     */
    public void setProviderName(String _providerName){
        providerName = _providerName;
    }
    /**
     * Sets the policyholder's first name.
     * @param firstName the first name to set
     */
    public void setPolicyholderFirstName(String firstName){
        policyholderFirstName = firstName;
    }
    /**
     * Sets the policyholder's last name.
     * @param lastName the last name to set
     */
    public void setPolicyholderLastName(String lastName){
        policyholderLastName = lastName;
    }
    /**
     * Sets the policyholder's age.
     * @param age the age to set
     */
    public void setPolicyholderAge(int age){
        policyholderAge = age;
    }
    /**
     * Sets the policyholder's smoking status.
     * @param _smokingStatus the smoking status to set ("smoker" or "non-smoker")
     */
    public void setSmokingStatus(String _smokingStatus){
        smokingStatus = _smokingStatus;
    }
    /**
     * Sets the policyholder's height.
     * @param height the height in inches to set
     */
    public void setPolicyholderHeight(double height){
        policyholderHeight = height;
    }
    /**
     * Sets the policyholder's weight.
     * @param weight the weight in pounds to set
     */
    public void setPolicyholderWeight(double weight){
        policyholderWeight = weight;
    }

    // Accessor Methods
    /**
     * Returns the policy number.
     * @return the policy number
     */
    public int getPolicyNumber(){
        return(policyNumber);
    }
    /**
     * Returns the provider name.
     * @return the provider name
     */
    public String getProviderName(){
        return(providerName);
    }
    /**
     * Returns the policyholder's first name.
     * @return the policyholder's first name
     */
    public String getPolicyholderFirstName(){
        return(policyholderFirstName);
    }
    /**
     * Returns the policyholder's last name.
     * @return the policyholder's last name
     */
    public String getPolicyholderLastName(){
        return(policyholderLastName);
    }
    /**
     * Returns the policyholder's age.
     * @return the policyholder's age
     */
    public int getPolicyholderAge(){
        return(policyholderAge);
    }
    /**
     * Returns the policyholder's smoking status.
     * @return the policyholder's smoking status
     */
    public String getSmokingStatus(){
        return(smokingStatus);
    }
    /**
     * Returns the policyholder's height.
     * @return the policyholder's height in inches
     */
    public double getPolicyholderHeight(){
        return(policyholderHeight);
    }
    /**
     * Returns the policyholder's weight.
     * @return the policyholder's weight in pounds
     */
    public double getPolicyholderWeight(){
        return(policyholderWeight);
    }

    /**
     * Calculates and returns the BMI of the policyholder.
     * @return the BMI calculated from the policyholder's height and weight
     */
    public double calcBMI()
    {
        // Formula: BMI = (Policyholder’s Weight * 703 ) / (Policyholder’s Height^2 ).
        double BMI = (this.getPolicyholderWeight() * 703) / (this.getPolicyholderHeight() * this.getPolicyholderHeight());
        return(BMI);
    }

    // Policy price method
    /**
     * Calculates and returns the price of the insurance policy.
     * @return the total policy price based on age, smoking status, and BMI
     */
    public double calcPolicyPrice()
    {
        double price = 600.00;

        if (policyholderAge > 50){
            price += 75.00;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")){
            price += 100.00;
        }

        double bmi = calcBMI();
        if (bmi > 35){
            price += 200.00;
        }

        return price;
    }
}