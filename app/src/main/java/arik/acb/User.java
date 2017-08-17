package arik.acb;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake on 8/7/2017.
 */

public class User {
    String userName, userPassword;
    Drawable userAvater;
    List<Product> productCartList;

    public User(){
        this.productCartList = new ArrayList<>();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserAvater(Drawable userAvater) {
        this.userAvater = userAvater;
    }

    public Drawable getUserAvater() {
        return userAvater;
    }

    public List<Product> getProductCartList() {
        return productCartList;
    }

    public void addToProductList(Product p){
        this.productCartList.add(p);
    }
}
