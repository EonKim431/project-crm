package com.gsitm.projectcrm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsitm.projectcrm.dto.CustomerDto;
import com.gsitm.projectcrm.dto.TestDto;
import com.gsitm.projectcrm.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService service;
	
	
	@GetMapping("/cust")
	public String customView() {
		return "customerView";
	}
	
//	@PostMapping("/searchAjax")
//	@ResponseBody
//	public CustomerDto getListAdmin(@RequestBody Map<String, String> body) {
//		String keyword = body.get("keyword");
//		System.out.println("keyword = " + keyword);
////		List<AdminDto> adminDtos = adminService.searchAdminOne(keyword);
//		List<CustomerDto> dtos = new ArrayList<>();
////		dtos = service.list();
////		System.out.println(dtos.toString());
////		body.put("a_id", "admin");
//		
//			CustomerDto dto = new CustomerDto();
//			dto.setCUST_SN((long)1);
//			dto.setCUST_NM(String.valueOf(1));
//			dto.setCR_NM(String.valueOf(1));
//			
//		
//		
//		return dto;
//	}
////	@PostMapping("/searchAjax")
////	@ResponseBody
////	public List<CustomerDto> getListAdmin(@RequestBody Map<String, String> body) {
////		String keyword = body.get("keyword");
////		System.out.println("keyword = " + keyword);
//////		List<AdminDto> adminDtos = adminService.searchAdminOne(keyword);
////		List<CustomerDto> dtos = new ArrayList<>();
//////		dtos = service.list();
//////		System.out.println(dtos.toString());
//////		body.put("a_id", "admin");
////		for(int i = 0 ; i < 10 ; i++) {
////			CustomerDto dto = new CustomerDto();
////			dto.setCUST_NM(String.valueOf(i));
////			dtos.add(dto);
////		}
////		
////		return dtos;
////	}
//	
////	@PostMapping("/searchOneAjax")
////	@ResponseBody
////	public List<AdminDto> getOneListAdmin(@RequestBody Map<String, String> body) {
////		String keyword = body.get("keyword");
////		System.out.println("keyword = " + keyword);
////	
////		List<AdminDto> adminDtos = adminService.searchAdminOne(keyword);
////		System.out.println(adminDtos.toString());
////		return adminDtos;
////	}
//	
//    @PostMapping("/goTest")
//    @ResponseBody
//    public TestDto goTest(@RequestBody TestDto body) {
//    	String keyword = body.getPlayer();
//        System.out.println("player = " + keyword);
//        return body;
//    }
}
