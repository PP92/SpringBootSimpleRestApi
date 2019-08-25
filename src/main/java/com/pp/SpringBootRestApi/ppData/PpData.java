package com.pp.SpringBootRestApi.ppData;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "PP_Data")
public class PpData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    @NotEmpty(message = "Please provide a name")
    private String name;
}
