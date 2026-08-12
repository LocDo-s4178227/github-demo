/**
 * @author <s4178227 - Do Dac Loc>
 */

package model;
public class Customer {

    private String id;
    private String fullname;
    private int age;
    private String email;
    private String customerType;
    private String parentPolicyHolderId ;

    public Customer() {
    }

    public Customer(String id, String fullname, int age, String email, String customerType, String parentPolicyHolderId) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.email = email;
        this.customerType = customerType;
        this.parentPolicyHolderId = parentPolicyHolderId;
    }

    public String getId() {
        return id;
    }

        public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getParentPolicyHolderId() {
        return parentPolicyHolderId;
    }

    public void setParentPolicyHolderId(String parentPolicyHolderId) {
        this.parentPolicyHolderId = parentPolicyHolderId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", customerType='" + customerType + '\'' +
                ", parentPolicyHolderId='" + parentPolicyHolderId + '\'' +
                '}';
    }
}