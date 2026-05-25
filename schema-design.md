# Smart Clinic Management System - Database Schema

## Doctors Table

| Field Name      | Data Type      | Constraints |
|-----------------|---------------|-------------|
| doctor_id       | INT           | PRIMARY KEY, AUTO_INCREMENT |
| name            | VARCHAR(100)  | NOT NULL |
| specialization  | VARCHAR(100)  | NOT NULL |
| email           | VARCHAR(100)  | UNIQUE |
| phone           | VARCHAR(20)   | NOT NULL |

---

## Patients Table

| Field Name      | Data Type      | Constraints |
|-----------------|---------------|-------------|
| patient_id      | INT           | PRIMARY KEY, AUTO_INCREMENT |
| name            | VARCHAR(100)  | NOT NULL |
| age             | INT           | NOT NULL |
| gender          | VARCHAR(10)   | NOT NULL |
| contact         | VARCHAR(20)   | NOT NULL |

---

## Appointments Table

| Field Name      | Data Type      | Constraints |
|-----------------|---------------|-------------|
| appointment_id  | INT           | PRIMARY KEY, AUTO_INCREMENT |
| doctor_id       | INT           | FOREIGN KEY REFERENCES Doctors(doctor_id) |
| patient_id      | INT           | FOREIGN KEY REFERENCES Patients(patient_id) |
| appointment_date| DATETIME      | NOT NULL |
| status          | VARCHAR(20)   | NOT NULL |

---

## Prescriptions Table

| Field Name       | Data Type      | Constraints |
|------------------|---------------|-------------|
| prescription_id  | INT           | PRIMARY KEY, AUTO_INCREMENT |
| appointment_id   | INT           | FOREIGN KEY REFERENCES Appointments(appointment_id) |
| medicine         | VARCHAR(100)  | NOT NULL |
| dosage           | VARCHAR(100)  | NOT NULL |
| notes            | TEXT          | NULL |
