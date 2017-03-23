package com.hn.dls.entity;

public class SpecialistAppointmentWithBLOBs extends SpecialistAppointment {
    private String description;

    private String personDesp;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPersonDesp() {
        return personDesp;
    }

    public void setPersonDesp(String personDesp) {
        this.personDesp = personDesp == null ? null : personDesp.trim();
    }
}