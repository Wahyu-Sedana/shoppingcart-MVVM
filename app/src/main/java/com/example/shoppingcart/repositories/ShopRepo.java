package com.example.shoppingcart.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.shoppingcart.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "iMac 21", 1299, true, "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fimac21.jpeg?alt=media&token=e1cf1537-ab30-44a3-91f1-4d6284e79540" ));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Air", 999, true, "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fmacbookair.jpeg?alt=media&token=aae96a4a-e86a-4a15-825a-3da9851330c8"));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Pro 13", 1299, true, "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fmbp13touch.jpeg?alt=media&token=88c2bf8e-e72d-4243-a9ab-4cc32e3aff18"));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Pro 16", 2399, true, "https://firebasestorage.googleapis.com/v0/b/notes-16738.appspot.com/o/products%2Fmbp16touch.jpeg?alt=media&token=24498b7f-09b8-42ea-9edb-1bad649902d4"));
        productList.add(new Product(UUID.randomUUID().toString(), "Pavillion", 2300, true, "https://tse4.mm.bing.net/th?id=OIP.bBzonB87VjuzRG0cgnKdTwHaEw&pid=Api&P=0&w=254&h=164"));
        productList.add(new Product(UUID.randomUUID().toString(), "Dell", 512, true,  "https://tse4.mm.bing.net/th?id=OIP.zTMB0x1AsExSMlu5sLQLqAHaED&pid=Api&P=0&w=319&h=175"));
        productList.add(new Product(UUID.randomUUID().toString(), "Lenovo", 122, true, "https://i1.wp.com/3.bp.blogspot.com/-yhH0MHhZS9w/V_e5tmhnhaI/AAAAAAAAHT0/KMrFlsNIuZEH_ZC0wI3ydPboZdc1ZW75ACLcB/s1600/Laptop%2Bjenis%2Bmainstream.png?ssl=1"));
        productList.add(new Product(UUID.randomUUID().toString(), "Asus", 111, true, "https://1.bp.blogspot.com/-66qbNYPndJM/XTKkn4bRI1I/AAAAAAAASzc/0FGE5_2srnInFSqYNrUuwctKPU6Xq7w7QCLcBGAs/s1600/Harga%2Bdan%2BSpesifikasi%2BAsus%2BA509FJ%2BEK501T%2BLaptophia.JPG"));
        productList.add(new Product(UUID.randomUUID().toString(), "LG" ,322, true, "https://tse3.mm.bing.net/th?id=OIP.WUPiZk7JFmqp6nhMTg78YAHaHa&pid=Api&P=0&w=300&h=300"));
        productList.add(new Product(UUID.randomUUID().toString(), "HP", 121, true, "https://tse3.mm.bing.net/th?id=OIP.enkJRLcALTMxAUFniRnoTwHaHa&pid=Api&P=0&w=300&h=300"));
        mutableProductList.setValue(productList);
    }
}
