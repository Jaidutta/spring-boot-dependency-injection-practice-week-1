# Alice and Her Bakery - Spring Boot Dependency Injection Demo

A beautiful, clean, production-ready Spring Boot application demonstrating **Dependency Injection**, **Strategy Pattern**, and **loose coupling** — built by Joy.

## Problem Statement (Alice and Her Bakery)

Alice owns a bakery. She wants to bake cakes with different combinations of **Frosting** and **Syrup** flavors (Chocolate, Strawberry, etc.) without changing the core baking logic.

### Requirements
- Two abstractions: `Frosting` and `Syrup`
- Multiple implementations (Chocolate, Strawberry)
- `CakeBaker` depends only on interfaces (not concrete classes)
- Flavor combinations should be swappable at runtime
- Use **Constructor-based Dependency Injection** (best practice)

## Project Structure
com.learntocode.joy.module1Introduction
├── CakeBaker.java              ← Main class (uses DI)
├── Frosting.java               ← Interface
├── Syrup.java                  ← Interface
├── impl/
│   ├── ChocolateFrosting.java
│   ├── StrawberryFrosting.java
│   ├── ChocolateSyrup.java
│   └── StrawberrySyrup.java
└── Module1IntroductionApplication.java ← Spring Boot entry + CommandLineRunner

## Key Features Implemented

| Feature                        | Implemented? | Notes |
|--------------------------------|--------------|-------|
| Constructor Injection          | Yes          | Preferred & immutable |
| Dependency Inversion Principle | Yes          | Depends on abstractions |
| Strategy Pattern               | Yes          | Easy to add new flavors |
| `@Component` + `@Primary`      | Yes          | Spring auto-wires correct beans |
| Clean output on startup        | Yes          | See below |

How to Run

Clone the repo
Run Module1IntroductionApplication.java as Spring Boot App
Watch Alice bake her cake!

Why This Design is Perfect

Extensible: Add VanillaFrosting? Just create a new @Component
Testable: Easy to mock Frosting/Syrup in unit tests
Clean Code: No tight coupling
Real-world ready: Exactly how big companies structure services

Technologies Used

Spring Boot 3.x
Java 17+
Lombok (optional — you used manual constructor)
Pure Dependency Injection


Made with love by Joy
Learning Spring Boot, one delicious cake at a time.
