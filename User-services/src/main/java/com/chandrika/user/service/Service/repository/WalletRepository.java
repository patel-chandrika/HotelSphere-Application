package com.chandrika.user.service.Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.chandrika.user.service.Service.entities.Wallet;

@Repository
public interface WalletRepository extends  JpaRepository<Wallet, Integer>, JpaRepositoryImplementation<Wallet, Integer> {
}
