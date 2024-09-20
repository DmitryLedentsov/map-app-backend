package org.study.grabli_application.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;

@Entity
@Table(name = "street_object", schema = "grabli_schema")
@Data // FIXME
@EqualsAndHashCode(of = {"id"}) // FIXME
public class StreetObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id", nullable = false)
    private StreetObjectType type;

    @Column(columnDefinition = "geometry(point, 4326)", name = "location", nullable = false)
    private Point location;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image", nullable = false, unique = true)
    private String image;

    @Column(name = "creator_name", nullable = false)
    private String creatorName;

    @Column(name = "creator_contact", nullable = false)
    private String creatorContact;

    @Column(name = "approved")
    private Boolean approved;
}
