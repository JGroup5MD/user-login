package org.example.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class ActivUserSession {
    private String login;
    private String password;
    private UserRole role;
    private LocalDate timeStartSession;

    public ActivUserSession(String login, String password, UserRole role, LocalDate timeStartSession) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.timeStartSession = LocalDate.now();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public LocalDate getTimeStartSession() {
        return timeStartSession;
    }

    public void setTimeStartSession(LocalDate timeStartSession) {
        this.timeStartSession = timeStartSession;
    }
}

