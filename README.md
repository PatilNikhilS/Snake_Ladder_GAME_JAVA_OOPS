# Snake_Ladder_GAME_JAVA_OOPS

<p>All core concepts of obejct oriented programe is Covered in this Game. This is a simple console-based implementation of the popular game Snake and Ladder built using Core Java. The game supports multiple players and random dice rolls. The objective of the game is to be the first player to reach the end of the board by climbing ladders and avoiding snakes.</p>
<br>

<H2>Installation and Usage</H2>
<br>

```
1. Clone the repository: git clone https://github.com/your-username/Snake-Ladder-Game.git
2. Navigate to the project directory: cd Snake-Ladder-Game
3. Compile the Java files: javac *.java
4. Run the game: java Main
```

<H2>GamePlay</H2>
<br>

```
1. The game starts by prompting the user to enter the number of players.
2. Each player takes turns rolling a six-sided dice. The number on the dice determines the number of steps the player can move on the board.
3. If a player lands on a ladder, they move up to the square at the top of the ladder.
4. If a player lands on a snake, they move down to the square at the tail of the snake.
5. The first player to reach the end of the board wins the game.
```

<H2>Implementation_Details</H2>
<br>

<p>The game is built using Core Java and follows the object-oriented programming paradigm. The main classes and their responsibilities are as follows:</p>
<br>

<H3>Snake</H3><hr>
<p>The Snake class represents the Snake and its properties. It contains the head and the tail value of the Snake.</p>
<br>

<H3>Ladder</H3><hr>
<p>The Ladder class represents the Snake and its properties. It contains the start and the end value of the Ladder.</p>
<br>

<H3>Board</H3><hr>
<p>The Board class represents the game board and its properties. It contains the number of squares on the board, the positions of the ladders and snakes, and the current positions of the players.</p>
<br>

<H3>Player</H3><hr>
<p>The Player class represents a player in the game. It contains the player's name and current position on the board.</p>
<br>

<H3>Dice</H3><hr>
<p>The Dice class represents the dice used in the game. It generates a random number between 1 and 6 when rolled.</p>
<br>

<H3>Main</H3><hr>
<p>The Main class contains the main method and is responsible for starting the game. It prompts the user for the number of players and initializes the game board and players. It then runs the game loop until a player reaches the end of the board.</p>
<br>

<H3>Conclusion</H3><hr>
<p>This Snake and Ladder game implementation using Core Java is a fun and interactive way to practice object-oriented programming concepts and Java syntax. The game is easy to install and run, and can be easily modified and customized to suit individual preferences.</p>
<br>
