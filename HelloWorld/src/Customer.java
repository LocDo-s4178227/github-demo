public class Customer {
    private String fullname;
    private int age;
    private String email;
    private String id;
    private String customerType;
    private String parentPolicyHolderId ;

    public Customer(String fullname, int age, String email) {
        this.fullname = fullname;
        this.age = age;
        this.email = email;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                '}';
    }
}