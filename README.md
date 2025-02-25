### **TaskFlow - Task Service**

TaskFlow is a **task management service** designed with a **microservices architecture** and event-driven communication using Kafka. The service provides REST & GraphQL APIs for task management, ensuring scalability, observability, and high availability.

---

## **🚀 Tech Stack**
### **🔹 Core Technologies**
- **Java 21**
- **Spring Boot** (Web, Cloud, Security)
- **Hexagonal Architecture**

### **🔹 Database & Persistence**
- **PostgreSQL**
- **Liquibase** (for database migrations)

### **🔹 Messaging & Event-Driven Architecture**
- **Apache Kafka**

### **🔹 Cloud & DevOps**
- **Docker & Kubernetes (K8s)**
- **Helm** (Kubernetes package manager)
- **Terraform** (Infrastructure as Code)
- **AWS**

### **🔹 Observability & Logging**
- **Loki** (Logging)
- **Prometheus** (Monitoring)
- **Jaeger/OpenTelemetry** (Tracing)

### **🔹 Security & Authentication**
- **OAuth2 + Keycloak**

### **🔹 Testing & CI/CD**
- **JUnit 5** (Unit Testing)
- **Testcontainers** (Integration Testing)
- **WireMock** (Mocking external services)

---

## **🛠 Setup & Run the Project**
### **1️⃣ Prerequisites**
Ensure you have the following installed:
- **Java 21**
- **Maven**
- **Docker & Docker Compose**

### **2️⃣ Clone the Repository**
```bash
git clone https://github.com/smurfizkewl/taskflow.git
cd taskflow
```

### **3️⃣ Checkout the Feature Branch**
```bash
git checkout main
```

### **4️⃣ Build the Project**
```bash
mvn clean compile
```

### **5️⃣ Run PostgreSQL & Kafka with Docker Compose**
```bash
docker compose up -d
```

### **6️⃣ Start the Application**
```bash
mvn spring-boot:run
```

---

## **📂 Project Structure**

```
taskflow-task-service/
│── src/
│   ├── main/
│   │   ├── java/com/taskflow/taskservice/
│   │   │   ├── inbound/    # Controllers & DTOs (REST & GraphQL)
│   │   │   ├── core/       # Core Business Logic (Services, Models)
│   │   │   ├── outbound/   # Repository Layer & Kafka Producers
│   │   │   ├── config/     # Configuration (DB, Kafka, Security)
│   ├── resources/
│   │   ├── db/changelog/   # Liquibase migrations (SQL format)
│── pom.xml
│── docker-compose.yml
│── README.md
```

---

## **✅ Features Implemented**
✔ **Project Bootstrap** (Spring Boot, Hexagonal Architecture)  
✔ **Task Service (DTOs, Entities, Mappers)**  
✔ **MapStruct Integration**  
✔ **Database Setup (PostgreSQL)**  
✔ **Docker Compose for PostgreSQL & Kafka** (In Progress)

---

### **📌 Next Steps**
- 🔹 **Finish database setup & migrations (Liquibase)**
- 🔹 **Set up Kafka producer & consumer**
- 🔹 **Add Logging & Observability**
- 🔹 **Create CI/CD Pipeline**

---

