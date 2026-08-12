/**
 * @author <s4178227 - Do Dac Loc>
 */

package model;

import java.time.LocalDateTime;
public class InsuranceCard
{
    private String cardNumber;
    private String cardHolderId;
    private String providerName;
    private String policyOwnerId;
    private LocalDateTime expirationDate;

    public InsuranceCard() {
    }

    public InsuranceCard(String cardNumber, String cardHolderId, String providerName, String policyOwnerId, LocalDateTime  expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderId = cardHolderId;
        this.providerName = providerName;
        this.policyOwnerId = policyOwnerId;
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

    public String getPolicyOwnerId() {
        return policyOwnerId;
    }

    public void setPolicyOwnerId(String policyOwnerId) {
        this.policyOwnerId = policyOwnerId;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCardHolderId() {
        return cardHolderId;
    }

    public void setCardHolderId(String cardHolderId) {
        this.cardHolderId = cardHolderId;
    }
}