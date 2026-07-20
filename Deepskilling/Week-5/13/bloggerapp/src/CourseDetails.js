import React from "react";

function CourseDetails() {

  const courses = [
    { id: 1, name: "React", duration: "30 Days" },
    { id: 2, name: "Spring Boot", duration: "45 Days" },
    { id: 3, name: "Java Full Stack", duration: "60 Days" }
  ];

  return (
    <div className="card">
      <h2>Course Details</h2>

      <ul>
        {courses.map((course) => (
          <li key={course.id}>
            <b>{course.name}</b> - {course.duration}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default CourseDetails;