import './App.css';
import GameBoard from './GameBoard';

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
  return (
    <div className="App" style={appStyle}>
      <GameBoard/>
    </div>
  );
}

export default App;
