DROP DATABASE IF EXISTS GuessTheNumberDatabase;
CREATE DATABASE GuessTheNumberDatabase;
USE GuessTheNumberDatabase;

CREATE TABLE Game (
	GameId INT PRIMARY KEY AUTO_INCREMENT,
	Answer VARCHAR(5) NOT NULL,
	GameInProgress BOOLEAN NOT NULL
);

CREATE TABLE Guess (
	guessId INT PRIMARY KEY AUTO_INCREMENT,
	`Time` DATETIME NOT NULL,
	Answer VARCHAR(5) NOT NULL,
	Result VARCHAR(10) NOT NULL,
	GameId INT NOT NULL,
	CONSTRAINT fk_Guess_Game FOREIGN KEY (GameId)
		REFERENCES Game(GameId)
);