package com.ho.test.entity.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="JPA_BEGIN")
@AllArgsConstructor @Setter @Getter
public class User {

    @Id
    private String email;

    private String name;

    @Column(name = "create_date")
    private Date createDate;

    protected User(){}


}
