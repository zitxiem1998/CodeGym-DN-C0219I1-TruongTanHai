import java.util.Date;

public class Customer {
    private String name;
    private String birthday;
    private String address;

    public Customer(String name, String birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public Customer() {
        this.name = "Hai";
        this.birthday = "1998-08-24";
        this.address = "Dia chi";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
