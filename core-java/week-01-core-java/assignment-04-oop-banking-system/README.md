# Assignment 04 – OOP Banking Account Management System

## Overview
This assignment implements a simplified online banking system
using strict Object-Oriented Programming principles.

The system models account behavior, transaction handling,
and business rule validation using clean and extensible design.

---

## OOP Principles Applied

- Encapsulation
- Responsibility Segregation
- Reusability
- Clean Business Logic Design

---

## System Components

### 1. BankAccount
Encapsulates account data and core business operations:
- Deposit
- Withdraw
- Deactivate account
- Account holder update

Balance cannot be modified directly and has no public setter.

---

### 2. TransactionService
Handles transaction execution and result messaging.

Design rule followed:
- Does NOT access account balance directly
- Uses only public methods of BankAccount

---

### 3. Application Layer
Simulates:
- Account creation
- Deposit
- Withdrawal
- Invalid withdrawal
- Deactivation
- Attempt transaction on inactive account
- Final balance display

---

## Learning Outcome
This assignment strengthens:
- Class design
- Method-level responsibility
- Encapsulation enforcement
- Clean separation of concerns
- Real-world scenario modelling

---

## File Structure
- `BankAccount.java`
- `TransactionService.java`
- `Main.java` (Application layer)
- `assignment-04-oop-banking-system-questions.pdf`