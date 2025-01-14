package com.co.develop.rojinsky.meets.services;

import com.co.develop.rojinsky.meets.auth.AuthResponse;
import com.co.develop.rojinsky.meets.auth.LoginRequest;
import com.co.develop.rojinsky.meets.auth.RegisterRequest;
import com.co.develop.rojinsky.meets.data.PeopleRepository;
import com.co.develop.rojinsky.meets.models.People;
import com.co.develop.rojinsky.meets.utils.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final PeopleRepository peopleRepository;
    private final JwtService jwtService;
    public AuthResponse login(LoginRequest request){
        return null;
    };
    public AuthResponse register(RegisterRequest request){
        People people = People.builder()
                .username(request.getUser())
                .name(request.getName())
                .lastname(request.getLastname())
                .pass("1234")
                .country(request.getCountry())
                .role(Role.USER)
                .build();

        peopleRepository.save(people);
        return AuthResponse.builder().token(jwtService.getToken(people)).build();
    };
}
