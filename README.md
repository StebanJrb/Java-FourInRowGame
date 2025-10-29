# Java Four In Row Game

A classic "Four in a Row" (Connect Four) game implemented in Java with a graphical user interface using Swing.

## Features

- **Two-player gameplay:** Players take turns dropping tokens into a vertical board.
- **Graphical UI:** Simple interface with player panels and an interactive board.
- **Win Detection:** Automatically detects horizontal, vertical, and diagonal wins.
- **User Prompts:** Dialogs for entering player names and displaying the winner.

## Game Structure

### Main Classes

- **`FourInRowMain`**
  - Main window and entry point (`main()`).
  - Handles game initialization, player input, and UI layout.
  - Manages the main game loop by coordinating board and player panels.

- **`Board`**
  - Internal logic and state for the game board.
  - Methods for placing tokens, checking for winners, and printing board state.
  - Handles win detection across rows, columns, and diagonals.

- **`Player`**
  - Stores player name and token character.
  - Used to identify players and their moves.

- **`PanelBoard`**
  - Custom JPanel that displays the game board.
  - Handles mouse input to allow players to select columns for their moves.
  - Calls board logic and updates UI.

- **`PanelPlayer`**
  - Panel displaying current player info and whose turn it is.
  - Updates after each move.

### Project Structure

```
src/
  main/
    java/
      Main/
        FourInRowMain.java
        PanelBoard.java
        PanelPlayer.java
      Sources/
        Board.java
        Player.java
        Util.java
  resources/
    images/
      board.png
      red.png
      black.png
README.md
```

### How To Play

1. **Run the application:**
   - Compile and run `FourInRowMain.java`.
   - Example (from project root):  
     `javac -d bin src/main/java/Main/FourInRowMain.java && java -cp bin Main.FourInRowMain`
2. **Enter player names:**  
   You will be prompted to enter names for both players.
3. **Take turns:**  
   Click on the column where you want to drop your token. The current player is shown at the top.
4. **Win the game:**  
   The first player to get four of their tokens in a row (vertically, horizontally, or diagonally) wins. The game will display a winner dialog.

### Customization

- **Tokens and Board Images:**  
  You can change the images in the `images/` folder to customize the look of the game.
- **Board Size:**  
  The board is currently set to 6 rows by 7 columns, but can be modified in `Board.java`.

### Requirements

- Java 8 or later.
- Swing (comes with standard Java distributions).

## Author

Steban Ruiz

---

Enjoy playing Four In A Row!
