package AdsApp;

import AdsApp.Ads;
import AdsApp.ListAds;

public class DaoFactory {
//    private static Products productsDao;
//
//    public static Products getProductsDao() {
//        if (productsDao == null) {
//            productsDao = new ListProducts();
//        } // make new DAO if one not found
//        return productsDao; // return DAO found or the one that was created on line 6
//    }


    private static Ads AdsDao;

    public static Ads getAdsDao(){
        if(AdsDao == null){
            AdsDao = new ListAds();
        }
        return AdsDao;
    }
}