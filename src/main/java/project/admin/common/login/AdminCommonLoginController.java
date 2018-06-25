package project.admin.common.login;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import project.admin.common.main.AdminCommonlMainController;
import project.common.service.common.commonUser.CommonUserService;
import egovframework.rte.ptl.mvc.bind.annotation.CommandMap;

@Controller
public class AdminCommonLoginController {
    @Resource(name = "commonUserService")
    private CommonUserService commonUserService;
    
	AdminCommonlMainController adminCommonlMainController	= new AdminCommonlMainController();		//AdminCommonlMainController
	
    protected Log log										= LogFactory.getLog(this.getClass());	//log
    MappingJacksonJsonView ajaxView							= new MappingJacksonJsonView();			//ajax
    
    /**
   	 * 관리자 로그인 페이지
     * @param request
     * @param commandMap
     * @return
     */
	@RequestMapping(value={"/admin/common/login/login.do"})
	public String login(HttpServletRequest request, ModelMap model, @CommandMap Map commandMap) {
    	log.debug("============================================================");
    	log.debug("== AdminCommonLoginController.login ========================");
    	log.debug("============================================================");
    	
        return "/admin/common/login/login";
	}
    
   	/**
   	 * 관리자 로그인 처리
     * @param request
     * @param commandMap
     * @return
   	 */
	@RequestMapping(value={"/admin/common/login/loginProc.do"})
   	public String loginProc(HttpServletRequest request, ModelMap model, @CommandMap Map commandMap) {
       	log.debug("============================================================");
       	log.debug("== AdminCommonLoginController.loginProc ====================");
    	log.debug("============================================================");
       	
       	String returnPage = "";
       	
       	try {
       		Map userMap = commonUserService.selectUser(commandMap);
       		
        	log.debug("============================================================");
        	log.debug("============================================================");
        	log.debug("== userEmail	: " + userMap.get("userEmail")	);
       		log.debug("== userName	: " + userMap.get("userName")	);
       		log.debug("== zipcode	: " + userMap.get("zipcode")	);
       		log.debug("== addr1		: " + userMap.get("addr1")		);
       		log.debug("== addr2		: " + userMap.get("addr2")		);
       		log.debug("== phone		: " + userMap.get("phone")		);
       		log.debug("== userClass	: " + userMap.get("userClass")	);
        	log.debug("============================================================");
        	log.debug("============================================================");
        	
       		
   			if ("".equals(userMap.get("userEmail").toString()) || userMap.get("userEmail").toString() == null) {
       	        model.addAttribute("resultMsg",	"로그인 정보가 없습니다.");
       			returnPage = login(request, model, commandMap);
       		} else {
       			if ("USER".equals(userMap.get("userClass").toString())) {
       		        model.addAttribute("resultMsg",	"접근 권한이 없습니다.");
       				returnPage = login(request, model, commandMap);
       			} else {
       		        model.addAttribute("resultMsg",	"로그인 되었습니다.");
       				returnPage = adminCommonlMainController.main(request, model, commandMap);
       			}
       		}
		} catch (Exception e) {
	    	log.debug("============================================================");
	       	log.debug("== AdminCommonLoginController.loginProc ====================");
	    	log.debug("== Exception : " + e);
	    	log.debug("============================================================");
	    	
			model.addAttribute("resultMsg",	"오류가 발생하였습니다.");
			
	        return "/admin/common/login/login";
		}
       	
       	return returnPage;
   	}
}