package case_study.model.person;

public class Customer extends Person {
    private String idCustomer;
    private String customerType;
    private String addressCustomer;

    public Customer(String idCustomer, String customerType, String addressCustomer) {
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.addressCustomer = addressCustomer;
    }

    public Customer(String idCustomer, String name, String dateOfBirth, String gender, String identity, String phoneNumber, String email, String customerType, String addressCustomer) {
        super(name, dateOfBirth, gender, identity, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.addressCustomer = addressCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getIntoCsv() {
        return this.idCustomer + ","+ super.getIntoCsv() + ","+ this.customerType + "," + this.addressCustomer;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", gender='" + getGender() + '\'' +
                ", indentity=" + getIndentity() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", customerType='" + customerType + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}
