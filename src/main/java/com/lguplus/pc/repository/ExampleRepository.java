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

import org.springframework.data.jpa.repository.JpaRepository;

import com.lguplus.pc.entity.Example;

public interface ExampleRepository extends JpaRepository<Example, Long>{

}
