// PlayerInput.js
import React, { useState } from 'react';

const PlayerInput = ({ label, value, onChange, onKeyPress, onClick, editMode }) => {
  return (
    <div>
      <label>{label}:</label>
      {editMode ? (
        <input
          type="text"
          value={value}
          onChange={onChange}
          onKeyPress={onKeyPress}
        />
      ) : (
        <span onClick={onClick}>{value}</span>
      )}
    </div>
  );
};

export default PlayerInput;
