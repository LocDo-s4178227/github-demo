public class Claim
{
    private String claimId;
    private String claimantName;
    private double claimAmount;
    private String claimStatus;

    public Claim(String claimId, String claimantName, double claimAmount, String claimStatus) {
        this.claimId = claimId;
        this.claimantName = claimantName;
        this.claimAmount = claimAmount;
        this.claimStatus = claimStatus;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getClaimantName() {
        return claimantName;
    }

    public void setClaimantName(String claimantName) {
        this.claimantName = claimantName;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }
}