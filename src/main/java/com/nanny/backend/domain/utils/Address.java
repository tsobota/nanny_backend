
package com.nanny.backend.domain.utils;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Address extends BaseEntity {
    private String streetName;
    private String homeNumber;
}