package com.sad.progetto.user;

import com.sad.progetto.friendship.Friendship;
import com.sad.progetto.event.Event;

import java.util.Set;

public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Set<Friendship> friendships;
    private Set<Event> organizedEvents;
    private Set<Event> events;

    public User() {
    }

    public User(String username, String email, String password, Set<Friendship> friendships, Set<Event> organizedEvents, Set<Event> events) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.friendships = friendships;
        this.organizedEvents = organizedEvents;
        this.events = events;
    }

    public Set<Event> getOrganizedEvents() {
        return organizedEvents;
    }

    public void setOrganizedEvents(Set<Event> organizedEvents) {
        this.organizedEvents = organizedEvents;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public Set<Friendship> getFriendships() {
        return friendships;
    }

    public void setFriendships(Set<Friendship> friendships) {
        this.friendships = friendships;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
