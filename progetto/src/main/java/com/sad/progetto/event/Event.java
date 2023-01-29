package com.sad.progetto.event;

import com.sad.progetto.appUser.AppUser;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;
@Entity
public class Event {
    @Id
    @SequenceGenerator(name="eventSequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eventSequence")
    private Long id;
    private String name;
    private String description;
    private LocalDate date;
    private String eventAddress;
    @ManyToOne
    @JoinColumn
    private AppUser organizer;
    @OneToMany
    private Set<AppUser> guests;



    public Event() {
    }

    public Event(String name, String description, LocalDate date, String eventAddress, AppUser organizer, Set<AppUser> guests) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.eventAddress = eventAddress;
        this.organizer = organizer;
        this.guests = guests;
    }

    public AppUser getOrganizer() {
        return organizer;
    }

    public void setOrganizer(AppUser organizer) {
        this.organizer = organizer;
    }

    public Set<AppUser> getGuests() {
        return guests;
    }

    public void setGuests(Set<AppUser> guests) {
        this.guests = guests;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }


}
