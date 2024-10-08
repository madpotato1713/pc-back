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

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lguplus.pc.dto.ExampleDto;
import com.lguplus.pc.entity.ExampleEntity;
import com.lguplus.pc.repository.ExampleRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Transactional
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {

	private final ExampleRepository exampleRepository;

	@Override
	public List<ExampleDto> getAllEmployees() {

		return exampleRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public ExampleDto updateEmployee(ExampleDto employee) {
		return convertToDTO(exampleRepository.save(convertToEntity(employee)));
	}
	
	@Override
	public List<ExampleDto> findByPosition(String position) {
		return exampleRepository.findByPosition(position).stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public ExampleDto convertToDTO(ExampleEntity employee) {
		ExampleDto employeeDTO = ExampleDto.builder()
									.id(employee.getId())
									.name(employee.getName())
									.position(employee.getPosition())
									.build();

		return employeeDTO;
	}

	@Override
	public ExampleEntity convertToEntity(ExampleDto employee) {
		ExampleEntity entity = ExampleEntity.builder()
									.id(employee.getId())
									.name(employee.getName())
									.position(employee.getPosition())
									.build();
		
		return entity;
	}
}
