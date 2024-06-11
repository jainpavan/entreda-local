package com.smarsh.entreda.user.service.impl;

import com.smarsh.entreda.user.dto.UserDto;
import com.smarsh.entreda.user.repository.UserRepository;
import com.smarsh.entreda.user.service.UserService;
import com.smarsh.entreda.mapper.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final ObjectMapper objectMapper;

    @Override
    public List<UserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserDto getUserById(int id) {
        return null;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
