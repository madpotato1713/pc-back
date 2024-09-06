/**
* @packageName	: com.lguplus.pc.repository
* @fileName		: ExampleRepository.java
* @author		: 83474
* @date			: 2024.08.22
* @description	:
* ===========================================================
* DATE              AUTHOR             NOTE
* -----------------------------------------------------------
* 2024.08.22        83474       	최초 생성
*/
package com.lguplus.pc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lguplus.pc.entity.ExampleEntity;

@Repository
public interface ExampleRepository extends JpaRepository<ExampleEntity, Long>{

	List<ExampleEntity> findByPosition(String position); 
}
