**Ticket Booking System**

## Project Description
The **World Cup 2022 Ticket Booking System** is a Java-based application designed to facilitate the booking of tickets for the preliminary rounds of the FIFA World Cup 2022 held in Qatar. The system allows users to:
- View the groups and teams participating in the tournament.
- Browse matches by group, including details like date, time, stadium, and city.
- Book tickets for specific matches, selecting seats based on different pricing categories.
- Provide personal information for ticket ownership and confirmation.

## Features
1. **Group and Match Information**:
   - Displays all 8 groups (A-H) and their respective teams.
   - Shows detailed match schedules, including date, time, stadium, and city.

2. **Ticket Booking**:
   - Users can select a group to view its matches and choose a specific match to book.
   - Seat selection is available in different categories (Category 1, 2, or 3) with varying prices.

3. **User Information**:
   - Collects user details such as name, age, email, phone number, national ID, and address.
   - Validates user age (must be 18 or older to book a ticket).

4. **Seat Management**:
   - Tracks booked seats in real-time to avoid duplicates.
   - Provides visual feedback on currently booked seats in the selected area.

5. **Ticket Confirmation**:
   - Generates a detailed ticket with user information, match details, seat number, and price.

## Technologies Used
- **Java**: Core programming language for the application.
- **Object-Oriented Programming (OOP)**: Utilizes classes and objects for modularity (e.g., `Group`, `Match`, `Owner`, `Staduim`, `Ticket`).
- **Data Structures**: Uses arrays, `ArrayList`, and `HashMap` for managing seats and areas.
- **User Input Handling**: `Scanner` class for interactive console input.

## How to Run the Project
1. Ensure you have Java installed on your system.
2. Compile all the Java files:
   ```
   javac *.java
   ```
3. Run the main class:
   ```
   java OopProject
   ```
4. Follow the on-screen instructions to navigate through the system and book tickets.

## Code Structure
- **`OopProject.java`**: Main class containing the entry point and user interaction logic.
- **`Group.java`**: Represents a group in the tournament, including teams and matches.
- **`Match.java`**: Represents a match, including teams, date, and time.
- **`Owner.java`**: Stores and validates user information.
- **`Staduim.java`**: Manages seat booking and tracking.
- **`Ticket.java`**: Handles ticket pricing and ownership details.

## Future Enhancements
1. **Graphical User Interface (GUI)**: Replace the console-based interface with a GUI for better user experience.
2. **Database Integration**: Store user and booking data persistently.
3. **Payment Gateway**: Integrate a payment system for online transactions.
4. **Additional Validations**: Enhance input validations for user data (e.g., email format, phone number).
5. **Admin Panel**: Allow administrators to manage matches, seats, and user bookings.
