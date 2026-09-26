# Order Processing System 📦

A full-stack web application for managing customer orders in real-time, built with **Spring Boot 3**, **Java 21**, and **Vanilla JavaScript**.

## 🚀 Features
- **RESTful APIs**: Full CRUD capabilities (`POST`, `GET`, `PUT`, `DELETE`).
- **Dynamic Frontend**: Clean HTML5/CSS3/JavaScript interface using `Fetch API`.
- **Automated UX**: Form auto-clears on successful submission and live table updates.
- **Order Lifecycle**: Instant status updates (e.g., `PENDING` to `SHIPPED`).
- **Data Integrity**: Jakarta Bean Validation and `@RestControllerAdvice` for global exception handling.
- **Persistence**: H2 In-Memory Database integrated via Spring Data JPA.

## 🛠️ Tech Stack
- **Backend**: Java 21, Spring Boot 3, Spring Data JPA, Jakarta Validation
- **Database**: H2 In-Memory Database
- **Frontend**: HTML5, CSS3, JavaScript (ES6+)
- **Build Tool**: Maven

## 🔌 API Endpoints
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/orders` | Create a new order |
| `GET` | `/api/orders` | Fetch all orders |
| `GET` | `/api/orders/{id}` | Get order by ID |
| `PUT` | `/api/orders/{id}/status` | Update order status |
| `DELETE` | `/api/orders/{id}` | Delete an order |

## ⚙️ How to Run Locally

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/order-processing-system.git](https://github.com/your-username/order-processing-system.git)
