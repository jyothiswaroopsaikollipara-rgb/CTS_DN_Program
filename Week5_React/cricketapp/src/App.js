import React from "react";
import ListofPlayers from "./ListofPlayers";
import {
  OddPlayers,
  EvenPlayers,
  ListofIndianPlayers,
  IndianPlayers
} from "./IndianPlayers";

function App() {

  const flag = false;

  const IndianTeam = [
    "Sachin",
    "Dhoni",
    "Virat",
    "Rohit",
    "Yuvraj",
    "Raina"
  ];

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers />
      </div>
    );
  }

  return (
    <div>
      <h1>Odd Players</h1>
      {OddPlayers(IndianTeam)}

      <hr />

      <h1>Even Players</h1>
      {EvenPlayers(IndianTeam)}

      <hr />

      <h1>List of Indian Players Merged</h1>
      <ListofIndianPlayers IndianPlayers={IndianPlayers} />
    </div>
  );
}

export default App;