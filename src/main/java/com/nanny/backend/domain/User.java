package com.nanny.backend.domain;

import com.nanny.backend.domain.utils.BaseEntity;
import com.nanny.backend.domain.utils.PersonalInformation;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
public class User extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_information_id", referencedColumnName = "id")
    private PersonalInformation personalInformation;
}
