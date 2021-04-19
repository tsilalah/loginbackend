package silalahi.login.backend.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import silalahi.login.backend.utils.User;

@RestController
@RequestMapping("/api")
public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    @Qualifier("sessionUser")
    User user;

    @PostMapping(value= "/nickname", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> setNickname(@RequestBody String nickname) {
        user.setNickname(nickname);
        logger.info("Set Nickname " + nickname);
        return ResponseEntity.ok(user.getNickname());
    }

    @PostMapping(value= "/counter", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> incrementCounter() {
        user.setCounter(user.getCounter() + 1);
        logger.info("Increment counter to " + user.getCounter());
        return ResponseEntity.ok(user.getCounter());
    }
}
