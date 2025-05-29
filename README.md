# DELI-cious 🥪
A Java-based Point of Sale (POS) system designed for a custom sandwich shop. Customers can create custom sandwich orders, add drinks and chips, and checkout with a generated receipt. Ideal for small delis or sandwich shops looking for a simple and extendable CLI ordering system.

## 📌 Features
### ✅ Custom Sandwich Builder

- Choose bread type, sandwich size, toasted or not

- Add meats, cheeses, regular and extra toppings, and sauces

### ✅ Drink and Chips Ordering

- Select drink flavors and sizes

- Add chip types (e.g., BBQ, Sour Cream, Plain)

### ✅ Order Management

- Add multiple sandwiches, drinks, and chips to an order

- View current order details at any time

- Checkout with receipt saved to a timestamped text file

- Cancel orders anytime

### 💻 How It Works
- Start at the Home Screen with options to create a new order or exit

- Build sandwich step-by-step with interactive menus

- Add drinks and chips with simple prompts

- View and edit your order before checkout

- Save a detailed receipt to disk with timestamp

🧱 Project Structure
```
src/main/java/com/pluralsight/
├── DeliciousApp.java           # Main entry point
├── ReceiptWriter.java          # Handles receipt printing and saving
├── models/
│   ├── Order.java              # Order containing sandwiches, drinks, chips
│   ├── Sandwich.java
│   ├── Topping.java
│   ├── Drink.java
│   └── Chips.java
└── ui/
    ├── HomeScreen.java         # Main menu UI
    └── OrderScreen.java        # Order building and management UI
```
📸 Screenshots

Home Screen menu

<img width="154" alt="image" src="https://github.com/user-attachments/assets/9e35d843-5765-4e57-b7b4-d969c26c6fdd" />


Sandwich builder screen

<img width="181" alt="image" src="https://github.com/user-attachments/assets/b4ef7f89-9517-4ba6-99e2-2c339d233c2e" />


Drink and chips selection

<img width="184" alt="image" src="https://github.com/user-attachments/assets/ce678a56-e0cf-40f5-a575-f1e372fa7045" />


Receipt output in console

<img width="325" alt="image" src="https://github.com/user-attachments/assets/e82e065c-02a9-49f9-8d7e-a23394df07c8" />


Receipt text file saved to src/main/resources/receipts/

🛠️ Technologies Used
Java (JDK 17+)

Object-Oriented Programming (Classes, Encapsulation)

Console-based User Interface (Scanner input)

File I/O for receipt saving with BufferedWriter

Modular design with separate UI and Model packages

🚀 Getting Started
Clone the Repository
```
git clone https://github.com/your-username/deli-cious.git
cd deli-cious
```
Open in IntelliJ or your preferred IDE

Make sure the directory src/main/resources/receipts/ exists or is created automatically on first run.

Run the Main Class
Run DeliciousApp.main() to start the console application.

Follow on-screen prompts to create orders and checkout.

📦 Output Files Created

- Each checkout saves a receipt file at:
src/main/resources/receipts/receipt-yyyyMMdd-HHmmss.txt

🙋‍♀️ Author
Eden Mengistu 
Java Developer & Software Enthusiast
05/29/2025
