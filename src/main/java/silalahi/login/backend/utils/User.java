package silalahi.login.backend.utils;

import java.io.Serializable;

public class User implements Serializable {
    String nickname;
    Integer counter;

    public User(String nickname, Integer counter) {
        this.nickname = nickname;
        this.counter = counter;
    }

    public String getNickname() { return nickname; }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}
