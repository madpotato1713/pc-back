/**
* @packageName	: com.lguplus.pc.service
* @fileName		: ExampleServiceImpl.java
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
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lguplus.pc.dto.ExampleDTO;
import com.lguplus.pc.entity.Example;
import com.lguplus.pc.repository.ExampleRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ExampleServiceImpl implements ExampleService {
	
	@Autowired
	private ExampleRepository exampleRepository;
	
	@Override
	public List<ExampleDTO> getAllEmployees() {
		
		return exampleRepository.findAll().stream()
				.map(this::convertToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public ExampleDTO getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExampleDTO createEmployee(ExampleDTO employeeDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExampleDTO convertToDTO(Example employee) {
		ExampleDTO employeeDTO = new ExampleDTO();
		
        employeeDTO.setId(employee.getId());
        employeeDTO.setName(employee.getName());
        employeeDTO.setPosition(employee.getPosition());
        
        return employeeDTO;
	}
}
