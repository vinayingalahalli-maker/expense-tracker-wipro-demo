package com.expensetracker.repository;

import com.expensetracker.entity.Claim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
    Page<Claim> findByUserId(String userId, Pageable pageable);
    Page<Claim> findByStatus(Claim.ClaimStatus status, Pageable pageable);
}
