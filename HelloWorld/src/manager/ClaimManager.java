/**
 * @author <s4178227 - Do Dac Loc>
 */

package manager;

import model.Claim;
import model.Customer;
import model.InsuranceCard;
import utils.ValidationUtils;

import java.util.ArrayList;
import java.util.List;

public class ClaimManager {

    private List<Customer> customerList = new ArrayList<>();
    private List<InsuranceCard> cardList = new ArrayList<>();
    private List<Claim> claimList = new ArrayList<>();

    public boolean addCustomer(Customer customer) {

    if (customer == null) {
        return false;
    }

    if (!ValidationUtils.isValidCustomerId(customer.getId())) {
        return false;
    }

    if (!ValidationUtils.isValidCustomerType(
            customer.getCustomerType())) {
        return false;
    }

    if ("Dependent".equals(customer.getCustomerType())) {

        if (customer.getParentPolicyHolderId() == null) {
            return false;
        }

        Customer parent = getCustomerById(
                customer.getParentPolicyHolderId());

        if (parent == null) {
            return false;
        }

        if (!"PolicyHolder".equals(parent.getCustomerType())) {
            return false;
        }
    }

    if ("PolicyHolder".equals(customer.getCustomerType())
            && customer.getParentPolicyHolderId() != null) {
        return false;
    }

    if (getCustomerById(customer.getId()) != null) {
        return false;
    }

    customerList.add(customer);
    return true;
    }   

    public boolean updateCustomer(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(customer.getId())) {
                customerList.set(i, customer);
                return true;
            }
        }
        return false;
    }

    public boolean deleteCustomer(String id) {
        return customerList.removeIf(customer ->
                customer.getId().equals(id));
    }

    public Customer getCustomerById(String id) {
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    public List<Customer> getAllCustomers() {
        return customerList;
    }

public boolean addCard(InsuranceCard card) {

    if (card == null) {
        return false;
    }

    if (!ValidationUtils.isValidCardNumber(
            card.getCardNumber())) {
        return false;
    }

    if (getCardByNumber(card.getCardNumber()) != null) {
        return false;
    }

    if (getCustomerById(card.getCardHolderId()) == null) {
        return false;
    }

    if (getCustomerById(card.getPolicyOwnerId()) == null) {
        return false;
    }

    if (card.getExpirationDate() == null) {
        return false;
    }

    cardList.add(card);
    return true;
    }

    public boolean updateCard(InsuranceCard card) {
        for (int i = 0; i < cardList.size(); i++) {
            if (cardList.get(i).getCardNumber()
                    .equals(card.getCardNumber())) {

                cardList.set(i, card);
                return true;
            }
        }
        return false;
    }

    public boolean deleteCard(String cardNumber) {
        return cardList.removeIf(card ->
                card.getCardNumber().equals(cardNumber));
    }

    public InsuranceCard getCardByNumber(String cardNumber) {
        for (InsuranceCard card : cardList) {
            if (card.getCardNumber().equals(cardNumber)) {
                return card;
            }
        }
        return null;
    }

    public List<InsuranceCard> getAllCards() {
        return cardList;
    }

    public boolean addClaim(Claim claim) {

    if (claim == null) {
        return false;
    }

    if (!ValidationUtils.isValidClaimId(claim.getId())) {
        return false;
    }

    if (getClaimById(claim.getId()) != null) {
        return false;
    }

    Customer customer =
            getCustomerById(claim.getInsuredPersonId());

    if (customer == null) {
        return false;
    }

    InsuranceCard card =
            getCardByNumber(claim.getCardNumber());

    if (card == null) {
        return false;
    }

    if (!ValidationUtils.isValidClaimAmount(
            claim.getClaimAmount())) {
        return false;
    }

    if (claim.getClaimDate() == null
            || claim.getExamDate() == null) {
        return false;
    }

    if (claim.getExamDate().isAfter(
            claim.getClaimDate())) {
        return false;
    }

    if (card.getExpirationDate() == null
            || !claim.getExamDate().isBefore(
                    card.getExpirationDate())) {
        return false;
    }

    // Check documents
    if (!ValidationUtils.areDocumentsValid(
            claim.getDocuments())) {
        return false;
    }

    // Check status
    if (!ValidationUtils.isValidStatus(
            claim.getStatus())) {
        return false;
    }

    claimList.add(claim);
    return true;
    }

    public boolean updateClaim(Claim claim) {
        for (int i = 0; i < claimList.size(); i++) {
            if (claimList.get(i).getId().equals(claim.getId())) {
                claimList.set(i, claim);
                return true;
            }
        }
        return false;
    }

    public boolean deleteClaim(String id) {
        return claimList.removeIf(claim ->
                claim.getId().equals(id));
    }

    public Claim getClaimById(String id) {
        for (Claim claim : claimList) {
            if (claim.getId().equals(id)) {
                return claim;
            }
        }
        return null;
    }

    public List<Claim> getAllClaims() {
        return claimList;
    }
}
