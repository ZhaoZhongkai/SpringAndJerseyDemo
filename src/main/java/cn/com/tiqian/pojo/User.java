package cn.com.tiqian.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User implements Serializable {
	private String name;

	private String tel;

	private String email;

	private String age;

	private String sex;

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	@XmlAttribute(name = "name")
	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute(name = "tel")
	public void setTel(String tel) {
		this.tel = tel;
	}

	@XmlAttribute(name = "email")
	public void setEmail(String email) {
		this.email = email;
	}

	@XmlAttribute(name = "age")
	public void setAge(String age) {
		this.age = age;
	}

	@XmlAttribute(name = "sex")
	public void setSex(String sex) {
		this.sex = sex;
	}

}
