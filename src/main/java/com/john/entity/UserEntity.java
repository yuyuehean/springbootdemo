package com.john.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name = "user_table")
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String id;
	private String name;
	private String age;
	private String aiHao;
	private String xingQu;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAiHao() {
		return aiHao;
	}
	public void setAiHao(String aiHao) {
		this.aiHao = aiHao;
	}
	public String getXingQu() {
		return xingQu;
	}
	public void setXingQu(String xingQu) {
		this.xingQu = xingQu;
	}
	
	
	
	
	
	
}
