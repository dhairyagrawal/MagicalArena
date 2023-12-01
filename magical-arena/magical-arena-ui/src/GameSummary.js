import React from 'react';

const gameSummaryStyle = {
  marginTop: '20px',
  padding: '10px',
  backgroundColor: '#f0f0f0',
  borderRadius: '5px',
};

function GameSummary({ currentPlayer, gameResult }) {
  return (
    <div style={gameSummaryStyle}>
      <p>Current Turn: {currentPlayer}</p>
      <p>{gameResult}</p>
    </div>
  );
}

export default GameSummary;
