package cn.com.tiqian.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public String getUserInfo() {
		System.out.println("wawawa");
		return "1";
	}

}
