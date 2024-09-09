/**
* @packageName	: com.lguplus.pc.service
* @fileName		: ExampleService.java
* @author		: 83474
* @date			: 2024.08.22
* @description	:
* ===========================================================
* DATE              AUTHOR             NOTE
* -----------------------------------------------------------
* 2024.08.22        83474       	최초 생성
*/
package com.lguplus.pc.service;

import java.util.List;

import com.lguplus.pc.dto.ExampleDto;
import com.lguplus.pc.entity.ExampleEntity;

public interface ExampleService {

	List<ExampleDto> getAllEmployees();
	
	ExampleDto updateEmployee(ExampleDto employee);
	
	List<ExampleDto> findByPosition(String poistion);
	
	ExampleDto convertToDTO(ExampleEntity employee);
	
	ExampleEntity convertToEntity(ExampleDto employeeDto);
}
