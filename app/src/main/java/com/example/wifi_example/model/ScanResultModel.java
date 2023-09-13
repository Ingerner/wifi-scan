package com.example.wifi_example.model;

public class ScanResultModel {

    private String BSSID;
    private String SSID;
    private String capabilities;

    public String getBSSID() {
        return BSSID;
    }

    public void setBSSID(String BSSID) {
        this.BSSID = BSSID;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    public ScanResultModel(String BSSID, String SSID, String capabilities) {
        this.BSSID = BSSID;
        this.SSID = SSID;
        this.capabilities = capabilities;
    }
}
