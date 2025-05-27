class BookSales {
    String sellerName;
    int numberOfSales;
    int sellerId;

    // Constructor
    BookSales(String sellerName, int numberOfSales, int sellerId) {
        this.sellerName = sellerName;
        this.numberOfSales = numberOfSales;
        this.sellerId = sellerId;
    }

    // Display method
    void display() {
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Seller ID: " + sellerId);
    }
}
