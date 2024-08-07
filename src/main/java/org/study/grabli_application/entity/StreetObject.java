package org.study.grabli_application.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
@Table(name = "street_object", schema = "grabli_schema")
@Data
@EqualsAndHashCode(of = {"id"})
public class StreetObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id", nullable = false)
    private StreetObjectType type;

    @Formula("ST_AsGeoJSON(coordinate)")
    private String coordinate;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "creator_name", nullable = false)
    private String creatorName;

    @Column(name = "creator_contact", nullable = false)
    private String creatorContact;

    @Column(name = "approved")
    private Boolean approved;
}
