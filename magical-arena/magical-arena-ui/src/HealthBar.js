import React from 'react';

const healthBarStyle = {
  width: '300px',
  height: '20px',
  border: '1px solid #000',
  borderRadius: '5px',
  overflow: 'hidden',
  marginBottom: '10px',
};

const fillStyle = (percentage) => ({
  width: `${percentage}%`,
  height: '100%',
  background: `linear-gradient(to right, #4CAF50, #4CAF50 ${percentage}%, #FF5722 ${percentage}%, #FF5722)`,
  borderRadius: '5px',
});

function HealthBar({ health, maxHealth }) {
  const percentage = (health / maxHealth) * 100;

  return (
    <div style={healthBarStyle}>
      <div style={fillStyle(percentage)}></div>
    </div>
  );
}

export default HealthBar;
