import React from "react";
import "./App.css";
import officeImage from "./office.jpg";

function App() {

  const officeSpaces = [

    {
      id: 1,
      name: "Tech Park Office",
      rent: 55000,
      address: "Madhapur, Hyderabad",
      image: officeImage
    },

    {
      id: 2,
      name: "Business Hub",
      rent: 75000,
      address: "Hitech City, Hyderabad",
      image: officeImage
    },

    {
      id: 3,
      name: "Corporate Space",
      rent: 45000,
      address: "Gachibowli, Hyderabad",
      image: officeImage
    }

  ];

  return (

    <div className="App">

      <h1>Office Space Rental Application</h1>

      {

        officeSpaces.map((office) => (

          <div className="card" key={office.id}>

            <img
              src={office.image}
              alt="Office Space"
              className="officeImage"
            />

            <h2>{office.name}</h2>

            <p>

              <strong>Rent : </strong>

              <span
                style={{
                  color:
                    office.rent < 60000
                      ? "red"
                      : "green"
                }}
              >

                ₹ {office.rent}

              </span>

            </p>

            <p>

              <strong>Address :</strong>

              {office.address}

            </p>

          </div>

        ))

      }

    </div>

  );

}

export default App;