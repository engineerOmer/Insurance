package com.omerfaruksahin.allianzcase.dto.response.campaignResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CampaignStatusInformationDto {

    private int active;
    private int deactive;
}
