import React from "react";

function ListofPlayers() {

  const players = [
    { name: "Virat Kohli", score: 95 },
    { name: "Rohit Sharma", score: 80 },
    { name: "Shubman Gill", score: 65 },
    { name: "KL Rahul", score: 55 },
    { name: "Hardik Pandya", score: 90 },
    { name: "Ravindra Jadeja", score: 45 },
    { name: "Rishabh Pant", score: 75 },
    { name: "Surya Kumar", score: 60 },
    { name: "Bumrah", score: 30 },
    { name: "Siraj", score: 25 },
    { name: "Shami", score: 50 }
  ];

  return (
    <div>
      <h2>List of Players</h2>

      {players.map((player, index) => (
        <div key={index}>
          <h4>{player.name} - {player.score}</h4>
        </div>
      ))}

      <h2>Players with Score Below 70</h2>

      {
        players
          .filter(player => player.score < 70)
          .map((player, index) => (
            <div key={index}>
              {player.name} - {player.score}
            </div>
          ))
      }

    </div>
  );
}

export default ListofPlayers;