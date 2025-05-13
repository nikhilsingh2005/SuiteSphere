package com.nikhil.suitesphere.services;

import com.nikhil.suitesphere.dtos.LoginRequest;
import com.nikhil.suitesphere.dtos.RegistrationRequest;
import com.nikhil.suitesphere.dtos.Response;
import com.nikhil.suitesphere.dtos.UserDTO;
import com.nikhil.suitesphere.entities.User;

public interface UserService {

    Response registerUser(RegistrationRequest registrationRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    Response getOwnAccountDetails();

    User getCurrentLoggedInUser();

    Response updateOwnAccount(UserDTO userDTO);

    Response deleteOwnAccount();

    Response getMyBookingHistory();
}

