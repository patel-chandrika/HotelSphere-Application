
# **Hotel Management Microservices Project**

Welcome to the **Hotel Management Microservices** project!  
This application is designed to manage various aspects of a hotel, including room bookings, adding hotels, and handling user ratings.  

## **Features**

### **User Service**
- User registration and authentication.  
- Users can book hotel rooms.  
- Cancel bookings.  
- Wallet system to track user transactions.  

### **Hotel Service**
- Add hotels with detailed information.  
- Add rooms to hotels.  
- Fetch hotel details by ID or name.  
- List all available or booked rooms in a hotel.  

### **Booking Service**
- Book rooms in hotels.  
- Fetch booking details by booking ID.  
- List all bookings.  

### **Rating Service**
- Add ratings and reviews for hotels.  
- Fetch all ratings.  
- Fetch ratings by user ID or hotel ID.  

### **Service Registry**
- Register and discover microservices.  

### **Configuration Server**
- Manage centralized configurations for microservices.  

### **API Gateway**
- Gateway for accessing all microservices.  

---

## **Tech Stack**

- **Programming Language:** Java  
- **Frameworks:** Spring Boot, Spring Cloud  
- **Tools:**  
  - Spring Cloud Eureka  
  - Spring Cloud Config  
  - Spring Security & OAuth 2.0  
  - Spring Data JPA, REST  
  - Spring Cloud Gateway  
  - Netflix Eureka  
  - MySQL  
- **Version Control:** Git  

---

## **Getting Started**

To get started, ensure you have the required tools and dependencies installed.  

### **Eureka Server**  
**Eureka Dashboard:** [http://localhost:8761](http://localhost:8761)  
View the status of all registered microservices, including their availability and instances.

### **Instances Registered with Eureka**  
| **Service**         | **Status** | **Instance URL**                         |  
|----------------------|------------|------------------------------------------|  
| **API Gateway**      | UP (1)     | `192.168.1.4:API-GATEWAY:8086`           |  
| **Config Server**    | UP (1)     | `192.168.1.4:CONFIG-SERVER:8085`         |  
| **Hotel Service**    | UP (1)     | `192.168.1.4:hotels-service:8082`        |  
| **Rating Service**   | UP (1)     | `192.168.1.4:rating-service:8083`        |  
| **User Service**     | UP (1)     | `192.168.1.4:users-service:8081`         |  

### **Default URLs**
- **API Gateway Default URL:** [http://localhost:8086](http://localhost:8086)  

---

## **Routes**

### **User Service**
| **Feature**                     | **Endpoint**                                                                                   |  
|----------------------------------|-----------------------------------------------------------------------------------------------|  
| User Login                      | [http://localhost:8086/auth/login](http://localhost:8086/auth/login)                           |  
| Fetch All Users                 | [http://localhost:8086/users/all](http://localhost:8086/users/all)                             |  
| User Registration               | [http://localhost:8086/users/register](http://localhost:8086/users/register)                   |  
| Book a Hotel Room               | [http://localhost:8086/users/addBooking](http://localhost:8086/users/addBooking)               |  
| Complete a Booking              | [http://localhost:8086/users/completeBooking/{bookingId}](http://localhost:8086/users/completeBooking/{bookingId}) |  
| Cancel a Booking                | [http://localhost:8086/users/cancelBooking/{bookingId}](http://localhost:8086/users/cancelBooking/{bookingId}) |  
| Add Wallet Balance              | [http://localhost:8086/users/wallet/addMoney/{email}?amount=00.0](http://localhost:8086/users/wallet/addMoney/{email}?amount=00.0) |  
| View Wallet Balance             | [http://localhost:8086/users/wallet/getBalance/{email}](http://localhost:8086/users/wallet/getBalance/{email}) |  
| View Wallet Transactions        | [http://localhost:8086/users/wallet/getTransactions/{email}](http://localhost:8086/users/wallet/getTransactions/{email}) |  

### **Hotel Service**
| **Feature**                     | **Endpoint**                                                                                   |  
|----------------------------------|-----------------------------------------------------------------------------------------------|  
| Fetch All Hotels                | [http://localhost:8086/hotels/all](http://localhost:8086/hotels/all)                           |  
| Fetch Hotel by ID               | [http://localhost:8086/hotels/{hotelId}](http://localhost:8086/hotels/{hotelId})               |  
| Add a Hotel                     | [http://localhost:8086/hotels/add](http://localhost:8086/hotels/add)                           |  
| Add a Room to a Hotel           | [http://localhost:8086/hotels/{hotelId}/rooms/add](http://localhost:8086/hotels/{hotelId}/rooms/add) |  
| Book a Room in a Hotel          | [http://localhost:8086/hotels/{hotelId}/bookings/add](http://localhost:8086/hotels/{hotelId}/bookings/add) |  
| Get All Bookings in a Hotel     | [http://localhost:8086/hotels/{hotelId}/bookings/all](http://localhost:8086/hotels/{hotelId}/bookings/all) |  

### **Rating Service**
| **Feature**                     | **Endpoint**                                                                                   |  
|----------------------------------|-----------------------------------------------------------------------------------------------|  
| Fetch All Ratings               | [http://localhost:8086/ratings/all](http://localhost:8086/ratings/all)                         |  
| Add a Rating                    | [http://localhost:8086/ratings/add](http://localhost:8086/ratings/add)                         |  
| Fetch Ratings by User ID        | [http://localhost:8086/ratings/user/{userId}](http://localhost:8086/ratings/user/{userId})     |  
| Fetch Ratings by Hotel ID       | [http://localhost:8086/ratings/hotel/{hotelId}](http://localhost:8086/ratings/hotel/{hotelId}) |  

---

## **How to Run**

1. Clone the repository:  
   ```bash
   git clone <repository-url>
   ```
2. Start the **Eureka Server**:  
   ```bash
   mvn spring-boot:run
   ```
3. Start all microservices (User, Hotel, Rating, etc.).  
4. Access the **Eureka Dashboard** at [http://localhost:8761](http://localhost:8761).  
5. Use the **API Gateway** endpoints for service interaction.

---
