import React from "react";

function App() {

  const office = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "Regus",
      Rent: 65000,
      Address: "Bangalore"
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Hyderabad"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space Rental App</h1>

      <img
        src="https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
        alt="Office Space"
        width="500"
      />

      <h2>Office Details</h2>

      <p><strong>Name:</strong> {office.Name}</p>

      <p>
        <strong>Rent:</strong>{" "}
        <span
          style={{
            color: office.Rent <= 60000 ? "red" : "green"
          }}
        >
          {office.Rent}
        </span>
      </p>

      <p><strong>Address:</strong> {office.Address}</p>

      <hr />

      <h2>Office Space List</h2>

      {officeList.map((item, index) => (
        <div key={index} style={{ marginBottom: "20px" }}>
          <p><strong>Name:</strong> {item.Name}</p>

          <p>
            <strong>Rent:</strong>{" "}
            <span
              style={{
                color: item.Rent <= 60000 ? "red" : "green"
              }}
            >
              {item.Rent}
            </span>
          </p>

          <p><strong>Address:</strong> {item.Address}</p>

          <hr />
        </div>
      ))}

    </div>
  );
}

export default App;