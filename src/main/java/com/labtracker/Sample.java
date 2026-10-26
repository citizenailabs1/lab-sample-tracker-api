package com.labtracker;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "samples")
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sampleCode;
    private String sampleType;
    private String projectName;
    private LocalDate collectedDate;
    private String status;
    private String storageLocation;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getSampleCode() { return sampleCode; }
    public void setSampleCode(String sampleCode) { this.sampleCode = sampleCode; }
    public String getSampleType() { return sampleType; }
    public void setSampleType(String sampleType) { this.sampleType = sampleType; }
    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }
    public LocalDate getCollectedDate() { return collectedDate; }
    public void setCollectedDate(LocalDate collectedDate) { this.collectedDate = collectedDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getStorageLocation() { return storageLocation; }
    public void setStorageLocation(String storageLocation) { this.storageLocation = storageLocation; }
}
