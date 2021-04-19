package silalahi.login.backend.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import silalahi.login.backend.utils.User;

@Configuration
public class UserConfig {
    @Bean("sessionUser")
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public User sessionUser() {
        return new User("", 0);
    }
}
