import java.time.LocalDateTime;
public class Claim
{
    private String Id;
    private LocalDateTime claimDate;
    private String claimId;
    private String claimantName;
    private double claimAmount;
    private String claimStatus;


    public Claim(String Id, LocalDateTime claimDate, String claimId, String claimantName, double claimAmount, String claimStatus) {
        this.Id = Id;
        this.claimDate = claimDate;
        this.claimId = claimId;
        this.claimantName = claimantName;
        this.claimAmount = claimAmount;
        this.claimStatus = claimStatus;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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

    public LocalDateTime getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDateTime claimDate) {
        this.claimDate = claimDate;
    }
}