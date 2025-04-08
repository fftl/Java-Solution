package dev.fftl.java_solution.parser;

import java.time.LocalDateTime;

public class Statute {
    private Long statuteId;
    private String statuteSerial;
    private String statuteName;
    private String statuteNickname;
    private String statuteCode;
    private LocalDateTime proclaimDate;
    private String proclaimNum;
    private int revisionStatus;
    private LocalDateTime enforcementDate;
    private String statuteLink;

    public Statute(Long statuteId, String statuteSerial, String statuteName, String statuteNickname, String statuteCode, LocalDateTime proclaimDate, String proclaimNum, int revisionStatus, LocalDateTime enforcementDate, String statuteLink) {
        this.statuteId = statuteId;
        this.statuteSerial = statuteSerial;
        this.statuteName = statuteName;
        this.statuteNickname = statuteNickname;
        this.statuteCode = statuteCode;
        this.proclaimDate = proclaimDate;
        this.proclaimNum = proclaimNum;
        this.revisionStatus = revisionStatus;
        this.enforcementDate = enforcementDate;
        this.statuteLink = statuteLink;
    }

    public Long getStatuteId() {
        return statuteId;
    }

    public void setStatuteId(Long statuteId) {
        this.statuteId = statuteId;
    }

    public String getStatuteSerial() {
        return statuteSerial;
    }

    public void setStatuteSerial(String statuteSerial) {
        this.statuteSerial = statuteSerial;
    }

    public String getStatuteName() {
        return statuteName;
    }

    public void setStatuteName(String statuteName) {
        this.statuteName = statuteName;
    }

    public String getStatuteNickname() {
        return statuteNickname;
    }

    public void setStatuteNickname(String statuteNickname) {
        this.statuteNickname = statuteNickname;
    }

    public String getStatuteCode() {
        return statuteCode;
    }

    public void setStatuteCode(String statuteCode) {
        this.statuteCode = statuteCode;
    }

    public LocalDateTime getProclaimDate() {
        return proclaimDate;
    }

    public void setProclaimDate(LocalDateTime proclaimDate) {
        this.proclaimDate = proclaimDate;
    }

    public String getProclaimNum() {
        return proclaimNum;
    }

    public void setProclaimNum(String proclaimNum) {
        this.proclaimNum = proclaimNum;
    }

    public int getRevisionStatus() {
        return revisionStatus;
    }

    public void setRevisionStatus(int revisionStatus) {
        this.revisionStatus = revisionStatus;
    }

    public LocalDateTime getEnforcementDate() {
        return enforcementDate;
    }

    public void setEnforcementDate(LocalDateTime enforcementDate) {
        this.enforcementDate = enforcementDate;
    }

    public String getStatuteLink() {
        return statuteLink;
    }

    public void setStatuteLink(String statuteLink) {
        this.statuteLink = statuteLink;
    }
}
