import React, { useEffect, useState } from "react";
import PlayerInfo from "./PlayerInfo";
import axiosInstance from "./AxiosInstance";
import GameSummary from "./GameSummary";

const gameBoardStyle = {
  textAlign: "center",
  marginTop: "50px",
  display: "flex",
  flexDirection: "column",
  alignItems: "center",
};

const playersContainerStyle = {
  display: "flex",
  justifyContent: "space-between",
  width: "50%", // Adjust the width as needed
  marginBottom: "20px", // Add margin for better spacing
};

const diceButtonStyle = {
  padding: "10px",
  fontSize: "18px",
  backgroundColor: "#4CAF50",
  color: "white",
  cursor: "pointer",
  marginTop: "20px",
};

function GameBoard() {
  const [gameStatus, setGameStatus] = useState(null);

  useEffect(() => {
    axiosInstance
      .get("api/magical-arena/players-info")
      .then((response) => {
        // Handle success if needed
        console.log(response.data);
        // setGameStatus(response.data); // Update game status in the state
      })
      .catch((error) => {
        // Handle error if needed
        console.error(error);
      });
  }, []); 

  const rollDice = () => {
    console.log("test");
    axiosInstance
      .get("api/magical-arena/status")
      .then((response) => {
        // Handle success if needed
        console.log(response.data);
        setGameStatus(response.data); // Update game status in the state
      })
      .catch((error) => {
        // Handle error if needed
        console.error(error);
      });
  };
  const player1 = {
    name: "Dhairy",
    health: 80,
    maxHealth: 100,
  };

  const player2 = {
    name: "Dhairy2",
    health: 90,
    maxHealth: 100,
  };

  const currentPlayer = "Dhairy";
  const gameResult = "In Progress";

  return (
    <div style={gameBoardStyle}>
      <div style={playersContainerStyle}>
        <PlayerInfo
          playerName={player1.name}
          health={player1.health}
          maxHealth={player1.maxHealth}
        />
        <PlayerInfo
          playerName={player2.name}
          health={player2.health}
          maxHealth={player2.maxHealth}
        />
      </div>

      <div>
        <button onClick={rollDice} style={diceButtonStyle}>
          Roll Dice
        </button>
      </div>

      <GameSummary currentPlayer={currentPlayer} gameResult={gameResult} />
    </div>
  );
}

export default GameBoard;
