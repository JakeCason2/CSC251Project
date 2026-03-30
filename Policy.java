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
    public void setPolicyNumber(int _policyNumber){
        policyNumber = _policyNumber;
    }
    public void setProviderName(String _providerName){
        providerName = _providerName;
    }
    public void setPolicyholderFirstName(String firstName){
        policyholderFirstName = firstName;
    }
    public void setPolicyholderLastName(String lastName){
        policyholderLastName = lastName;
    }
    public void setPolicyholderAge(int age){
        policyholderAge = age;
    }
    public void setSmokingStatus(String _smokingStatus){
        smokingStatus = _smokingStatus;
    }
    public void setPolicyholderHeight(double height){
        policyholderHeight = height;
    }
    public void setPolicyholderWeight(double weight){
        policyholderWeight = weight;
    }

    // Accessor Methods
    public int getPolicyNumber(){
        return(policyNumber);
    }
    public String getProviderName(){
        return(providerName);
    }
    public String getPolicyholderFirstName(){
        return(policyholderFirstName);
    }
    public String getPolicyholderLastName(){
        return(policyholderLastName);
    }
    public int getPolicyholderAge(){
        return(policyholderAge);
    }
    public String getSmokingStatus(){
        return(smokingStatus);
    }
    public double getPolicyholderHeight(){
        return(policyholderHeight);
    }
    public double getPolicyholderWeight(){
        return(policyholderWeight);
    }

    // BMI method
    public double calcBMI()
    {
        // Formula: BMI = (Policyholder’s Weight * 703 ) / (Policyholder’s Height^2 ).
        double BMI = (this.getPolicyholderWeight() * 703) / (this.getPolicyholderHeight() * this.getPolicyholderHeight());
        return(BMI);
    }

    // Policy price method
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
            price += (bmi - 35) * 20;
        }

        return price;
    }
}