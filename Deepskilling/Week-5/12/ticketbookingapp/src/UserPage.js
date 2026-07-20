import React from "react";

function UserPage() {
  return (
    <div className="card">
      <h2>User Page</h2>

      <h3>Book Your Ticket</h3>

      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>Flight</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Fare</th>
            <th>Action</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Hyderabad</td>
            <td>Delhi</td>
            <td>₹5000</td>
            <td>
              <button>Book</button>
            </td>
          </tr>

          <tr>
            <td>AI202</td>
            <td>Chennai</td>
            <td>Mumbai</td>
            <td>₹6500</td>
            <td>
              <button>Book</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default UserPage;