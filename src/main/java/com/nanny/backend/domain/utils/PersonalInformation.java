package com.nanny.backend.domain.utils;

import com.nanny.backend.domain.User;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Data
@Table(	name = "personal_information",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "email")
        })
public class PersonalInformation extends BaseEntity {
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToOne(mappedBy = "personalInformation")
    private User user;

}