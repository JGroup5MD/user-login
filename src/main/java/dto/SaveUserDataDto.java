package dto;

import java.util.Objects;

public class SaveUserDataDto {
    private UserRoles roles;
    private UserDataDto userDataDto;

    public SaveUserDataDto(UserRoles roles, UserDataDto userDataDto) {
        this.roles = roles;
        this.userDataDto = userDataDto;
    }

    public SaveUserDataDto(UserDataDto userDataDto) {
        this.roles = roles;
        this.userDataDto = userDataDto;
    }

    public UserRoles getRoles() {
        return roles;
    }

    public void setRoles(UserRoles roles) {
        this.roles = roles;
    }

    public UserDataDto getUserDataDto() {
        return userDataDto;
    }

    public void setUserDataDto(UserDataDto userDataDto) {
        this.userDataDto = userDataDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveUserDataDto that = (SaveUserDataDto) o;
        return roles == that.roles && Objects.equals(userDataDto, that.userDataDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roles, userDataDto);
    }

    @Override
    public String toString() {
        return "SaveUserDataDto{" +
                "roles=" + roles +
                ", userDataDto=" + userDataDto +
                '}';
    }
}
