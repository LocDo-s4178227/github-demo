public class InsuranceCard
{
    private String cardNumber;
    private String providerName;
    private String policyHolderName;
    private String expirationDate;

    public InsuranceCard(String cardNumber, String providerName, String policyHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.providerName = providerName;
        this.policyHolderName = policyHolderName;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}