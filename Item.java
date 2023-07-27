/**
 * The Item class represents an item with a name, price, quantity, and calorie count.
 * It provides methods to access and modify these attributes of the item.
 */
public class Item {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private int itemCalories; 
    private int initialQuantity;

    /**
     * Constructs an Item object with the specified parameters
     *
     * @param itemName     the name of the item
     * @param itemPrice    the price of the item
     * @param itemQuantity the quantity of the item
     * @param itemCalories the calorie count of the item
     * 
     */
    public Item(String itemName, double itemPrice, int itemQuantity, int itemCalories) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemCalories = itemCalories;
   }

    /**
     * Returns the name of the item
     *
     * @return the name of the item
     * 
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the name of the item
     *
     * @param itemName the new name of the item
     * 
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * Returns the price of the item
     *
     * @return the price of the item
     * 
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the price of the item
     *
     * @param itemPrice the new price of the item
     * 
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * Returns the quantity of the item
     *
     * @return the quantity of the item
     * 
     */
    public int getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the quantity of the item
     *
     * @param itemQuantity the new quantity of the item
     * 
     */
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    /**
     * Returns the calorie count of the item
     *
     * @return the calorie count of the item
     * 
     */
    public int getItemCalories() {
        return itemCalories;
    }

    /**
     * Sets the calorie count of the item
     *
     * @param itemCalories the new calorie count of the item
     * 
     */
    public void setItemCalories(int itemCalories) {
        this.itemCalories = itemCalories;
    }

    /**
     * Deducts the specified quantity from the item's quantity
     *
     * @param quantity the quantity to deduct
     */
    public void deductQuantity(int quantity) {
        itemQuantity -= quantity;
    }

    /**
     * Get the quantity of the item purchased.
     *
     * @return The quantity of the item purchased (always 1 in this case).
     */
    public int getAmount() {
        return 1;
    }

    public int getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(int initialQuantity) {
        this.initialQuantity = initialQuantity;
    }
}
