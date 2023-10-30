package com.nagarro.lil.wisdompet.data.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.ToString;

@Entity
@Table(name = "CUSTOMERS")
@Data
@ToString
public class CustomerEntity {
    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ADDRESS")
    private String address;
}
