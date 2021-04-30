package com.desertbeetle.githubjob.model;

/**
 * The model class of each job.
 */
public class Job {
    //
    // Instance Variables
    //
    String id;
    String type;
    String createdAt;
    String company;
    String location;
    String title;
    String description;
    String howToApply;
    String companyLogoUrl;

    //
    // Constructor
    //
    public Job(String id) {
        this.id = id;
    }


    //
    // Public methods
    //

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHowToApply() {
        return howToApply;
    }

    public void setHowToApply(String howToApply) {
        this.howToApply = howToApply;
    }

    public String getCompanyLogoUrl() {
        return companyLogoUrl;
    }

    public void setCompanyLogoUrl(String companyLogoUrl) {
        this.companyLogoUrl = companyLogoUrl;
    }

    public boolean descriptionMatchesLang(String lang) {
        return description != null && description.contains(lang);
    }

    @Override
    public String toString() {
        return "Job{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", howToApply='" + howToApply + '\'' +
                ", companyLogoUrl='" + companyLogoUrl + '\'' +
                '}';
    }
}
