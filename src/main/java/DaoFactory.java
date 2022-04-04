public class DaoFactory {
    private static Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProducts();
        } // make new DAO if one not found
        return productsDao; // return DAO found or the one that was created on line 6
    }
}