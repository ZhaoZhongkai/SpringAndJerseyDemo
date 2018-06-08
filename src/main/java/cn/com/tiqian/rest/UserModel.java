package cn.com.tiqian.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.com.tiqian.pojo.User;
import cn.com.tiqian.service.UserService;

@Path("/api/user")
public class UserModel {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@GET
	@Path("/userInfo")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findUserInfo(@QueryParam("id") String id) {
		System.out.println("***findUserInfo id = " + id);

		User user = new User();
		user.setName("god");
		user.setAge("99");
		user.setEmail("123@123.com");

		userService.getUserInfo();

		return Response.ok(user).build();

	}

}
