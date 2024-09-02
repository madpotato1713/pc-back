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

import com.lguplus.pc.dto.ExampleDTO;
import com.lguplus.pc.entity.Example;

public interface ExampleService {

	List<ExampleDTO> getAllEmployees();
	
	ExampleDTO getEmployeeById(Long id);
	
	ExampleDTO createEmployee(ExampleDTO employeeDto);
	
	ExampleDTO convertToDTO(Example employee);
	
//	Example convertToEntity(ExampleDTO employeeDto);
}
