package pl.other.kafeteria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Clients {

    private String address;
    private String  telephone;
    private int imageResourceId;

    private String city;



    //    "Gdańsk" "Sopot" "Gdynia" "Inne";

    public static final Clients[] client = {
            new Clients("Szczecińska", "999 991 121", R.drawable.image1, "Gdańśk"),
            new Clients("kołobrzeska", "332 991 121", R.drawable.image2, "Sopot")
    };


    public Clients(String address, String telephone, int imageResourceId, String city) {
        this.address = address;
        this.telephone = telephone;
        this.imageResourceId = imageResourceId;
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        return  address;
    }
}
