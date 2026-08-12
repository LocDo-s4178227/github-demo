/**
 * @author <s4178227 - Do Dac Loc>
 */

import java.time.LocalDateTime;
import java.util.List;
public class Claim
{
    private String id;
    private LocalDateTime claimDate;
    private String insuredPersonId;
    private String cardNumber;
    private LocalDateTime examdate;
    private List<String> documents;
    private double claimAmount;
    private String status;

    public enum Status {
    New,
    Processing,
    Done
}

    public Claim(String id, LocalDateTime claimDate, String insuredPersonId, String cardNumber, LocalDateTime examdate, List<String> documents, double claimAmount) {
        this.id = id;
        this.claimDate = claimDate;
        this.insuredPersonId = insuredPersonId;
        this.cardNumber = cardNumber;
        this.examdate = examdate;
        this.documents = documents;
        this.claimAmount = claimAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDateTime claimDate) {
        this.claimDate = claimDate;
    }

    public String getInsuredPersonId() {
        return insuredPersonId;
    }

    public void setInsuredPersonId(String insuredPersonId) {
        this.insuredPersonId = insuredPersonId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDateTime getExamdate() {
        return examdate;
    }

    public void setExamdate(LocalDateTime examdate) {
        this.examdate = examdate;
    }

    public List<String> getDocuments() {
        return documents;
    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}