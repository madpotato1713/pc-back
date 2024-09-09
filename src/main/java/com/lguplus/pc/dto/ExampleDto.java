/**
* @packageName	: com.lguplus.pc.dto
* @fileName		: ExampleDto.java
* @author		: 83474
* @date			: 2024.09.09
* @description	:
* ===========================================================
* DATE              AUTHOR             NOTE
* -----------------------------------------------------------
* 2024.09.09        83474       	최초 생성
*/
package com.lguplus.pc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExampleDto {

	long id;
    String name;
    String position;
}
