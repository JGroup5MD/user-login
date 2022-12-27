package web.service.api;

import web.service.UserDetails;

public interface IUserDetails {

    UserDetails loadUserByLogin(String login);
}
