package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reportcard")
public class ReportCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double marks;

    /*
     * In unidirectional mapping, this class did not have Student reference.
     * Only Student had ReportCard reference.
     */

    /*
     * Bidirectional one-to-one mapping.
     * ReportCard is the inverse side.
     * mappedBy = "reportcard" means the relationship is controlled by
     * the reportcard field present in Student.java.
     */
    @OneToOne(mappedBy = "reportcard")
    private Student student;

    public ReportCard() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ReportCard(double marks) {
        super();
        this.marks = marks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;

        if (student != null && student.getReportcard() != this) {
            student.setReportcard(this);
        }
    }

    @Override
    public String toString() {
        return "ReportCard [id=" + id + ", marks=" + marks + "]";
    }

}

