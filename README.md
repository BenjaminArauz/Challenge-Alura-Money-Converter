# 🌍💱 Money Converter 

This project was developed during the **Currency Converter Challenge** for **AluraLatam**. In that challenge, I consumed APIs and treated JSON data to have a practical, awesome experience when developing Java development applications.

## 🚀 Project Overview

The exciting application will be a currency converter that interacts with a real-time API to fetch the latest exchange rates. Data is in JSON format, and the project supports conversions between different currencies at super-high precision.

### Key Features:
- **Real-time currency conversion:** Get up-to-date exchange rates instantly.
- **User-friendly interface:** An interactive menu to guide you through the most common conversion options.
- **API integration:** Connects with the [Exchange Rate API][1] to ensure accurate data.
- **Gson Library:** Smooth JSON data manipulation for precise information.
- **Adaptable framework:** Easily extend the project to include more currencies or additional features.

## 🛠️ Technologies Used:
- **Java 17**: The main programming language.
- **HttpClient**: To handle HTTP requests.
- **Gson**: To parse JSON data.
- **Exchange Rate API**: Provides real-time exchange rates.

## 💻 Project Structure

### 1. **MoneyConverter.java**
This class represents the structure of the data coming back from this API. It contains the base currency and the associated exchange rates.

### 2. **MoneyApi.java**
This class mediates the interaction with the API. It sends HTTP requests and parses JSON responses. You can easily convert between various currencies using this class; it refreshes data in real time.

### 3. **Main.java**
This is the application's entry point, featuring an interactive menu where you can:
- Choose between different currency conversion options.
- Input the amount to be converted.
- View results instantly.

## 🌟 How to Run the Project
1. **Clone the repository:**

```bash
git clone https://github.com/BenjaminArauz/Challenge-Alura-Money-Converter.git moneyconverter
```

2. **Navigate to the project folder:**

```bash
cd moneyconverter
```
3. **Add your API key:** Get your free API key from [ExchangeRate-API][1] and place it in the ``Constants.java`` file.

4. **Run the project:** You can run the ``Main.java`` file directly from your IDE or through the command line:
```bash
javac Main.java
java Main
```
5. **Enjoy!** Follow the on-screen instructions to convert between currencies.

## 🎯 Available Currency Pairs
- USD to ARS (and vice versa)
- USD to BRL (and vice versa)
- USD to COP (and vice versa)

## 🌐 API Credits
This project uses the [ExchangeRate-API][1] for real-time currency conversion data. Special thanks to their team for providing this excellent service.

[1]: https://www.exchangerate-api.com "ExchangeRate-API"
