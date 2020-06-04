package com.cloudcomputing.nhatro.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "ad")
public class Ad implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Long adId;

    @Column(name = "title")
    private String title;

    @Column(name = "published")
    private Timestamp published;

    @Column(name = "resourceUrl")
    private String resourceUrl;

    @Column(name = "content")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "contactId", referencedColumnName = "contactId")
    private Contact contact;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "bedsitId", referencedColumnName = "bedsitId")
    private Bedsit bedsit;
}
