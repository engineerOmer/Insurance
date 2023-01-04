package com.omerfaruksahin.allianzcase.dto.request.changeLogRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChangeLogListRequestDto {
    private int campaignId;
}
