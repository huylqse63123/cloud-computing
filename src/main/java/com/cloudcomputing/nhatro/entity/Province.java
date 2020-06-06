package com.cloudcomputing.nhatro.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "province")
public class Province {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "province_id", length = 11)
    private int provinceId;

    @Column(name = "province_name", length = 45)
    private String province_name;

    @OneToMany(mappedBy = "province")
    private Collection<Bedsit> bedsits;
}
