package web.service.api;

import web.dto.NewUserDto;

import java.util.List;

public interface IRegistrationService {
    void save(NewUserDto user);

    List<NewUserDto> get();
}
