# 🏨 SuiteSphere - Hotel Booking System

**SuiteSphere** is a full-featured, modern and scalable hotel management and booking system designed to streamline the entire hotel reservation lifecycle. From room discovery and availability checks to user registration, booking, and secure payments — SuiteSphere automates it all. Built with **Spring Boot**, it features role-based access (admin & customer), seamless Stripe payment integration, and real-time email notifications to deliver a robust, production-ready hotel booking backend.

---

## ✅ Features

- 🔐 **User Authentication** (JWT-based login/register)
- 🛏️ **Room Management** (add, update, delete, search, list, availability check)
- 📆 **Booking System** (check-in/check-out, status tracking)
- 💳 **Stripe Payment Integration** (real-time payment intent, confirmation)
- 📧 **Email Notifications** (booking confirmation, payment status)
- 🧾 **Admin** and **Customer** roles with different privileges

---

## 📦 Project Structure

```
com.nikhil.suitesphere
├── config          # CORS, JWT, and other configuration classes
├── controllers     # REST controllers: Auth, Booking, Room, Payment, User
├── dtos            # Data Transfer Objects
├── entities        # JPA entities representing database tables
├── enums           # Enum classes (e.g., roles, payment/booking status)
├── exceptions      # Custom exceptions and handlers
├── payments        # Stripe integration and payment service
├── repositories    # Spring Data JPA repositories
├── security        # JWT filters, user details service, and security config
├── services        # Business logic layer
└── SuiteSphereApplication.java
```

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Security + JWT
- Spring Data JPA + MySQL
- Stripe API for payments
- JavaMailSender for email
- Lombok + ModelMapper

---

## 🚀 Getting Started

### 🔧 Prerequisites
- Java 17+
- Maven
- MySQL

### ⚙️ Setup

1. Clone the repo:
   ```bash
   git clone https://github.com/nikhilsingh2005/SuiteSphere.git
   cd SuiteSphere
   ```

2. Create MySQL database `hotel`:
   ```sql
   CREATE DATABASE hotel;
   ```

3. Update DB & email credentials in `application.properties`:
   ```properties
   spring.datasource.username=your_mysql_username
   spring.datasource.password=your_mysql_password

   spring.mail.username=your_email
   spring.mail.password=your_app_password
   stripe.api.secret.key=sk_test_...
   ```

4. Run the app:
   ```bash
   mvn spring-boot:run
   ```

---

## 🌐 API Endpoints (Samples)

- `POST /api/auth/register`
- `POST /api/auth/login`
- `GET /api/rooms/all`
- `POST /api/bookings`
- `POST /api/payments/create-payment-intent`
- `PUT /api/bookings/update`

---



## 👨‍💻 Author

**Nikhil Singh**  
GitHub: [@nikhilsingh2005](https://github.com/nikhilsingh2005)

---

## 📝 License

This project is for educational use. Feel free to extend and improve it.