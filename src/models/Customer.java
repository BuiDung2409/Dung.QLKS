package models;

public class Customer {
    private long idCustomer;
    private String citizenidentificationcard;
    private int age;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(String citizenidentificationcard, int age, String phoneNumber) {
        this.citizenidentificationcard = citizenidentificationcard;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCitizenidentificationcard() {
        return citizenidentificationcard;
    }

    public void setCitizenidentificationcard(String citizenidentificationcard) {
        this.citizenidentificationcard = citizenidentificationcard;
    }

    @Override
    public String toString() {
            return String.format("%-18s%-30s%-30s%-18s", getIdCustomer(), getCitizenidentificationcard(), getAge(), getPhoneNumber());
    }
}
