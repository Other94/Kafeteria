package pl.other.kafeteria;

public class Drink {

    private String address;
    private String  telephone;
    private int imageResourceId;
    public static final Drink[] drinks = {
            new Drink("Szczecińska", "999 991 121", R.drawable.image1),
            new Drink("kołobrzeska", "332 991 121", R.drawable.image2)
    };

    public Drink(String address, String telephone, int imageResourceId) {
        this.address = address;
        this.telephone = telephone;
        this.imageResourceId = imageResourceId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
