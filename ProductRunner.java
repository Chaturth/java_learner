class ProductRunner {

    public static void main(String[] args) {

        Product store = new Product();

        Product p1 = new Product(1, "Rice", "India Gate",
                26.0, 27.0, Type.Groceries, 1000.0, 25.0);

        store.addProduct(p1);
		store.getProductNameByProductId(1);
		store.getPriceByProductName("Rice");
		store.getProductNameByCompanyName("India Gate");
		
		store.getProductNameByCompanyName("basmathi");
		
		store.updateByCompanyName("India Gate","basmathi");
		
		store.updateByCompanyName("Gate","basmathi");
		
		store.deleteByProductName("Rice");
    }
}