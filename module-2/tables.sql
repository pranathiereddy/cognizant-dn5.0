--1.Users
create table Users(user_id int auto_increment primary key,
    full_name varchar(100) not null,
    email varchar(100) not null unique,
    city varchar(100) not null,
    registration_date date not null);
insert into Users(user_id,full_name,email,city,registration_date)
values
(1,'Alice Johnson','alice@example.com','New York','2024-12-01'),
(2,'Bob Smith','bob@example.com','Los Angeles','2024-12-05'),
(3,'Charlie Lee','charlie@example.com','Chicago','2024-01-10'),
(4,'Diana King','diana@example.com','New York','2025-01-15'),
(5,'Ethan Hunt','ethan@example.com','Los Angeles','2025-02-01');
select * from Users;


--2.Events
create table Events(event_id int auto_increment primary key,
    title varchar(200) not null,
    description text,
    city varchar(100) not null,
    start_date datetime not null,
    end_date datetime not null,
    status enum ('upcoming','completed','cancelled') default 'upcoming',
    organizer_id int,
    foreign key(organizer_id) references Users(user_id) 
);
insert into Events(event_id,title,description,city,start_date,end_date,status,organizer_id)
values
(1,'Tech Innovators Metup','A meetup for tech enhusiasts','New York','2025-06-10 10:00:00','2025-06-10 16:00:00','upcoming',1),
(2,'AI & ML Conference','Conference on AI and ML advancements','Chicago','2025-05-15 09:00:00','2025-05-15 17:00:00','completed',3),
(3,'Frontend Development Bootcamp','Hands-on training on frontend tech','Los angeles','2025-07-01 10:00:00','2025-07-03 16:00:00','upcoming',2);
select * from Events;


--3.Sessions
create table Sessions(
    session_id int auto_increment primary key,
    event_id int,
    title varchar(200) not null,
    speaker_name varchar(100) not null,
    start_time datetime not null,
    end_time datetime not null);
INSERT INTO Sessions
(session_id, event_id, title, speaker_name, start_time, end_time)
VALUES
(1, 1, 'Opening Keynote', 'Dr. Tech',
 '2025-06-10 10:00:00', '2025-06-10 11:00:00'),
(2, 1, 'Future of Web Dev', 'Alice Johnson',
 '2025-06-10 11:15:00', '2025-06-10 12:30:00'),
(3, 2, 'AI in Healthcare', 'Charlie Lee',
 '2025-05-15 09:30:00', '2025-05-15 11:00:00'),
(4, 3, 'Intro to HTML5', 'Bob Smith',
 '2025-07-01 10:00:00', '2025-07-01 12:00:00');
 select * from Sessions;
 

--4.Registrations 
CREATE TABLE Registrations (
    registration_id INT PRIMARY KEY,
    user_id INT NOT NULL,
    event_id INT NOT NULL,
    registration_date DATE NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (event_id) REFERENCES Events(event_id)
);
INSERT INTO Registrations
(registration_id, user_id, event_id, registration_date)
VALUES
(1, 1, 1, '2025-05-01'),
(2, 2, 1, '2025-05-02'),
(3, 3, 2, '2025-04-30'),
(4, 4, 2, '2025-04-28'),
(5, 5, 3, '2025-06-15');
select * from Registrations;


--5.Feedback
CREATE TABLE Feedback (
    feedback_id INT PRIMARY KEY,
    user_id INT NOT NULL,
    event_id INT NOT NULL,
    rating INT NOT NULL CHECK (rating BETWEEN 1 AND 5),
    comments text,
    feedback_date DATE NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (event_id) REFERENCES Events(event_id)
);
INSERT INTO Feedback
(feedback_id, user_id, event_id, rating, comments, feedback_date)
VALUES
(1, 3, 2, 4, 'Great insights!', '2025-05-16'),
(2, 4, 2, 5, 'Very informative.', '2025-05-16'),
(3, 2, 1, 3, 'Could be better.', '2025-06-11');
select * from Feedback;


--6.Resources
CREATE TABLE Resources (
    resource_id INT AUTO_INCREMENT PRIMARY KEY,
    event_id INT,
    resource_type ENUM('pdf', 'image', 'link') NOT NULL,
    resource_url VARCHAR(255) NOT NULL,
    uploaded_at DATETIME NOT NULL,
    FOREIGN KEY (event_id) REFERENCES Events(event_id)
);

INSERT INTO Resources (resource_id, event_id, resource_type, resource_url, uploaded_at) VALUES
(1, 1, 'pdf', 'https://portal.com', '2025-05-01 10:00:00'),
(2, 2, 'image', 'https://portal.com/resources/ai_poster.jpg', '2025-04-20 09:00:00'),
(3, 3, 'link', 'https://portal.com/resources/html5_docs', '2025-06-25 15:00:00');
select * from Resources;


































