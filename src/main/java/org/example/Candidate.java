package org.example;
import java.util.ArrayList;
import java.util.List;

public class Candidate {
    private String fullName;
    private String email;
    private String phone;
    private String university;
    private String photoPath;
    private List<Experience> experiences;

    public Candidate(String fullName, String email, String phone, String university, String photoPath) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.university = university;
        this.photoPath = photoPath;
        this.experiences = new ArrayList<>();
    }

    public void addExperience(Experience experience) {
        this.experiences.add(experience);
    }

    // Getter metotları
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getUniversity() { return university; }
    public String getPhotoPath() { return photoPath; }
    public List<Experience> getExperiences() { return experiences; }
}