import React from 'react';
import HealthBar from './HealthBar';

const playerInfoStyle = {
    marginBottom: '20px',
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
};

const playerNameStyle = {
    width: '200px',
    overflow: 'hidden',
    whiteSpace: 'nowrap',
    textOverflow: 'ellipsis',
  };

function PlayerInfo({ playerName, health, maxHealth }) {
  return (
    <div style={playerInfoStyle}>
      <h2 style={playerNameStyle}>{playerName}</h2>
      <HealthBar health={health} maxHealth={maxHealth}/>
    </div>
  );
}

export default PlayerInfo;
