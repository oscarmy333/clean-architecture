package com.d4i.clean.infraestructure.delivery.rest;

import java.io.Serial;
import java.io.Serializable;

import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRest implements Serializable {

    @Serial
    private static final long serialVersionUID = 7809559376441998463L;

    @NotNull
    private String name;

    @NotNull
    private Boolean available;
}
