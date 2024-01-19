package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.entity.LibraryUserEntity;

public interface LibraryRepository extends JpaRepository<LibraryUserEntity, String> {
	LibraryUserEntity findByUserId(String userId);
}
