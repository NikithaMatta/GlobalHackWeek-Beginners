# Rock, Paper, Scissors Game

A simple Java-based implementation of the classic Rock, Paper, Scissors game where you play against the computer.

## Features
- Play an unlimited number of rounds.
- User-friendly prompts and instructions.
- Randomized computer choices to ensure unpredictability.
- Validates user input to prevent errors.
- Exit the game anytime by typing `Exit`.

## How to Play
1. Run the program in any Java-compatible IDE or terminal.
2. Follow the prompts to enter your choice (`Rock`, `Paper`, or `Scissors`).
3. The computer will randomly select its choice.
4. The winner will be determined based on the following rules:
   - **Rock beats Scissors**
   - **Scissors beats Paper**
   - **Paper beats Rock**
5. You can type `Exit` to quit the game anytime.

## Requirements
- Java Development Kit (JDK) 8 or higher.

## How to Run
1. Clone this repository or copy the `RockPaperScissors.java` file.
2. Compile the file:
   ```
   javac RockPaperScissors.java
   ```
3. Run the program:
   ```
   java RockPaperScissors
   ```

## Example Gameplay
```
Welcome to Rock, Paper, Scissors!
Enter your choice (Rock, Paper, Scissors). Type 'Exit' to quit.
Your choice: Rock
Computer chose: Scissors
You win!
Your choice: Paper
Computer chose: Rock
You win!
Your choice: Exit
Thanks for playing! Goodbye!
```

## Project Purpose
This project demonstrates the following programming concepts:
- **Randomization:** Generating random choices for the computer.
- **Control Structures:** Using `if-else` to implement game logic.
- **Loops:** Continuously playing until the user decides to quit.
- **User Input Validation:** Ensuring only valid inputs are processed.

## Future Improvements
- Add a score counter to track wins, losses, and ties.
- Implement a graphical user interface (GUI).
- Allow multiplayer mode.
