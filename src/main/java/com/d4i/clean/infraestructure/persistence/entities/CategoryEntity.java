package com.d4i.clean.infraestructure.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "CATEGORY", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 4471777119419172870L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categorySeq")
    @SequenceGenerator(name = "categorySeq", sequenceName = "category_id_seq", allocationSize = 1, schema = "public")
    private Long id;

    @Column(name = "NAME", unique = true)
    private String name;

    @Column(name = "AVAILABLE")
    private Boolean available;

}
