/**
 * @author <s4178227 - Do Dac Loc>
 */

import model.Claim;
import model.Customer;
import model.InsuranceCard;

import java.util.ArrayList;
import java.util.List;

public class ClaimManager {

    private List<Customer> customerList = new ArrayList<>();
    private List<InsuranceCard> cardList = new ArrayList<>();
    private List<Claim> claimList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerList.add(customer);
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

    public void addCard(InsuranceCard card) {
        cardList.add(card);
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

    public void addClaim(Claim claim) {
        claimList.add(claim);
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
```
