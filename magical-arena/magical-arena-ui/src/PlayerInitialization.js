// PlayerInitialization.js
import React, { useState } from 'react';
import axiosInstance from "./AxiosInstance";
import PlayerInput from './PlayerInput';

const PlayerInitialization = (props) => {
  const [player1Name, setPlayer1Name] = useState('');
  const [player1Health, setPlayer1Health] = useState('');
  const [player2Name, setPlayer2Name] = useState('');
  const [player2Health, setPlayer2Health] = useState('');
  const [editModePlayer1, setEditModePlayer1] = useState(true);
  const [editModeHealthPlayer2, setEditModeHealthPlayer2] = useState(true);
  const [editModeHealthPlayer1, setEditModeHealthPlayer1] = useState(true);
  const [editModePlayer2, setEditModePlayer2] = useState(true);

  const handleKeyPress = (player, e) => {
    if (e.key === 'Enter') {
      if (player === 'player1') {
        setEditModePlayer1(false);
      } else if (player === 'player2') {
        setEditModePlayer2(false);
      }
      else if (player === 'player1health') {
        setEditModeHealthPlayer1(false);
      }
      else if (player === 'player2health') {
        setEditModeHealthPlayer2(false);
      }
    }
  };

  const initializePlayers = () => {
    props.gameInitialized(true);
    console.log(player1Health, player2Health, player1Name, player2Name);
    axiosInstance.post('api/magical-arena/initialize-players', {
      player1Name,
      player1Health: parseInt(player1Health, 10),
      player2Name,
      player2Health: parseInt(player2Health, 10),
    })
    .then(response => {
      console.log(response.data);
      // Handle success if needed
    })
    .catch(error => {
      console.error(error);
      // Handle error if needed
    });
  };

  return (
    <div>
      <h1>Player Initialization</h1>
      <PlayerInput
        label="Player 1 Name"
        value={player1Name}
        onChange={(e) => setPlayer1Name(e.target.value)}
        onKeyPress={(e) => handleKeyPress('player1', e)}
        onClick={() => setEditModePlayer1(true)}
        editMode={editModePlayer1}
      />
      <PlayerInput
        label="Player 1 Health"
        value={player1Health}
        onChange={(e) => setPlayer1Health(e.target.value)}
        onKeyPress={(e) => handleKeyPress('player1health', e)}
        onClick={() => setEditModeHealthPlayer1(true)}
        editMode={editModeHealthPlayer1}
      />

      <PlayerInput
        label="Player 2 Name"
        value={player2Name}
        onChange={(e) => setPlayer2Name(e.target.value)}
        onKeyPress={(e) => handleKeyPress('player2', e)}
        onClick={() => setEditModePlayer2(true)}
        editMode={editModePlayer2}
      />
      <PlayerInput
        label="Player 2 Health"
        value={player2Health}
        onChange={(e) => setPlayer2Health(e.target.value)}
        onKeyPress={(e) => handleKeyPress('player2health', e)}
        onClick={() => setEditModeHealthPlayer2(true)}
        editMode={editModeHealthPlayer2}
      />

      <button onClick={initializePlayers}>Play Game</button>
    </div>
  );
};

export default PlayerInitialization;
