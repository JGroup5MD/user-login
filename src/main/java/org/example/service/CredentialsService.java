package org.example.service;

import org.example.DAO.API.ICredentialsDAO;

import java.util.ArrayList;
import java.util.List;


public class CredentialsService {
    private  final StatisticsService ss;
    private final ICredentialsDAO credentialsDAO;
    List<CredentialsDAO> list=new ArrayList<>();

    public CredentialsService(StatisticsService ss, ICredentialsDAO credentialsDAO) {
        this.ss = ss;
        this.credentialsDAO = credentialsDAO;
    }


}
