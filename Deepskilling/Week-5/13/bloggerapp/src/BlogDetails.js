import React from "react";

function BlogDetails() {

  const blogs = [
    { id: 1, title: "React Components", author: "John" },
    { id: 2, title: "React Hooks", author: "Alice" },
    { id: 3, title: "JavaScript ES6", author: "David" }
  ];

  return (
    <div className="card">
      <h2>Blog Details</h2>

      <ul>
        {blogs.map((blog) => (
          <li key={blog.id}>
            <b>{blog.title}</b> - {blog.author}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BlogDetails;