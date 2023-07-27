import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * The VendingMachine class represents the vending machine created
 */
public class VendingMachine {
    private List<Slot> slots;
    private Denomination denomination;
    private List<String> itemNames;
    private List<Double> itemPrices;
    private List<Double> insertedAmounts;
    private List<Double> changeAmounts;
    private Map<Double, Integer> denominationsMap;
    private double totalValue = 0.0;
 

    /**
     * Constructor for VendingMachine class
     */
    public VendingMachine() {
        slots = new ArrayList<>();
        this.denomination = new Denomination();
        itemNames = new ArrayList<>();
        itemPrices = new ArrayList<>();
        insertedAmounts = new ArrayList<>();
        changeAmounts = new ArrayList<>();
        denominationsMap = new HashMap<>(); // Initialize denominationsMap

    }
       
    /**
     * Prints the main menu of the vending machine.
     */
    public void displayMainMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("╠═════════ SEOUL BITES VENDING MACHINE ════════╣");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║     ╓──────────────────────────────────╖     ║");
        System.out.println("║     ║            MAIN MENU             ║     ║");
        System.out.println("║     ╟──────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Create a Vending Machine  ║     ║");
        System.out.println("║     ║  ⦾ (2) Test a Vending Machine    ║     ║");
        System.out.println("║     ║  ⦾ (3) Exit                      ║     ║");
        System.out.println("║     ╙──────────────────────────────────╜     ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    /**
     * Prints the menu for creating a vending machine.
     */
    public void displayCreateVendingMachineMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("╠═════════ SEOUL BITES VENDING MACHINE ════════╣");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║     ╓──────────────────────────────────╖     ║");
        System.out.println("║     ║  CHOOSE TYPE OF VENDING MACHINE  ║     ║");
        System.out.println("║     ╟──────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Regular Vending Machine   ║     ║");
        System.out.println("║     ║  ⦾ (2) Special Vending Machine   ║     ║");
        System.out.println("║     ║  ⦾ (3) Back to Main Menu         ║     ║");
        System.out.println("║     ╙──────────────────────────────────╜     ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    /**
     * Prints the menu for testing a vending machine.
     */
    public void displayTestVendingMachineMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("╠═════════ SEOUL BITES VENDING MACHINE ════════╣");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║     ╓──────────────────────────────────╖     ║");
        System.out.println("║     ║      TEST A VENDING MACHINE      ║     ║");
        System.out.println("║     ╟──────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Test Vending Features     ║     ║");
        System.out.println("║     ║  ⦾ (2) Maintenance Features      ║     ║");
        System.out.println("║     ║  ⦾ (3) Back to Main Menu         ║     ║");
        System.out.println("║     ╙──────────────────────────────────╜     ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    /**
     * Prints the menu for testing vending machine features.
     */
    public void displayTestFeaturesVM() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("╠═════════ SEOUL BITES VENDING MACHINE ════════╣");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║     ╓──────────────────────────────────╖     ║");
        System.out.println("║     ║    TEST VENDING MACHINE FEATURES ║     ║");
        System.out.println("║     ╟──────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Start Test                ║     ║");
        System.out.println("║     ║  ⦾ (2) End Test                  ║     ║");
        System.out.println("║     ║  ⦾ (3) Exit VM Features Test     ║     ║");
        System.out.println("║     ╙──────────────────────────────────╜     ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

   /**
     * Displays the menu for payment
     */ 
    public void displayPaymentMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("╠═════════ SEOUL BITES VENDING MACHINE ════════╣");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║     ╓──────────────────────────────────╖     ║");
        System.out.println("║     ║       PLEASE INSERT MONEY        ║     ║");
        System.out.println("║     ╟──────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Insert Coins              ║     ║");
        System.out.println("║     ║  ⦾ (2) Insert Bills              ║     ║");
        System.out.println("║     ║  ⦾ (3) Finish Payment            ║     ║");
        System.out.println("║     ╙──────────────────────────────────╜     ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    /**
     * Displays the options for inserting coins
     */
     public void displayCoinsMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("╠═════════ SEOUL BITES VENDING MACHINE ════════╣");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║     ╓──────────────────────────────────╖     ║");
        System.out.println("║     ║       PLEASE INSERT MONEY        ║     ║");
        System.out.println("║     ╟──────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Insert ₱1 Coin            ║     ║");
        System.out.println("║     ║  ⦾ (2) Insert ₱5 Coin            ║     ║");
        System.out.println("║     ║  ⦾ (3) Insert ₱10 Coin           ║     ║");
        System.out.println("║     ║  ⦾ (4) Insert ₱20 Coin           ║     ║");
        System.out.println("║     ║  ⦾ (5) Go Back                   ║     ║");
        System.out.println("║     ╙──────────────────────────────────╜     ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    /**
     * Displays the options for inserting bills
     */
     public void displayBillMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("╠═════════ SEOUL BITES VENDING MACHINE ════════╣");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║     ╓──────────────────────────────────╖     ║");
        System.out.println("║     ║       PLEASE INSERT BILL         ║     ║");
        System.out.println("║     ╟──────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Insert ₱20 Bill           ║     ║");
        System.out.println("║     ║  ⦾ (2) Insert ₱50 Bill           ║     ║");
        System.out.println("║     ║  ⦾ (3) Insert ₱100 Bill          ║     ║");
        System.out.println("║     ║  ⦾ (4) Insert ₱200 Bill          ║     ║");
        System.out.println("║     ║  ⦾ (5) Insert ₱500 Bill          ║     ║");
        System.out.println("║     ║  ⦾ (6) Insert ₱1000 Bill         ║     ║");
        System.out.println("║     ║  ⦾ (7) Go Back                   ║     ║");
        System.out.println("║     ╙──────────────────────────────────╜     ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    /**
     * Prints the menu for maintenance features of the vending machine.
     */
    public void displayMaintenanceFeaturesMenu() {
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("╠═════════ SEOUL BITES VENDING MACHINE ═════════════════════╣");
        System.out.println("║ ◍                                                       ◍ ║");
        System.out.println("║     ╓───────────────────────────────────────────────╖     ║");
        System.out.println("║     ║             MAINTENANCE FEATURES              ║     ║");
        System.out.println("║     ╟───────────────────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Restock Items                          ║     ║");
        System.out.println("║     ║  ⦾ (2) Change Item Price                      ║     ║");
        System.out.println("║     ║  ⦾ (3) Collect Money from Machine             ║     ║");
        System.out.println("║     ║  ⦾ (4) Replenish Money                        ║     ║");
        System.out.println("║     ║  ⦾ (5) Print List of Transactions             ║     ║");
        System.out.println("║     ║  ⦾ (6) List Quantity of Items Sold            ║     ║");
        System.out.println("║     ║  ⦾ (7) Display Starting Inventory             ║     ║");
        System.out.println("║     ║  ⦾ (8) Display Last Inventory                 ║     ║");
        System.out.println("║     ║  ⦾ (9) Exit Maintenance Features              ║     ║");
        System.out.println("║     ╙───────────────────────────────────────────────╜     ║");
        System.out.println("║ ◍                                                       ◍ ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
    }
    /**
     * Displays the menu for payment
     */ 
    public void displaySlotMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("╠═════════ SEOUL BITES VENDING MACHINE ════════╣");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("║     ╓──────────────────────────────────╖     ║");
        System.out.println("║     ║    WHAT WOULD YOU LIKE TO DO?    ║     ║");
        System.out.println("║     ╟──────────────────────────────────╢     ║");
        System.out.println("║     ║  ⦾ (1) Add Slot                  ║     ║");
        System.out.println("║     ║  ⦾ (2) Edit Slot                 ║     ║");
        System.out.println("║     ║  ⦾ (3) Go back                   ║     ║");
        System.out.println("║     ╙──────────────────────────────────╜     ║");
        System.out.println("║ ◍                                          ◍ ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }
    /*
     *  Displays all products in regular vending machine
    */
    public void displayRVMProducts() {
        System.out.println("\n┏━━━━━━━━━━━━━━━━━━━━━━━━ SEOUL BITES PRODUCTS ━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ %-5s ┃ %-30s ┃ %-9s ┃ %-8s ┃ %-8s ┃\n", "Slot", "Item Name", "Price", "Quantity", "Calories");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    
        for (Slot slot : slots) {            
            int slotNumber = slot.getSlotNumber();
            if (isSlotEmpty(slotNumber)) {
                // If the slot is empty, display it with empty values
                System.out.printf("┃ %-5d ┃ %-30s ┃ %-9s ┃ %-8s ┃ %-8s ┃\n", slotNumber, "Empty Slot", "-", "-", "-");
            } else {
                ArrayList<Item> items = slot.getItems();
                for (Item item : items) {
                    System.out.printf("┃ %-5d ┃ %-30s ┃ ₱%-8.2f ┃ %-8d ┃ %-8d ┃\n",
                            slotNumber, item.getItemName(), item.getItemPrice(),
                            item.getItemQuantity(), item.getItemCalories());
                }
            }
        }
    
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }
    


    /**
     * Performs the purchase of an item from the selected slot in the vending machine.
     * Dispenses the item and provides change if necessary.
     *
     * @param selectedSlot The slot number of the item to be purchased.
     * @param insertedAmount
     * @param changeAmount
     */
    public void purchaseItem(int selectedSlot, double insertedAmount, double changeAmount) {
        // Check if the selected slot is within a valid range
        if (selectedSlot < 1 || selectedSlot > slots.size()) {
            System.out.println("Invalid slot number. Please choose a valid slot.");
            return;
        }
        
        // Get the selected slot from the list of slots
        Slot slot = slots.get(selectedSlot - 1);

        // Check if the selected slot is empty
        if (slot.isSlotEmpty()) {
            System.out.println("Selected slot is empty. Please choose another slot.");
            return;
        }

        // Get the item from the selected slot
        Item item = slot.getItem();

        // Check if the item is out of stock
        if (item.getItemQuantity() == 0) {
            System.out.println("Selected item is out of stock. Please choose another item.");
            return;
        }

        // Get the price of the item
        double itemPrice = item.getItemPrice();

        // Check if the inserted amount is sufficient to purchase the item
        if (insertedAmount < itemPrice) {
            System.out.println("Insufficient funds. Please insert more money.");
            return;
        }

        if (insertedAmount > itemPrice) {
            double remainingChange = insertedAmount - itemPrice;
            System.out.println("\nThank you for your purchase. Your change: ₱" + changeAmount);
           
            // Check if there are sufficient funds to dispense change
            if (remainingChange <= totalValue) {
                // Dispense the change using denominations
                denomination.dispenseChange(remainingChange);
                // Deduct the change amount from the totalValue
                denomination.deductAmount(remainingChange);
            } else {
                System.out.println("Sorry, the vending machine doesn't have enough change. Please use exact payment.");
                return;
            }
        
            changeAmount = remainingChange;

        } else {
            System.out.println("Thank you for your purchase.");
        }

        // Decrease the quantity of the purchased item
        item.deductQuantity(1);

        // Subtract the price of the item from the inserted amount
        denomination.subtractAmount(itemPrice);
        
        // Update the currentFunds after the purchase (add the itemPrice)
        totalValue += itemPrice;

        // Dispense the item
        System.out.println("\nDispensing item: " + item.getItemName());

        addTransactionEntry(item.getItemName(), itemPrice, insertedAmount, changeAmount);
    }

    public void slotMenu() {
        Scanner scanner = new Scanner(System.in);

        displaySlotMenu();
        System.out.print("\nEnter your choice: ");
        int slotChoice = scanner.nextInt();

        switch(slotChoice){
            case 1: // add item 
                addItemToSlot();
                break;

            case 2: // edit item 
                restockSlot();
                break;

            case 3:
                return;
            
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    /**
      * Prompts the user to add an item to a slot.
      */
      public void addItemToSlot() {
        // slots.clear();
        Scanner scanner = new Scanner(System.in);
    
        displayRVMProducts();
        System.out.print("\nEnter the slot number: ");
        int slotNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after reading the slot number
    
        // Find the slot with the specified slot number
        Slot foundSlot = null;
        for (Slot slot : slots) {
            if (slotNumber == slot.getSlotNumber()) {
                foundSlot = slot;
                break;
            }
        }
    
        if (foundSlot != null) {
            ArrayList<Item> items = foundSlot.getItems();
    
            // Prompt user for the item name
            System.out.print("\nEnter the item name: ");
            String itemName = scanner.nextLine();
    
            // Prompt user for the price
            System.out.print("Enter the price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
    
            // Initialize the quantity to 0
            int itemQuantity = 0;
    
            // Prompt user to add at least 10 items
            while (itemQuantity < 10) {
                System.out.print("Enter the quantity (minimum 10): ");
                itemQuantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
    
                if (itemQuantity < 10) {
                    System.out.println("Error: Minimum quantity should be 10.");
                }
            }
    
            // Prompt user for the calories
            System.out.print("Enter the calories: ");
            int itemCalories = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
    
            Item item = new Item(itemName, price, itemQuantity, itemCalories);
            item.setInitialQuantity(itemQuantity); // Set the initial quantity
            items.add(item);
            foundSlot.setItemCount(item.getItemQuantity());

            System.out.println("\n" + itemName + " has been added to slot " + slotNumber);
            displayRVMProducts();
    
            // Ask if the user wants to add another item
            System.out.print("\nDo you want to add another item to this slot? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                addItemToSlot(); // Call the method again to add another item to the same slot
            } else {
                slotMenu(); // Return to the slotMenu if the user says "no"
            }
        } else {
            System.out.println("Slot number not found.");
        }
    } 

    public void restockSlot() {
        Scanner scanner = new Scanner(System.in);

        // Ask for the slot number
        System.out.print("Enter the slot number: ");
        int slotNumber = scanner.nextInt();

        // Find the slot with the specified slot number
        Slot foundSlot = null;
        for (Slot slot : slots) {
            if (slotNumber == slot.getSlotNumber()) {
                foundSlot = slot;
                break;
            }
        }

        if (foundSlot != null) {
            ArrayList<Item> items = foundSlot.getItems();

            // Display the item names and quantities
            for (Item item : items) {
                System.out.println("Item name: " + item.getItemName());
                System.out.println("Current quantity: " + item.getItemQuantity());

                // Ask for the new quantity
                System.out.print("Enter the new quantity: ");
                int newQuantity = scanner.nextInt();

                // Update the item's quantity
                item.setItemQuantity(newQuantity);

                System.out.println(item.getItemName() + " quantity has been updated to " + item.getItemQuantity());
            }
        } 
        else {
            System.out.println("Slot number not found.");
        }
    }

    /**
     * Sets the new price of an item in a slot
     */
    public void setItemPrice() {
        Scanner scanner = new Scanner(System.in);

        // Ask for the slot number
        System.out.print("Enter the slot number: ");
        int inputSlotNumber = scanner.nextInt();

        Slot foundSlot = null;
        for (Slot slot : slots) {
            if (inputSlotNumber == slot.getSlotNumber()) {
                foundSlot = slot;
                break;
            }
        }

        if (foundSlot != null) {
            ArrayList<Item> items = foundSlot.getItems();

            // Display the item names
            for (Item item : items) {
                System.out.println("Item name: " + item.getItemName());

                // Ask for the new price
                System.out.print("Enter the new price: ");
                double newPrice = scanner.nextDouble();

                // Update the item's price
                item.setItemPrice(newPrice);

                System.out.println(item.getItemName() + " has now been updated to ₱" + item.getItemPrice());
            }
        } else {
            System.out.println("Slot number not found.");
        }
    }

    /**
     * Collects money from the vending machine and resets the total value to zero.
     */
    public void collectMoney() {
        double collectedAmount = totalValue;
        System.out.println("Collecting money from the vending machine: ₱" + collectedAmount);
    
        // Reset the currentFunds to 0
        totalValue = 0.0;
    }
    
    /**
     * Replenishes money in the vending machine
     */
    public void replenishMoney() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Replenish Money");
        System.out.println("━━━━━━━━━━━━━━━━");
    
        // Prompt the user to enter the number of ₱1 coins to add
        System.out.print("Enter the number of ₱1 coins to add: ");
        int add1Coin = scanner.nextInt();
        denominationsMap.put(1.0, denominationsMap.getOrDefault(1.0, 0) + add1Coin);
        totalValue += add1Coin * 1.0;
    
        // Prompt the user to enter the number of ₱5 coins to add
        System.out.print("Enter the number of ₱5 coins to add: ");
        int add5Coin = scanner.nextInt();
        denominationsMap.put(5.0, denominationsMap.getOrDefault(5.0, 0) + add5Coin);
        totalValue += add5Coin * 5.0;
    
        // Prompt the user to enter the number of ₱10 coins to add
        System.out.print("Enter the number of ₱10 coins to add: ");
        int add10Coin = scanner.nextInt();
        denominationsMap.put(10.0, denominationsMap.getOrDefault(10.0, 0) + add10Coin);
        totalValue += add10Coin * 10.0;
    
        // Prompt the user to enter the number of ₱20 coins to add
        System.out.print("Enter the number of ₱20 coins to add: ");
        int add20Coin = scanner.nextInt();
        denominationsMap.put(20.0, denominationsMap.getOrDefault(20.0, 0) + add20Coin);
        totalValue += add20Coin * 20.0;
    
        // Prompt the user to enter the number of ₱20 bills to add
        System.out.print("Enter the number of ₱20 bills to add: ");
        int add20Bill = scanner.nextInt();
        denominationsMap.put(200.0, denominationsMap.getOrDefault(200.0, 0) + add20Bill);
        totalValue += add20Bill * 200.0;
    
        // Prompt the user to enter the number of ₱50 bills to add
        System.out.print("Enter the number of ₱50 bills to add: ");
        int add50Bill = scanner.nextInt();
        denominationsMap.put(50.0, denominationsMap.getOrDefault(50.0, 0) + add50Bill);
        totalValue += add50Bill * 50.0;
    
        // Prompt the user to enter the number of ₱100 bills to add
        System.out.print("Enter the number of ₱100 bills to add: ");
        int add100Bill = scanner.nextInt();
        denominationsMap.put(100.0, denominationsMap.getOrDefault(100.0, 0) + add100Bill);
        totalValue += add100Bill * 100.0;
    
        // Prompt the user to enter the number of ₱200 bills to add
        System.out.print("Enter the number of ₱200 bills to add: ");
        int add200Bill = scanner.nextInt();
        denominationsMap.put(200.0, denominationsMap.getOrDefault(200.0, 0) + add200Bill);
        totalValue += add200Bill * 200.0;
    
        // Prompt the user to enter the number of ₱500 bills to add
        System.out.print("Enter the number of ₱500 bills to add: ");
        int add500Bill = scanner.nextInt();
        denominationsMap.put(500.0, denominationsMap.getOrDefault(500.0, 0) + add500Bill);
        totalValue += add500Bill * 500.0;
    
        // Prompt the user to enter the number of ₱1000 bills to add
        System.out.print("Enter the number of ₱1000 bills to add: ");
        int add1000Bill = scanner.nextInt();
        denominationsMap.put(1000.0, denominationsMap.getOrDefault(1000.0, 0) + add1000Bill);
        totalValue += add1000Bill * 1000.0;
    
        System.out.println("\nMoney replenished successfully!");
        displayDenominations();
    }
    
    public void displayDenominations() {
        System.out.println("\n┏━━━━━━━━━━ REPLENISHED MONEY ━━━━━┓");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("  1 Coin: ₱" + denominationsMap.getOrDefault(1.0, 0) * 1.0);
        System.out.println("  5 Coin: ₱" + denominationsMap.getOrDefault(5.0, 0) * 5.0);
        System.out.println("  10 Coin: ₱" + denominationsMap.getOrDefault(10.0, 0) * 10.0);
        System.out.println("  20 Coin: ₱" + denominationsMap.getOrDefault(20.0, 0) * 20.0);
        System.out.println("  20 Bill: ₱" + denominationsMap.getOrDefault(200.0, 0) * 200.0);
        System.out.println("  50 Bill: ₱" + denominationsMap.getOrDefault(50.0, 0) * 50.0);
        System.out.println("  100 Bill: ₱" + denominationsMap.getOrDefault(100.0, 0) * 100.0);
        System.out.println("  200 Bill: ₱" + denominationsMap.getOrDefault(200.0, 0) * 200.0);
        System.out.println("  500 Bill: ₱" + denominationsMap.getOrDefault(500.0, 0) * 500.0);
        System.out.println("  1000 Bill: ₱" + denominationsMap.getOrDefault(1000.0, 0) * 1000.0);
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }

    public void addTransactionEntry(String itemName, double itemPrice, double insertedAmount, double changeAmount) {
        itemNames.add(itemName);
        itemPrices.add(itemPrice);
        insertedAmounts.add(insertedAmount);
        changeAmounts.add(changeAmount);
    }

    public void displayTransactions() {
        System.out.println("Transactions:");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Item Name\t\tPrice\t\tMoney Inserted\t\tChange Dispensed");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < itemNames.size(); i++) {
            System.out.printf("%-20s\t%.2f\t\t%.2f\t\t\t%.2f%n", itemNames.get(i), itemPrices.get(i), insertedAmounts.get(i), changeAmounts.get(i));
        }

        System.out.println("------------------------------------------------------------------------------------");
    }

    public void displayItemsSold() {
        System.out.println("*----------------------------------------------------------------------*");       
        System.out.println("|                       ITEMS SOLD SUMMARY                             |");
        System.out.println("*----------------------------------------------------------------------*");
        System.out.println("Item Name\t\tQuantity Sold\t\tTotal Amount");
        System.out.println("------------------------------------------------------------------------");
    
        boolean noItemsSold = true; // A flag to track if no items are sold
    
        for (Slot slot : slots) {
            ArrayList<Item> items = slot.getItems();
            
            for (Item item : items) {
                String itemName = item.getItemName();
                int quantitySold = getQuantitySold(itemName);
                double totalAmount = getTotalAmount(itemName);
    
                if (quantitySold > 0) {
                    System.out.printf("%-20s\t%d\t\t\t%.2f%n", itemName, quantitySold, totalAmount);
                    noItemsSold = false; // There's at least one item sold
                }
            }
        }
    
        if (noItemsSold) {
            System.out.println("No items sold yet.");
        }
    
        System.out.println("------------------------------------------------------------------------");
    }
    public void displayCurrentFunds() {
        System.out.println("\nCurrent Funds: ₱" + totalValue);
    }

    private int getQuantitySold(String itemName) {
        int quantitySold = 0;

        for (String name : itemNames) {
            if (name.equals(itemName)) {
                quantitySold++;
            }
        }

        return quantitySold;
    }

    private double getTotalAmount(String itemName) {
        double totalAmount = 0.0;

        for (int i = 0; i < itemNames.size(); i++) {
            if (itemNames.get(i).equals(itemName)) {
                totalAmount += itemPrices.get(i);
            }
        }

        return totalAmount;
    }

    // Add this method to the RegularVendingMachine class
    public boolean isSlotEmpty(int slotNumber) {
        for (Slot slot : slots) {
            if (slot.getSlotNumber() == slotNumber) {
                return slot.isSlotEmpty();
            }
        }
        return true; // Return true if the slot number is not found
    }

    public void displayStartInventory() {
        System.out.println("\nStart Inventory in Vending Machine:");
        System.out.println("Slot | Item Name                   | Price    | Start Quantity");
        System.out.println("---------------------------------------------------------");
        for (Slot slot : slots) {
            ArrayList<Item> items = slot.getItems();
            for (Item item : items) {
                System.out.printf("%-4d | %-26s | ₱%-7.2f | %-14d%n",
                        slot.getSlotNumber(), item.getItemName(), item.getItemPrice(), item.getInitialQuantity());
            }
        }
    }

    public void displayLastInventory() {
        System.out.println("\nLast Inventory in Vending Machine:");
        System.out.println("Slot | Item Name                   | Price    | Last Quantity");
        System.out.println("---------------------------------------------------------");
        for (Slot slot : slots) {
            ArrayList<Item> items = slot.getItems();
            for (Item item : items) {
                System.out.printf("%-4d | %-26s | ₱%-7.2f | %-14d%n",
                        slot.getSlotNumber(), item.getItemName(), item.getItemPrice(), item.getItemQuantity());
            }
        }
    }



    /**
     * Creates a vending machine based on user choice.
     */
    public void createVendingMachine() {
        displayCreateVendingMachineMenu();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your choice: ");
        int vendingMachineType = scanner.nextInt();

        switch(vendingMachineType){
            case 1: createRegularVendingMachine();  break;
            case 2: // createSpecialVendingMachine();   break;
            case 3: break;
            default: System.out.println("Invalid choice.");  break;
        }
    }

    /**
     * Creates a regular vending machine based on user choice.
    */
    public void createRegularVendingMachine() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of slots
        System.out.print("\nEnter the number of slots (minimum 8): ");
        int numSlots = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Validate the number of slots
        if (numSlots < 8) {
            System.out.println("Error: Minimum number of slots should be 8.");
            return; // Exit the method if the number of slots is invalid
        }

        for (int i = 1; i <= numSlots; i++) {
            Slot slot = new Slot(i, numSlots);
            slots.add(slot);
        }
        System.out.println("\n ... Regular Vending Machine created successfully! ...");
    }

    /**
     * Performs testing operations on the vending machine based on user choice.
     */
    public void testVendingMachine() {
        Scanner scanner = new Scanner(System.in);

        displayTestVendingMachineMenu();
        System.out.print("\nEnter your choice: ");
        int featureType = scanner.nextInt();

        if (featureType == 1) {
            // Display current items and price
            // Display insert money
            displayTestFeaturesVM();
            System.out.print("\nEnter your choice: ");
            int vendingMachineFeatures = scanner.nextInt();
            
            boolean exitLoop = false;
            
            switch (vendingMachineFeatures) {
                case 1: // start test 
                    displayRVMProducts();

                    displayCurrentFunds();

                    boolean paymentFinished = false;

                    while (!exitLoop) {
                        if (!paymentFinished) {
                            displayPaymentMenu();
                            System.out.print("\nEnter your choice: ");
                            int choicePayment = scanner.nextInt();

                            switch (choicePayment) {
                                case 1:
                                    displayCoinsMenu();
                                    while (true) {
                                        System.out.print("\nEnter your choice: ");
                                        int choiceCoin = scanner.nextInt();
                                        switch (choiceCoin) {
                                            case 1: denomination.insertCoin1(); break;
                                            case 2: denomination.insertCoin5(); break;
                                            case 3: denomination.insertCoin10(); break;
                                            case 4: denomination.insertCoin20(); break;
                                            case 5: System.out.println("Going back to the vending machine..."); break;
                                            default: System.out.println("Invalid choice. Please try again."); break;
                                        }

                                        if (choiceCoin == 5) {
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    displayBillMenu();
                                    while (true) {
                                        System.out.print("\nEnter your choice: ");
                                        int choiceBill = scanner.nextInt();
                                        switch (choiceBill) {
                                            case 1: denomination.insertBill20(); break;
                                            case 2: denomination.insertBill50(); break;
                                            case 3: denomination.insertBill100(); break;
                                            case 4: denomination.insertBill200(); break;
                                            case 5: denomination.insertBill500(); break;
                                            case 6: denomination.insertBill1000(); break;
                                            case 7: System.out.println("Going back to the vending machine..."); break;
                                            default: System.out.println("Invalid choice. Please try again."); break;
                                        }

                                        if (choiceBill == 7) {
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    paymentFinished = true;
                                    System.out.println("\nInserting money...");
                                    break;
                                default:
                                    System.out.println("\nInvalid choice. Please try again.");
                                    break;
                            }
                            if (paymentFinished) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }

                    if (paymentFinished) {
                        System.out.print("\nEnter the slot number: ");
                        int selectedSlot = scanner.nextInt();
                        double insertedAmount = denomination.getTotalValue();
                        double changeAmount = insertedAmount - slots.get(selectedSlot - 1).getItem().getItemPrice();
                        // Purchase the item from the selected slot
                        purchaseItem(selectedSlot, insertedAmount, changeAmount);
                    }

                    break;
                case 2: // end test
                    System.out.println("Ending the test.");
                    break;
                case 3: // return to main menu
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            if (exitLoop) {
                return;
            }

        } else if (featureType == 2) {
            displayMaintenanceFeaturesMenu();
            
            System.out.print("\nEnter your choice: ");
            int vendingMachineMaintenance = scanner.nextInt();
            
            // Implement maintenance features
            switch (vendingMachineMaintenance) {
                case 1: // restock items
                    displayRVMProducts();
                    slotMenu();
                    break;
                case 2: // change price for each item type
                    displayRVMProducts();
                    setItemPrice();
                    break;
                case 3: // collect money from machine
                    collectMoney();
                    break;
                case 4: // replenish money
                   replenishMoney();
                    break;
                case 5: // print list of transactions
                    displayTransactions();
                    break;
                case 6: // list quantity of items sold
                    displayItemsSold();
                    break;
                case 7: // display starting inventory
                    displayStartInventory();
                    break; 
                case 8: // display last inventory
                    displayLastInventory();
                    return;
                case 9: // Return to main menu
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}