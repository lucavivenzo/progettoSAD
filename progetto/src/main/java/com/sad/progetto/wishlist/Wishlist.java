package com.sad.progetto.wishlist;

import com.sad.progetto.event.Event;
import com.sad.progetto.present.Present;
import com.sad.progetto.appUser.AppUser;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Wishlist {
    @Id
    @SequenceGenerator(name="wishlistSequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wishlistSequence")
    private Long id;
    private String name;
    private String description;
    private Integer size;
    @OneToMany
    private Set<Event> events;
    @ManyToOne
    @JoinColumn
    private AppUser owner;
    @OneToMany
    private Set<Present> presents;

    public Wishlist() {
    }

    public Wishlist(String name, String description, Integer size, Set<Event> events, AppUser owner, Set<Present> presents) {
        this.name = name;
        this.description = description;
        this.size = size;
        this.events = events;
        this.owner = owner;
        this.presents = presents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public AppUser getOwner() {
        return owner;
    }

    public void setOwner(AppUser owner) {
        this.owner = owner;
    }

    public Set<Present> getPresents() {
        return presents;
    }

    public void setPresents(Set<Present> presents) {
        this.presents = presents;
    }
}
