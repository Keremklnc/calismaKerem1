package edu.sabanciuniv.calismakerem1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String teamName;
    @OneToMany(mappedBy = "team")
    @JsonBackReference
    private List<Player> squad = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team() {
    }
}
