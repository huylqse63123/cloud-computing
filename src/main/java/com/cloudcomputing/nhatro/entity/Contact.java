package com.cloudcomputing.nhatro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contact")
public class Contact implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "contact_id", length = 11)
    private int contactId;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone", length = 12)
    private String phone;

    @JsonIgnore
    @OneToMany(mappedBy = "contact")
    private Collection<Ad> ads;
}
