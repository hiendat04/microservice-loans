package com.microservice.loans.service;

import com.microservice.loans.dto.LoansDto;

public interface ILoansService {

    void createLoan(String mobileNumber);

    LoansDto fetchLoan(String mobileNumber, String correlationId);

    boolean updateLoan(LoansDto loansDto);

    boolean deleteLoan(String mobileNumber);
}