package AdsApp;

import AdsApp.Ad;

import java.util.List;
import java.util.ArrayList;

public class ListAds implements AdsApp.Ads {
    private ArrayList<Ad> Ads = new ArrayList<Ad>();


    public ListAds() {
        insert(new Ad("Washer", "Works terribly", 500, "San Antonio"));
        insert(new Ad("Dryer", "Works Great", 425, "Atlanta"));
        insert(new Ad("Truck", "Works OK", 6500, "El Paso"));
    }


    public void insert(Ad Ad) {
        this.Ads.add(Ad);
    }

    public List<Ad> all() {
        return this.Ads;
    }




}


