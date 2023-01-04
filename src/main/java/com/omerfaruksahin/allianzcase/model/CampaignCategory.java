package com.omerfaruksahin.allianzcase.model;


public enum CampaignCategory {
    TSS("TAMAMLAYICI_SAGLIK_SIGORTASI",false),
    OSS("OZEL_SAGLIK_SIGORTASI",false),
    HS("OZEL_SAGLIK_SIGORTASI",true),
    DIGER("DIGER",false);

    private String abbreviation;

    private boolean active;

    CampaignCategory(String abbreviation, boolean active) {
        this.abbreviation = abbreviation;
        this.active = active;
    }


    public String getAbbreviation() {
        return abbreviation;
    }

    public boolean isActive() {
        return active;
    }
}
