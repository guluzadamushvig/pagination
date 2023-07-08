package com.example.pagination.model.criteria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCriteria {
    private Integer ageFrom;
    private Integer ageTo;
    private String birthPlace;
    private LocalDateTime createdDate;
}
