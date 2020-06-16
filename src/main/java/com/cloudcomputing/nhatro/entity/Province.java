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
@Table(name = "province")
public class Province implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "province_id", length = 11)
    private int provinceId;

    @Column(name = "province_name", length = 45)
    private String province_name;

    @JsonIgnore
    @OneToMany(mappedBy = "province")
    private Collection<Bedsit> bedsits;
}
