package com.example.lifestory;

public class User {
    private String userId;
    private String name;
    private String email;
    private String profileImageUrl;

    // חובה שיהיה קונסטרקטור ריק כדי ש-Firebase יוכל להשתמש בו
    public User() {
    }

    public User(String userId, String name, String email, String profileImageUrl) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
    }

    // Getters (שיטות אחזור נתונים)
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    // Setters (שיטות לעדכון נתונים)
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
