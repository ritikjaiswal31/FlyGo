# FlyGo

---

## Project Overview

FlyGo is an airline booking and operations platform that enables users to search flights, create bookings, manage passenger details, and track bookings. The application is built using **Spring Boot** for the backend, **React** for the frontend, and **MySQL** for relational data storage. It provides secure **JWT-based authentication** and role-based functionality for customers and administrators, including flight, airport, and booking management, along with automated booking confirmation emails using **Spring Mail**.

---

## Key Features

* Passenger details and booking history management
* Admin Dashboard for managing flights, airports, and customer bookings
* Flight and booking status management, including **SCHEDULED, DELAYED, CANCELLED, DEPARTED, and ARRIVED** flight states
* Automated booking confirmation emails
* Role-based access for **ADMIN, CUSTOMER, and PILOT**

---

## Tech Stack

| Category       | Technologies        |
| -------------- | ------------------- |
| Backend        | Spring Boot         |
| Frontend       | React               |
| Database       | MySQL               |
| Authentication | JWT                 |
| Communication  | REST APIs           |
| Email          | Spring Mail         |

---

## Architecture

```text
                         FlyGo Application
                                │
              ┌─────────────────┴─────────────────┐
              │                                   │
           CUSTOMER                         ADMIN / PILOT
              │                                   │
              └─────────────────┬─────────────────┘
                                │
                                ▼
                         React Frontend
                  (Customer & Admin Interfaces)
                                │
                         REST API Calls
                                │
                                ▼
                    Spring Boot Backend
                                │
        ┌───────────────────────┼────────────────────────┐
        │                       │                        │
        ▼                       ▼                        ▼
 Authentication          Business Services          Spring Mail
   & Security        ┌──────────────────────┐       (Gmail SMTP)
        │             │ Flight Management    │            │
        │             │ Airport Management   │            ▼
 JWT Authentication  │ Booking Management   │     Booking Confirmation
 + Role-Based Access │ Passenger Management │            Email
                      └──────────┬───────────┘
                                 │
                                 ▼
                       JPA / Repository Layer
                                 │
                                 ▼
                              MySQL
                                 │
             ┌───────────────────┼───────────────────┐
             │                   │                   │
         Users & Roles     Flights & Airports   Bookings & Passengers

```

---

## Application Screenshots

### 1. User Authentication

### Customer Registration

<img width="2560" height="1466" alt="Screenshot 2026-07-24 171401" src="https://github.com/user-attachments/assets/dae0c7b4-4e6c-4d6d-ad4b-43a0add4799b" />

### Welcome Email

<img width="2030" height="918" alt="Screenshot 2026-07-24 171526" src="https://github.com/user-attachments/assets/6750ef6b-5a04-4b67-ab2d-f06ef7a3c82f" />

### Customer Login

<img width="2560" height="1400" alt="Screenshot 2026-07-24 171612" src="https://github.com/user-attachments/assets/4bff5f75-9b60-4bbc-844c-d30fa063f05a" />

### 2. Flight Search

<img width="2560" height="1464" alt="Screenshot 2026-07-24 165426" src="https://github.com/user-attachments/assets/8536001d-9f0a-46cf-859d-c60b97654cf9" />

<img width="2560" height="1312" alt="Screenshot 2026-07-24 171738" src="https://github.com/user-attachments/assets/23c54127-3841-4b02-b13f-e201e27e25da" />

### 3. Flight Booking

### Passenger & Booking Details

<img width="2560" height="1456" alt="Screenshot 2026-07-24 173455" src="https://github.com/user-attachments/assets/32f98561-9aeb-48e6-a8a7-412ebe6620f0" />

### Booking Confirmation Email

<img width="1482" height="1102" alt="Screenshot 2026-07-24 174245" src="https://github.com/user-attachments/assets/5ec58669-1d2a-4d62-ac86-8eb7166ce4fb" />

### 4. Booking History

### My Bookings

<img width="2560" height="1356" alt="Screenshot 2026-07-24 173516" src="https://github.com/user-attachments/assets/ec5242b1-4802-4c84-89bd-60698ca990f8" />

### Booking Details

<img width="2560" height="1454" alt="Screenshot 2026-07-24 173530" src="https://github.com/user-attachments/assets/f2395619-5430-4da7-b773-8f520fbca205" />

### 5. Admin Operations

### Admin Dashboard

<img width="2560" height="1480" alt="Screenshot 2026-07-24 175613" src="https://github.com/user-attachments/assets/c3ee0540-f119-46de-8910-f7d98e86791b" />

### Manage Booking Status

<img width="2560" height="1166" alt="Screenshot 2026-07-24 175410" src="https://github.com/user-attachments/assets/305ddb41-70ea-4e1f-85ef-a8874f109614" />

### Manage Flight Status

<img width="1792" height="1094" alt="Screenshot 2026-07-24 175527" src="https://github.com/user-attachments/assets/1c48ceb1-0b27-47cf-8899-1254c0322846" />

### 6. Flight Management

<img width="2550" height="1476" alt="Screenshot 2026-07-24 170905" src="https://github.com/user-attachments/assets/caf806e8-1b36-4fde-9b1c-7a02098b8efd" />

<img width="2560" height="1456" alt="Screenshot 2026-07-24 171208" src="https://github.com/user-attachments/assets/d528a044-40eb-457a-b56f-5d700d27ebed" />

### 7. Airport Management

<img width="2560" height="1486" alt="Screenshot 2026-07-24 170402" src="https://github.com/user-attachments/assets/ffd3cff4-f596-41f8-b4d0-b3b137c236cd" />

<img width="1086" height="758" alt="Screenshot 2026-07-24 183216" src="https://github.com/user-attachments/assets/9a579eaa-d718-4556-9f9c-75d273ead1e8" />

### 8. Database Records

### Flight Records with Route & Status

<img width="1402" height="1006" alt="Screenshot 2026-07-24 183306" src="https://github.com/user-attachments/assets/c02f30e8-12fd-4a0c-b738-76a7df87d365" />

### Booking Records with Flight & Route Details

<img width="1202" height="1014" alt="Screenshot 2026-07-24 183347" src="https://github.com/user-attachments/assets/9f57114f-c581-4113-b35e-6a79cfc70f55" />

### Passenger & Booking Relationship

<img width="1440" height="1046" alt="Screenshot 2026-07-24 183420" src="https://github.com/user-attachments/assets/2ecb14fe-e61d-4b6f-8149-eb1b9d62f410" />
