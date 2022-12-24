package appuser;

import java.util.Collection;

public interface IUserAccount {
public Collection<? extends GrantedAuthority> getAuthorities();

public String getPassword();


}
