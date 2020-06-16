package com.cloudcomputing.nhatro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad")
public class Ad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "ad_id", length = 11)
    private int adId;

    @Column(name = "title", length = 45)
    private String title;

    @Column(name = "published")
    private Timestamp published;

    @Column(name = "resource_url", length = 500)
    private String resourceUrl;

    @Column(name = "content", length = 1000)
    private String content;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    private Contact contact;

    @JsonIgnore
    @OneToMany(mappedBy = "ad")
    private Set<Bedsit> bedsits;
}
