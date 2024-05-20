# Public Transportation Payment Card System

## Introduction
This repository contains the design documentation for the modernization of the payment card system for Turku regional public transportation (Föli). The system is Java-based and aims to simplify the operation of payment cards for users while providing efficient ticket purchase options.

## System Design

### Classes and Responsibilities
1. **PaymentCard**: Represents an individual payment card. Responsible for managing card balance and ticket purchases.
   - Member Variables: cardNumber, balance
   - Methods: loadMoney(), inquireBalance(), purchaseTicket()

2. **Ticket**: Represents a public transportation ticket. Responsible for storing ticket information and validating ticket validity.
   - Member Variables: ticketType, price, validityDuration
   - Methods: validate(), getExpirationTime()

3. **TicketMachine**: Represents a device for purchasing tickets. Responsible for processing ticket purchases and deducting ticket prices from the card balance.
   - Member Variables: None (Static methods)
   - Methods: purchaseSingleTicket(), purchaseDayTicket(), purchaseMonthlyTicket()

### Agreements
- **Routine Definitions**: All routines (methods) should have clear responsibilities and follow the Single Responsibility Principle.
- **Class Invariants**: PaymentCard should ensure that the balance remains non-negative. Ticket should ensure that the validity duration is within the supported range.
- **Encapsulation**: Member variables should be private, with public accessor methods for controlled access.

### Communication
- PaymentCard communicates with TicketMachine to purchase tickets and update balance.
- TicketMachine communicates with PaymentCard to deduct ticket prices and update balance.

## Conclusion
The designed system provides a flexible and user-friendly approach to public transportation ticket purchases, ensuring accurate balance management and ticket validation.
