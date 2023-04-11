import java.sql.Date;

public class User {
    private Date birthdate;
    private Number size;
    private String photos;
    private Address address;

    public User(Date birthdate, Number size, String photos, Address address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public Date getBirthdate() {return birthdate;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}

    public Number getSize() {return size;}
    public void setSize(Number size) {this.size = size;}

    public String getPhotos() {return photos;}
    public void setPhotos(String photos) {this.photos = photos;}

    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}
}
