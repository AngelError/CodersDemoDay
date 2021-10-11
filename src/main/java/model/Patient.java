package model;

import java.time.LocalDate;
import java.util.Objects;

public class Patient {
    private int id;
    private String fin;
    private String name;
    private String surname;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Patient() {
    }

    public Patient(int id, String fin, String name, String surname, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.fin = fin;
        this.name = name;
        this.surname = surname;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && fin.equals(patient.fin) && name.equals(patient.name) && surname.equals(patient.surname) && createdAt.equals(patient.createdAt) && updatedAt.equals(patient.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fin, name, surname, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", fin='" + fin + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
