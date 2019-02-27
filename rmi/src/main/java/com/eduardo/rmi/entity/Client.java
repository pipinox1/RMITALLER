package com.eduardo.rmi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Client implements Serializable {
	
	@Id
	private Long id;

}
