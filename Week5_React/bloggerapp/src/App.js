import React from "react";

const books = [
  { id: 101, bname: "Master React", price: 670 },
  { id: 102, bname: "Deep Dive into Angular 11", price: 800 },
  { id: 103, bname: "Mongo Essentials", price: 450 }
];

const blogs = [
  {
    id: 1,
    title: "React Learning",
    author: "Stephen Biz",
    description: "Welcome to learning React!"
  },
  {
    id: 2,
    title: "Installation",
    author: "Schwedenier",
    description: "You can install React from npm."
  }
];

const courses = [
  { id: 1, cname: "Angular", date: "4/5/2021" },
  { id: 2, cname: "React", date: "6/3/2021" }
];

function BookDetails() {
  return (
    <div>
      <h2>Book Details</h2>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  );
}

function BlogDetails() {
  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.description}</p>
        </div>
      ))}
    </div>
  );
}

function CourseDetails() {
  return (
    <div>
      <h2>Course Details</h2>
      {courses.map((course) => (
        <div key={course.id}>
          <h3>{course.cname}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

function App() {
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "space-around",
        padding: "20px"
      }}
    >
      <CourseDetails />
      <BookDetails />
      <BlogDetails />
    </div>
  );
}

export default App;