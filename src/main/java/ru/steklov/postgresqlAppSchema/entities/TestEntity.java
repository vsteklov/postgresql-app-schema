package ru.steklov.postgresqlAppSchema.entities;

import javax.persistence.*;

@Entity
@Table(name="testtable")
public class TestEntity {

    @Id
    long id;

    String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
