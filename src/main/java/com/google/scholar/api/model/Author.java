package com.google.scholar.api.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    @Column(name = "affiliation_name")
    private String affiliation;

    private String interests;

    @Column(name = "num_citations")
    private Integer numCitations;

    // Getters and setters

}
