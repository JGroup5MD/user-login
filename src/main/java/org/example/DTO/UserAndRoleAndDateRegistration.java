package org.example.DTO;

import java.time.LocalDate;
import java.util.Objects;

public class UserAndRoleAndDateRegistration {
    private UserDTO userDTO;
    private UserRole role;
    private LocalDate timeRegistration;

    public UserAndRoleAndDateRegistration(UserDTO userDTO, UserRole role, LocalDate timeRegistration) {
        this.userDTO = userDTO;
        this.role = role;
        this.timeRegistration =LocalDate.now();
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public LocalDate getTimeRegistration() {
        return timeRegistration;
    }

    public void setTimeRegistration(LocalDate timeRegistration) {
        this.timeRegistration = timeRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAndRoleAndDateRegistration that = (UserAndRoleAndDateRegistration) o;
        return Objects.equals(userDTO, that.userDTO) && role == that.role && Objects.equals(timeRegistration, that.timeRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userDTO, role, timeRegistration);
    }

    @Override
    public String toString() {
        return "UserAndRoleAndDateRegistration{" +
                "userDTO=" + userDTO +
                ", role=" + role +
                ", timeRegistration=" + timeRegistration +
                '}';
    }
}

