import React from "react";

function BookDetails() {

  const books = [
    { id: 1, name: "Java Programming", author: "James Gosling" },
    { id: 2, name: "React Basics", author: "Jordan Walke" },
    { id: 3, name: "Spring Boot", author: "Pivotal Team" }
  ];

  return (
    <div className="card">
      <h2>Book Details</h2>

      <ul>
        {books.map((book) => (
          <li key={book.id}>
            <b>{book.name}</b> - {book.author}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;