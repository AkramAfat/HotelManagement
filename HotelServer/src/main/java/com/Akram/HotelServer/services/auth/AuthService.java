package com.Akram.HotelServer.services.auth;

import com.Akram.HotelServer.dto.SignupRequest;
import com.Akram.HotelServer.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupRequest signupRequest); 
}
