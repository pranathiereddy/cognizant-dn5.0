import React from "react";

function GuestPage() {
  return (
    <div className="card">
      <h2>Guest Page</h2>

      <h3>Flight Details</h3>

      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>Flight</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Fare</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Hyderabad</td>
            <td>Delhi</td>
            <td>₹5000</td>
          </tr>

          <tr>
            <td>AI202</td>
            <td>Chennai</td>
            <td>Mumbai</td>
            <td>₹6500</td>
          </tr>
        </tbody>
      </table>

      <p><b>Please login to book tickets.</b></p>
    </div>
  );
}

export default GuestPage;