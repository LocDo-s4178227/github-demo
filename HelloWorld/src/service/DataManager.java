package service;

import manager.ClaimManager;
import model.Claim;
import model.Customer;
import model.InsuranceCard;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author s4178227 - Do Dac Loc
 */

public class DataManager {

    private static final String CUSTOMER_FILE = "data/customers.txt";
    private static final String CARD_FILE = "data/cards.txt";
    private static final String CLAIM_FILE = "data/claims.txt";

    public static void loadData(ClaimManager manager) {

        loadCustomers(manager);
        loadCards(manager);
        loadClaims(manager);

        System.out.println("Data loaded successfully.");
    }


    private static void loadCustomers(ClaimManager manager) {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(CUSTOMER_FILE))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                if (data.length != 4) {
                    continue;
                }

                String id = data[0];
                String fullName = data[1];
                String customerType = data[2];

                String parentId =
                        data[3].isEmpty() ? null : data[3];

                Customer customer = new Customer(
                        id,
                        fullName,
                        customerType,
                        parentId
                );

                manager.addCustomer(customer);
            }

        } catch (IOException e) {
            System.out.println(
                    "Error loading customers: " + e.getMessage());
        }
    }


    private static void loadCards(ClaimManager manager) {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(CARD_FILE))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                if (data.length != 4) {
                    continue;
                }

                String cardNumber = data[0];
                String cardHolderId = data[1];
                String policyOwnerId = data[2];

                LocalDateTime expirationDate =
                        LocalDateTime.parse(data[3]);

                InsuranceCard card = new InsuranceCard(
                        cardNumber,
                        cardHolderId,
                        policyOwnerId,
                        expirationDate
                );

                manager.addCard(card);
            }

        } catch (IOException | RuntimeException e) {
            System.out.println(
                    "Error loading cards: " + e.getMessage());
        }
    }


    private static void loadClaims(ClaimManager manager) {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(CLAIM_FILE))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",", -1);

                if (data.length != 8) {
                    continue;
                }

                String id = data[0];

                LocalDateTime claimDate =
                        LocalDateTime.parse(data[1]);

                String insuredPersonId = data[2];
                String cardNumber = data[3];

                LocalDateTime examDate =
                        LocalDateTime.parse(data[4]);

                List<String> documents =
                        data[5].isEmpty()
                                ? new ArrayList<>()
                                : Arrays.asList(data[5].split(";"));

                double claimAmount =
                        Double.parseDouble(data[6]);

                String status = data[7];

                Claim claim = new Claim(
                        id,
                        claimDate,
                        insuredPersonId,
                        cardNumber,
                        examDate,
                        documents,
                        claimAmount,
                        status
                );

                manager.addClaim(claim);
            }

        } catch (IOException | RuntimeException e) {
            System.out.println(
                    "Error loading claims: " + e.getMessage());
        }
    }

    public static void saveData(ClaimManager manager) {

        saveCustomers(manager);
        saveCards(manager);
        saveClaims(manager);

        System.out.println("Data saved successfully.");
    }


    private static void saveCustomers(ClaimManager manager) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(CUSTOMER_FILE))) {

            for (Customer customer : manager.getAllCustomers()) {

                writer.write(
                        customer.getId() + "," +
                        customer.getFullName() + "," +
                        customer.getCustomerType() + "," +
                        (customer.getParentPolicyHolderId() == null
                                ? ""
                                : customer.getParentPolicyHolderId())
                );

                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println(
                    "Error saving customers: " + e.getMessage());
        }
    }


    private static void saveCards(ClaimManager manager) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(CARD_FILE))) {

            for (InsuranceCard card : manager.getAllCards()) {

                writer.write(
                        card.getCardNumber() + "," +
                        card.getCardHolderId() + "," +
                        card.getPolicyOwnerId() + "," +
                        card.getExpirationDate()
                );

                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println(
                    "Error saving cards: " + e.getMessage());
        }
    }


    private static void saveClaims(ClaimManager manager) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(CLAIM_FILE))) {

            for (Claim claim : manager.getAllClaims()) {

                String documents = "";

                if (claim.getDocuments() != null) {
                    documents = String.join(
                            ";",
                            claim.getDocuments()
                    );
                }

                writer.write(
                        claim.getId() + "," +
                        claim.getClaimDate() + "," +
                        claim.getInsuredPersonId() + "," +
                        claim.getCardNumber() + "," +
                        claim.getExamDate() + "," +
                        documents + "," +
                        claim.getClaimAmount() + "," +
                        claim.getStatus()
                );

                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println(
                    "Error saving claims: " + e.getMessage());
        }
    }
}