package com.omerfaruksahin.allianzcase.dto.response.campaignResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChangeLogResponseDto {

    private boolean situation;

    private LocalDateTime dateTime;



}
