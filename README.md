# Public Transportation Payment Card System

## Introduction

This project implements a Java-based payment card system for Turku regional public transportation Föli. The system allows users to load money onto their cards, inquire about their balance, and purchase different types of tickets for bus journeys.

## System Overview

The payment card system consists of the following components:

1. PaymentCard: Represents a payment card that users can load money onto and use to purchase tickets.
2. Ticket: Represents different types of tickets that users can purchase, including single tickets, day tickets, and monthly tickets.
3. TicketMachine: Provides methods to purchase tickets using a payment card.

## Functionality

### PaymentCard Class

- **loadMoney(double amount)**: Allows users to load money onto the card.
- **inquireBalance()**: Retrieves the current balance of the card.
- **purchaseTicket(Ticket ticket)**: Deducts the price of the ticket from the card balance upon purchase.

### Ticket Class

- **validate(long currentTimeMillis)**: Checks if the ticket is still valid based on the current system time.
- **getExpirationTime()**: Calculates the expiration time of the ticket.
- **getPrice()**: Retrieves the price of the ticket.

### TicketMachine Class

- **purchaseSingleTicket(PaymentCard card)**: Allows users to purchase a single ticket.
- **purchaseDayTicket(PaymentCard card)**: Allows users to purchase a day ticket.
- **purchaseMonthlyTicket(PaymentCard card)**: Allows users to purchase a monthly ticket.

## Usage

To use the payment card system:

1. Create a new PaymentCard object.
2. Load money onto the card using the `loadMoney()` method.
3. Inquire about the card balance using the `inquireBalance()` method.
4. Use the TicketMachine methods to purchase tickets for bus journeys.

## Implementation

The system is implemented in Java, utilizing object-oriented principles such as encapsulation, inheritance, and polymorphism to model the payment card system effectively.

## Note

This implementation provides a functional model of the payment card system and does not interact with physical payment terminals, cards, or other systems.
