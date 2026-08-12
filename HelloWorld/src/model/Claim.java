/**
 * @author <s4178227 - Do Dac Loc>
 */

package model;

import java.time.LocalDateTime;
import java.util.List;
public class Claim
{
    private String id;
    private LocalDateTime claimDate;
    private String insuredPersonId;
    private String cardNumber; 
    private LocalDateTime examDate; 
    private List<String> documents; 
    private double claimAmount; 
    private String status;

    public Claim() {
    }

    public Claim(String id, LocalDateTime claimDate, String insuredPersonId, String cardNumber, LocalDateTime examDate, List<String> documents, double claimAmount, String status) { 
        this.id = id; 
        this.claimDate = claimDate; 
        this.insuredPersonId = insuredPersonId; 
        this.cardNumber = cardNumber; 
        this.examDate = examDate; 
        this.documents = documents; 
        this.claimAmount = claimAmount; 
        this.status = status; } 

        public String getId() 
            { return id; } 

        public void setId(String id) { 
            this.id = id; } 
            
        public LocalDateTime getClaimDate() { 
            return claimDate; } 
            
        public void setClaimDate(LocalDateTime claimDate) { 
            this.claimDate = claimDate; } 
            
        public String getInsuredPersonId() { 
            return insuredPersonId; } 
            
        public void setInsuredPersonId(String insuredPersonId) { 
            this.insuredPersonId = insuredPersonId; } 
            
        public String getCardNumber() { 
            return cardNumber; } 
            
        public void setCardNumber(String cardNumber) { 
            this.cardNumber = cardNumber; } 
            
        public LocalDateTime getExamDate() { 
            return examDate; } 
            
        public void setExamDate(LocalDateTime examDate) { 
            this.examDate = examDate; } 
            
        public List<String> getDocuments() { 
            return documents; } 
            
        public void setDocuments(List<String> documents) { 
            this.documents = documents; } 
            
        public double getClaimAmount() { 
            return claimAmount; } 
            
        public void setClaimAmount(double claimAmount) { 
            this.claimAmount = claimAmount; } 
            
        public String getStatus() { 
            return status; } 
            
        public void setStatus(String status) { 
            this.status = status; } 
            
        @Override
        public String toString() {
            return "Claim{" +
                    "id='" + id + '\'' +
                    ", claimDate=" + claimDate +
                    ", insuredPersonId='" + insuredPersonId + '\'' +
                    ", cardNumber='" + cardNumber + '\'' +
                    ", examDate=" + examDate +
                    ", documents=" + documents +
                    ", claimAmount=" + claimAmount +
                    ", status='" + status + '\'' +
                    '}';
        }
    }