package ru.ugrasu.portfolio.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ugrasu.tableDB.User;

/**
 * Created by Марсель on 01.10.2017.
 */
@RestController
public class PostController {
    @RequestMapping(value = "/")
    public ResponseEntity<User> get(){

        User user = new User();
        user.setFname("Fatkullin");
        user.setName("Marsel");
        user.setLname("Samatovich");

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<User> update(){
        User user = new User();
        user.setFname("Fatkullin");
        user.setLname("Samatovich");
        user.setName("Marsel" + "Developer");

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
