public class Item {
    /**
     *Third this class
     *
     * create public static final variables as below
     *
     * askName = "What is the name of the item you are looking for?"
     * askAmount = "How many of this item would you like?"
     * askPrice = "What is the price of this item?"
     */

    public static final String askName = "What is the name of the item you are looking for?";
    public static final String askAmount = "How many of this item would you like";
    public static final String askPrice = "What is the price of this item?";


    //Generate a 4 args constructor
    public Item(String name, int sku, int amount, double price) {
        this.name = name;
        this.sku = sku;
        this.amount = amount;
        this.price = price;
    }

    //Instance Variables
    public String name;
    public int sku;
    public int amount;
    public double price;


    /**
     * Create a method which will ask 3 questions, and it will generate 7 digits sku
     * after that it should create an Item object, and it should return it
     *
     * createItem()
     *
     * NOTE: Use ScannerHelper class over here
     * @return
     */

    public static Item createItem(){
       String name = ScannerHelper.getString(askName);
       int sku = MathHelper.getARandomNumber(1_000_000, 9_999_999);
       int amount = ScannerHelper.getInt(askAmount);
       double price = ScannerHelper.getDouble(askPrice) * amount; //Total item price (price*amount)

       return new Item(name, sku, amount, price);
    }

    // Create toString() method over here
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", sku=" + sku +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
