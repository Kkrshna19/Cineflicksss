package com.example.CFLICKS.controllers;

import com.example.CFLICKS.models.UserModel;
import com.example.CFLICKS.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> findAllUsers(){
        return userService.findAllUsers();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user){
        return userService.saveUser(user);
    }

    @PutMapping()
    public UserModel updateUser(@RequestBody UserModel user){ return userService.saveUser(user); }

    @GetMapping(path ="/find-by-code")
    public ArrayList<UserModel> findByCode(@RequestParam("code")String code){return userService.findByCode(code);}

    @DeleteMapping(path="{code}")
    public String deleteByCode(@PathVariable("code") String code){
        int respuesta = Integer.parseInt(this.userService.deleteByCode(code));
        if(respuesta==1){return "Se elimino el usuario";}
        else{return "No se elimino el usuario";}
    }
}
