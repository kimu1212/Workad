package com.example.workad.Repository;

import com.example.workad.Entity.Clerk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClerkRepository extends JpaRepository <Clerk, Integer>{
}
