package org.codetime.elearning.auth;

import java.util.List;

public interface AuthGroupRepository {

    List<AuthGroup> findByUsername(String username);

}
