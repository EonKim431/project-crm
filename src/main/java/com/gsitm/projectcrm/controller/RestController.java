package com.gsitm.projectcrm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsitm.projectcrm.dto.CustomerDto;
import com.gsitm.projectcrm.dto.TestDto;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@PostMapping("/searchAjax")
	@ResponseBody
	public List<CustomerDto> getListAdmin(@RequestBody Map<String, String> body) {
		String keyword = body.get("keyword");
		System.out.println("keyword = " + keyword);
//		List<AdminDto> adminDtos = adminService.searchAdminOne(keyword);
		List<CustomerDto> dtos = new ArrayList<>();
//		dtos = service.list();
//		System.out.println(dtos.toString());
//		body.put("a_id", "admin");
		for (int i = 0; i < 10 ; i++) {
			CustomerDto dto = new CustomerDto();
			dto.setCUST_SN((long)i);
			dto.setCUST_NM(String.valueOf(i+10));
			dto.setCR_NM(String.valueOf(i));
			dtos.add(dto);
		}

		return dtos;
	}
	@PostMapping("/searchAllAjax")
	@ResponseBody
	public List<CustomerDto> getListAllAdmin(@RequestBody Map<String, String> body) {
//		List<AdminDto> adminDtos = adminService.searchAdminOne(keyword);
		List<CustomerDto> dtos = new ArrayList<>();
//		dtos = service.list();
//		System.out.println(dtos.toString());
//		body.put("a_id", "admin");
		for (int i = 0; i < 10 ; i++) {
			CustomerDto dto = new CustomerDto();
			dto.setCUST_SN((long)i);
			dto.setCUST_NM(String.valueOf(i+10));
			dto.setCR_NM(String.valueOf(i));
			dtos.add(dto);
		}
		
		return dtos;
	}
//	@PostMapping("/searchAjax")
//	@ResponseBody
//	public List<CustomerDto> getListAdmin(@RequestBody Map<String, String> body) {
//		String keyword = body.get("keyword");
//		System.out.println("keyword = " + keyword);
////		List<AdminDto> adminDtos = adminService.searchAdminOne(keyword);
//		List<CustomerDto> dtos = new ArrayList<>();
////		dtos = service.list();
////		System.out.println(dtos.toString());
////		body.put("a_id", "admin");
//		for(int i = 0 ; i < 10 ; i++) {
//			CustomerDto dto = new CustomerDto();
//			dto.setCUST_NM(String.valueOf(i));
//			dtos.add(dto);
//		}
//		
//		return dtos;
//	}
	
//	@PostMapping("/searchOneAjax")
//	@ResponseBody
//	public List<AdminDto> getOneListAdmin(@RequestBody Map<String, String> body) {
//		String keyword = body.get("keyword");
//		System.out.println("keyword = " + keyword);
//	
//		List<AdminDto> adminDtos = adminService.searchAdminOne(keyword);
//		System.out.println(adminDtos.toString());
//		return adminDtos;
//	}
	

	@PostMapping("/searchOneAjax")
	@ResponseBody
	public CustomerDto getOneListAdmin(@RequestBody Map<String, String> body) {
		String keyword = body.get("keyword");
		System.out.println("keyword = " + keyword);
	
		CustomerDto dto = new CustomerDto();
//		adminDtos = service.searchAdminOne(keyword);
		dto.setCUST_NM("aaaa");
		System.out.println(dto.toString());
		return dto;
	}
}
