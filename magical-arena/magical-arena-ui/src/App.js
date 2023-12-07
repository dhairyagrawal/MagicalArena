import { useState } from 'react';
import './App.css';
import GameBoard from './GameBoard';
import PlayerInitialization from './PlayerInitialization';

const appStyle = {
  display: 'flex',
  flexDirection: 'row',
  justifyContent: 'space-between',
  alignItems: 'center',
  minHeight: '100vh', // Ensure full height of the viewport
  backgroundColor: '#add8e6', // Light blue background color
  padding: '20px',
};

function App() {
  const [startGame, setStartGame] = useState(false);
  return (
    <div className="App" style={appStyle}>
      {startGame ? (
        <GameBoard />
      ) : (
        <PlayerInitialization gameInitialized={setStartGame}/>
      )}
    </div>
  );
}

export default App;
