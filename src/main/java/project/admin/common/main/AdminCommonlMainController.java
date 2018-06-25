package project.admin.common.main;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import egovframework.rte.ptl.mvc.bind.annotation.CommandMap;

/**
 * @author user
 *
 */
@Controller
public class AdminCommonlMainController {
    protected Log log				= LogFactory.getLog(this.getClass());	//log
    MappingJacksonJsonView ajaxView	= new MappingJacksonJsonView();			//ajax
    
   	/**
   	 * 관리자 메인 페이지
     * @param request
     * @param commandMap
   	 * @param commandMap2 
     * @return
   	 */
	@RequestMapping(value={"/admin/common/main/main.do"})
   	public String main(HttpServletRequest request, ModelMap model, @CommandMap Map commandMap) {
		log.debug("============================================================");
    	log.debug("== AdminCommonlMainController.main =========================");
    	log.debug("============================================================");
    	
       	return "/admin/common/main/main";
   	}
}