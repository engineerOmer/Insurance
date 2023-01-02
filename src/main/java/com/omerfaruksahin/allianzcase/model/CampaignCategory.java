package com.omerfaruksahin.allianzcase.model;


public enum CampaignCategory {
    TAMAMLAYICI_SAGLIK_SIGORTASI("TSS",false),
    OZEL_SAGLIK_SIGORTASI("OSS",false),
    HAYAT_SIGORTASI("HS",true),DIGER("DIGER",false);

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
