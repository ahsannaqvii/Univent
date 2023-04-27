package com.univent.services;

import java.util.List;
import java.util.UUID;

import com.univent.models.Registration;

public interface EventRegistration {
    UUID getId();
    List<Registration> getRegistration();

}
