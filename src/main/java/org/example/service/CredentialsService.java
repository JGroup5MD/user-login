package org.example.service;

import org.example.DAO.API.ICredentialsDAO;

public class CredentialsService {
    private final ICredentialsDAO credentialsDAO;

    public CredentialsService(ICredentialsDAO credentialsDAO) {
        this.credentialsDAO = credentialsDAO;
    }
}
