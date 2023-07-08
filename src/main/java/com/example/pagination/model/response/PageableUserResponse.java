package com.example.pagination.model.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PageableUserResponse {
    private List<UserResponse> users;
    private int lastPageNumber;
    private long totalElements;
    private boolean hasNextPage;
}
