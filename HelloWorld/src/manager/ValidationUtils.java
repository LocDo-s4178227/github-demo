package utils;

import java.util.List;

/**
 *
 * @author s4178227 - Do Dac Loc
 */
public class ValidationUtils {

    private static final String CUSTOMER_ID_REGEX = "^c-\\d{7}$";

    private static final String CARD_NUMBER_REGEX = "^\\d{10}$";

    private static final String CLAIM_ID_REGEX = "^f-\\d{10}$";

    private static final String DOCUMENT_REGEX =
            "^f-\\d{10}_\\d{10}_[a-zA-Z0-9_-]+\\.pdf$";


    private ValidationUtils() {
    }


    public static boolean isValidCustomerId(String id) {
        return id != null && id.matches(CUSTOMER_ID_REGEX);
    }


    public static boolean isValidCardNumber(String cardNumber) {
        return cardNumber != null && cardNumber.matches(CARD_NUMBER_REGEX);
    }


    public static boolean isValidClaimId(String id) {
        return id != null && id.matches(CLAIM_ID_REGEX);
    }


    public static boolean isValidDocument(String document) {
        return document != null && document.matches(DOCUMENT_REGEX);
    }


    public static boolean areDocumentsValid(List<String> documents) {
        if (documents == null) {
            return true;
        }

        for (String document : documents) {
            if (!isValidDocument(document)) {
                return false;
            }
        }

        return true;
    }


    public static boolean isValidClaimAmount(double claimAmount) {
        return claimAmount > 0;
    }



    public static boolean isValidCustomerType(String customerType) {
        return "PolicyHolder".equals(customerType)
                || "Dependent".equals(customerType);
    }


    public static boolean isValidStatus(String status) {
        return "New".equals(status)
                || "Processing".equals(status)
                || "Done".equals(status);
    }


    public static boolean isValidStatusTransition(
            String currentStatus,
            String newStatus) {

        if (!isValidStatus(currentStatus)
                || !isValidStatus(newStatus)) {
            return false;
        }

        if (currentStatus.equals(newStatus)) {
            return true;
        }

        if ("New".equals(currentStatus)
                && "Processing".equals(newStatus)) {
            return true;
        }

        if ("Processing".equals(currentStatus)
                && "Done".equals(newStatus)) {
            return true;
        }

        return false;
    }
}
```
