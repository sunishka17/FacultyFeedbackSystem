# Faculty Feedback System

### The Scenario
My client is the IBDP coordinator of my school. She manages teachers and students in fields of communication, grading, and other activities. Recently, while talking to her about an academic-related problem, I learned that she is facing a significant issue related to the feedback given by the students to all the teachers at school.

Currently, my client receives feedback during Parent-Teacher Meetings or through students directly approaching her to discuss problems. This method is not feasible as it does not appropriately reflect the issues students might be facing. Additionally, my client writes down the feedback manually. Managing feedback for about 10 teachers and 90 students single-handedly is challenging and prone to data loss due to the lack of a storage system. There's also no guarantee of data security, increasing the risk of leaks.

Moreover, the feedback cannot be generalized, and it is difficult to take any actionable steps to solve issues. My client aims to provide the best learning experience for students by ensuring that teachers can improve based on feedback. Without a systematic way to track necessary improvements, her job becomes difficult.

I realized that a 'Faculty Feedback System' would solve her problems, so I consulted my CS teacher for further guidance. This led to a detailed interview about plausible solutions (Appendix A).

### The Rationale for the Proposed Solution
Since the client had no specific software preferences, I decided to develop the program in Java Swing, which would allow me to create a navigable, user-friendly interface with extensive functionality. Using MySQL for data storage would enable handling large amounts of data efficiently. By connecting Java Swing and MySQL, we can store data in a single database, simplifying system administration.

I chose Java because it has been part of my curriculum for the past four years. Java's Object-Oriented Programming (OOP) features make developing programs in NetBeans IDE easier. Java is platform-independent, ensuring that the program functions correctly across different operating systems. Java JFrame components, such as buttons and drop-down menus, facilitate a user-friendly Graphic User Interface (GUI), making the feedback process straightforward for users. Furthermore, OOP in Java will help create an extensible, reusable, and flexible project due to techniques like polymorphism and abstraction. Data structures like arrays, ArrayList, and LinkedList in Java will aid in storing feedback scores for each teacher. This will help in generating feedback reports for the coordinator. Additionally, libraries like Aspose and JFree Chart will make coding more efficient. Therefore, Java is ideal for building this program.

### Defining Success Criteria
- Allow only authorized personnel to access the system.
- Allow users to access functionalities depending on their account type.
- Enable students to enter feedback for teachers.
- Allow the coordinator to add or remove students or teachers.
- Allow the coordinator to view the teachers and students in the database.
- Enable the coordinator to view the results of particular teachers in tabular and graphical forms and suggestions in tabular format.
- Allow coordinators and students to change their passwords.
- Send an email to users if they forget their password, including their username and password.
- Allow the coordinator to view suggestions in a tabular format.
- Enable students to add suggestions.
