package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", length=11)
	private int id;
	
	@Column(name="USUARIO", length=45)
	private String user;
	
	@Column(name="PASSWORD", length=45)
	private String pass;
	
	@Column(name="NIVEL", length=11)
	private int level;
}
