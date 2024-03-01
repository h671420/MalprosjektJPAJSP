package no.hvl.malprosjekt.entities;

import jakarta.persistence.*;

/**
 * Entitetsklasse representerer en tekststreng.
 */
@Entity
@Table(schema = "malprosjekt",name = "teststringtablename")
public class TestString {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String string;

    public TestString(String data){
        this.string=data;
    }

    public TestString() {}
    public String getString(){return string;}
}
