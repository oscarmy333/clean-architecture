package com.d4i.clean.core.category;

import java.io.Serializable;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;


import com.d4i.clean.core.shared.SelfValidating;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Category extends SelfValidating<Category> implements Serializable {

    @Min(0)
    private Long id;

    @NotEmpty
    private String name;

    private Boolean available;


}
