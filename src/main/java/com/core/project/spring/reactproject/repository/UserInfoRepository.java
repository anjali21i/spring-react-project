package com.core.project.spring.reactproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.project.spring.reactproject.entitybean.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

}
