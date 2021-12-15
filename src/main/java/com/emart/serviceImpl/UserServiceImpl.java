package com.emart.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.dto.UserDto;
import com.emart.entity.User;
import com.emart.repository.UserRepository;
import com.emart.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String registerUser(UserDto userDto) {
		if(userRepository.findByNameOrMobileNo(userDto.getName(), userDto.getMobileNo())== null) {
			User user = new User();
			BeanUtils.copyProperties(userDto, user);
			userRepository.save(user);
			return "saved";					
		}
		else
			return "user's name or mobile no already exists";
	}

}
