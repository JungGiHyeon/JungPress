package project.common.service.common.commonUser.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import project.common.service.common.commonUser.CommonUserService;
import project.common.util.commonDAO.CommonDAO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@Service("commonUserService")
public class CommonUserServiceImpl extends AbstractServiceImpl implements CommonUserService {
	@Resource(name="commonDAO")
	private CommonDAO commonDAO;
	
	public Map selectUser(Map commandMap) throws Exception {
		return (Map) commonDAO.select("commonUser.selectUser", commandMap);
	}
}