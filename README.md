# Student Management App

This Java project is a simple student management application that allows users to manage student records using a SQL database. Users can create, edit, delete, and view student details through a command-line interface.

## Features

- **Add Student**: Add a new student by providing their name, ID, and other details.
- **Edit Student**: Modify the details of an existing student.
- **Delete Student**: Remove a student record from the database.
- **View All Students**: Display a list of all saved student records.
- **Exit**: Terminate the application.

## Requirements

- Java Development Kit (JDK)
- Apache Maven (for building and managing dependencies)
- MySQL or any SQL-compatible database

## Usage

1. Clone this repository to your local machine:
    ```bash
    git clone https://github.com/momen-saifi/student-management-app.git
    ```

2. Import the project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

3. Set up your SQL database. Modify the `DBConnect.java` file in the `com.conn` package to configure the database connection properties.

4. Compile and run the `mainClass.java` file in the `com.main` package. This will start the student management application.

5. Follow the on-screen instructions to interact with the student management system.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.
