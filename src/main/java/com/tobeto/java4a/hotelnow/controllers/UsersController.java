package com.tobeto.java4a.hotelnow.controllers;

import com.tobeto.java4a.hotelnow.services.abstracts.UserService;
import com.tobeto.java4a.hotelnow.services.dtos.requests.users.AddUserRequest;
import com.tobeto.java4a.hotelnow.services.dtos.requests.users.UpdateUserRequest;
import com.tobeto.java4a.hotelnow.services.dtos.responses.users.AddUserResponse;
import com.tobeto.java4a.hotelnow.services.dtos.responses.users.ListUserResponse;
import com.tobeto.java4a.hotelnow.services.dtos.responses.users.UpdateUserResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UsersController {

    private UserService userService;

    @GetMapping
    public List<ListUserResponse> getAll() {
        return userService.getAll();

    }

    @GetMapping("/{id}")
    public ListUserResponse getById(@PathVariable int id) {
        return userService.getResponseById(id);

    }

    @PostMapping("/create-user")
    @ResponseStatus(HttpStatus.CREATED)
    public AddUserResponse add(@RequestBody @Valid AddUserRequest request) {
        return  userService.add(request);

    }

    @PutMapping("/update-user")
    public UpdateUserResponse update(@RequestBody @Valid UpdateUserRequest request){
        return userService.update(request);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {userService.delete(id);}

}
