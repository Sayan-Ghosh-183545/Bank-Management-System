# Bank Management System

A console-based banking application built with Java and MySQL that provides secure account management functionality with automated PIN-based authentication.

## 🚀 Features

- **Account Creation**: New user registration with 6-digit PIN validation
- **Secure Authentication**: PIN-based login system for existing users
- **Account Management**: Complete CRUD operations for banking accounts
- **Database Integration**: MySQL database connectivity using JDBC
- **User-Friendly Interface**: Interactive console-based menu system
- **Balance Management**: Initial deposit options during account creation

## 🛠️ Technologies Used

- **Programming Language**: Java
- **Database**: MySQL
- **Connectivity**: JDBC (Java Database Connectivity)
- **IDE**: IntelliJ IDEA / Visual Studio Code

## 📋 Prerequisites

Before running this application, ensure you have:

- Java JDK 8 or higher installed
- MySQL Server installed and running
- MySQL JDBC driver added to classpath
- MySQL database named `sayandb` created

## 🗄️ Database Setup

1. Create a MySQL database:
```sql
CREATE DATABASE sayandb;
```

2. Create the required table:
```sql
USE sayandb;
CREATE TABLE bms (
    pin INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    balance INT DEFAULT 0
);
```

## 🚀 Installation & Setup

1. **Clone the repository**:
```bash
git clone https://github.com/Sayan-Ghosh-183545/bank-management-system.git
cd bank-management-system
```

2. **Update database credentials** in the connection string:
```java
// Update in ExistingUser.java and NewUser.java
Connection connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/sayandb",
    "your_username", 
    "your_password"
);
```

3. **Compile and run**:
```bash
javac -cp ".:mysql-connector-java.jar" *.java
java -cp ".:mysql-connector-java.jar" Main
```

## 💻 Usage

### Main Menu Options:
- **0**: Create new user account
- **1**: Access existing user account
- **2**: Exit application

### New User Registration:
1. Enter a unique 6-digit PIN
2. Provide your name
3. Choose to make an initial deposit (optional)
4. Account created successfully!

### Existing User Login:
1. Enter your registered PIN
2. Access account management features (under development)

## 📁 Project Structure

```
src/
├── Main.java           # Application entry point and main menu
├── NewUser.java        # New user registration functionality
├── ExistingUser.java   # Existing user login and operations
└── Methods.java        # Utility methods (PIN validation)
```

## 🔮 Future Enhancements

- [ ] Complete implementation of withdrawal, deposit, and balance check features
- [ ] Account deletion functionality
- [ ] Transaction history tracking
- [ ] Enhanced security with password hashing
- [ ] Input validation and error handling improvements
- [ ] GUI implementation using Swing/JavaFX
- [ ] Multi-threading support for concurrent users

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

## 👤 Author

**Sayan Ghosh**
- GitHub: [@Sayan-Ghosh-183545](https://github.com/Sayan-Ghosh-183545)
- LinkedIn: [sayan-ghosh-](https://www.linkedin.com/in/sayan-ghosh-/)
- Email: sayanghosh183545@gmail.com

## ⚠️ Note

This is a learning project and not intended for production use. For real-world banking applications, additional security measures, encryption, and compliance with banking regulations would be required.

---

⭐ **If you found this project helpful, please give it a star!**
