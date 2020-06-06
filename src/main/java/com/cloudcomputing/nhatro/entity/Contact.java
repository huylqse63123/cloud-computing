package com.cloudcomputing.nhatro.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "contact_id", length = 11)
    private Long contactId;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone", length = 12)
    private String phone;

    @OneToMany(mappedBy = "contact")
    private Collection<Ad> ads;
}
