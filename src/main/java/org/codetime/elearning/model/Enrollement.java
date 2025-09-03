package org.codetime.elearning.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="enrollemnt")
public class Enrollement {

    @Id
    @Column(name = "enrollmentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;

    @Column(name = "date")
    private LocalDate enrollmentDate;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="userId", nullable = false)
    private User username;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "courseId", nullable = false)
    private Course course;

    public Enrollment(LocalDate enrollmentDate, User userName, Course course) {
        this.enrollmentDate = enrollmentDate;
        this.userName = userName;
        this.course = course;
    }


}
