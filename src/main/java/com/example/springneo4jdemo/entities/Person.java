package com.example.springneo4jdemo.entities;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by scottmcallister on 2018-03-19.
 */
@NodeEntity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Person() {}

    public Person(String name) {
        this.name = name;
    }

    public void worksWith(Person person) {
        if (teammates == null) {
            teammates = new HashSet<>();
        }
        teammates.add(person);
    }

    @Relationship(type = "TEAMMATE", direction = Relationship.UNDIRECTED)
    public Set<Person> teammates;

    public String toString() {

        return this.name + "'s teammates => "
                + Optional.ofNullable(this.teammates).orElse(
                Collections.emptySet()).stream()
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
