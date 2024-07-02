package com.onedumall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onedumall.dto.Members;
import com.onedumall.service.MyInfoService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MypageMainController {
	@Autowired
	private MyInfoService myinfoService;


	@GetMapping("/mypage_home")
	public String MypageHome(HttpSession session, Model model) {
		return "mypage_home";
	}


	/* ********************************************************************** */

	@GetMapping("/info")
	public String mypageInfo(HttpSession session, Model model) {
		Members members = (Members) session.getAttribute("loginSession");

		if (members == null) {
			return "redirect:/login";
		}
		model.addAttribute("members", members);
		return "mypage_info";

	}

	// 마이페이지 불러오고 수정하는 GET POST
	@GetMapping("/mypage_infoModify")
	public String infoModify(HttpSession session, Model model) {
		Members members = (Members) session.getAttribute("loginSession");
		log.info("controller  member update : " + members);
		if (members == null) {
			return "redirect:/login";
		}

		model.addAttribute("members", members);
		return "mypage_infoModify";
	}

	@PostMapping("/mypage_infoModify")
	public String updateMember(HttpSession session, Members updateMember) {

		Members members = (Members) session.getAttribute("loginSession");

		if (members == null) {
			return "redirect:/login";
		}

		updateMember.setMembers_id(members.getMembers_id());
		myinfoService.updateMember(updateMember); // 기존내용에서 새로운내용 덮어쓰기
		session.setAttribute("loginSession", updateMember);
		return "redirect:/info";
	}

	/* ********************************************************************** */

	@GetMapping("/pwChange")
	public String MyPwChange(Model model) {
		return "mypage_pwChange";
	}
	
	@PostMapping("/pwChange")
	public String pwChange(HttpSession session,
	                       @RequestParam("newPassword") String newPassword,
	                       Model model) {

	    Members members = (Members) session.getAttribute("loginSession");

	    if (members == null) {
	        return "redirect:/login";
	    }
	 // 비밀번호 변경 처리
	    members.setMembers_pw(newPassword);
	    myinfoService.pwChange(members); // 비밀번호 변경 메소드 호출

	    // 세션에 변경된 회원 정보 저장
	    session.setAttribute("loginSession", members);

	    return "redirect:/mypage_home";
	}



	/* ********************************************************************** */
	@GetMapping("/userDelete")
	public String MyUserDelete(Model model) {
		return "mypage_userDelete";
	}

	@GetMapping("/deleteMember")
	public String deleteMember(HttpSession session) {
		// 현재 로그인이된 세션의 정보를 가지고 와서 멤버정보 조회하는 코드
		Members member = (Members) session.getAttribute("loginSession");

		log.info("controller delete: " + member);
		// 만약에 로그인이 되어있지 않은데 접촉하려한다. 그러면 바로 홈페이지로 돌려보내자
		if (member == null) {
			return "redirect:/login";
		}

		myinfoService.deleteMember(member.getMembers_id());//member_id를 가져와서 삭제
		session.invalidate();// 로그아웃 처리
		return "redirect:/";

	}

}