package com.learning.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobId;
    private String jobProfile;
    private String jobDescription;
    private Integer requiredExperience;
    @ElementCollection
    private List<String> jobTechStacks;
}
