# MagicalArena Console Game

Welcome to the MagicalArena, a simple console-based game where two players engage in magical battles!

## Table of Contents

- [Prerequisites](#prerequisites)
- [How to Run](#how-to-run)
- [Game Rules](#game-rules)
- [Sample Gameplay](#sample-gameplay)

## Prerequisites

- **Java Runtime Environment (JRE):** Make sure you have Java installed on your machine. You can download it [here](https://www.oracle.com/java/technologies/javase-downloads.html).

## How to Run

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/your-username/magical-arena.git
   cd magical-arena

2. ** Compile and Run:

   Open a terminal or command prompt and execute the following commands:
   ```bash
   javac MagicalArena.java
   java MagicalArena
   Follow On-screen Instructions:

Enter Player 1's name and health when prompted.
Enter Player 2's name and health when prompted.
The game will proceed with turns and display the results until one player wins or it's a tie.
Enjoy the Game!

Have fun playing the MagicalArena game!

## Game Rules
Players take turns attacking and defending.<br> 
Each player rolls a six-sided die for their attack and defense.<br> 
Damage is calculated based on the attack value, die roll, and opponent's defense.<br> 
The game ends when one player's health reaches 0.<br> 

## Sample Gameplay
   ```bash
   Enter Player 1 name: Alice
   Enter Player 1 health: 50
   
   Enter Player 2 name: Bob
   Enter Player 2 health: 50
   
   ...
   
   Player 1: Alice - Health: 30
   Player 2: Bob - Health: 20
   ---------------
   
   ...
   
   Player 1: Alice - Health: 0
   Player 2: Bob - Health: 10
   ---------------
   
   Bob wins!
   ```
## Bonus
I have created a maven spring boot application for exposing the game via API and created a basic REACT App for the same, it is not complete but can check out.<br> 

## How to Run
To run the maven react app
   Open a terminal or command prompt and execute the following commands:
   ```bash
   cd magical-arena
   mvn clean install
   mvn spring-boot:run
   ```
   Open another terminal or command prompt parallely and execute the following commands:
   ```bash
   cd magical-arena-ui
   npm install
   npm start
   ```

Check out the frontend.
