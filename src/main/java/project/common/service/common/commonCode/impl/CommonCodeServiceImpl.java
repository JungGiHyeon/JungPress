package project.common.service.common.commonCode.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import project.common.service.common.commonCode.CommonCodeService;
import project.common.util.commonDAO.CommonDAO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

/**
 * Common Code Service Implements
 * 
 * @FileName	: CommonCodeServiceImpl.java
 * @Project		: JungPress
 * @Date		: 2018. 6. 25. 
 * @author		: 정기현
 * @history		:
 *	최소생성						정기현	2018. 6. 25.
 */
@Service("commonCodeService")
public class CommonCodeServiceImpl extends AbstractServiceImpl implements CommonCodeService {
	@Resource(name="commonDAO")
	private CommonDAO commonDAO;
	
	/**
	 * 공통 코드 저장
	 * 
	 * @param	Map
	 * @return	int
	 * @throws	Exception
	 */
	public int insertCommonCode(Map commandMap) throws Exception {
		return (int) commonDAO.insert ("commonCode.insertCommonCode", commandMap);
	}
	
	/**
	 * 공통 코드 수정
	 * 
	 * @param	Map
	 * @return	int
	 * @throws	Exception
	 */
	public int updateCommonCode(Map commandMap) throws Exception {
		return commonDAO.update ("commonCode.updateCommonCode", commandMap);
	}
	
	/**
	 * 공통 코드 삭제
	 * 
	 * @param	Map
	 * @return	int
	 * @throws	Exception
	 */
	public int deleteCommonCode(Map commandMap) throws Exception {
		return commonDAO.update ("commonCode.deleteCommonCode", commandMap);
	}
	
	/**
	 * 공통 코드 조회
	 * 
	 * @param	Map
	 * @return	Map
	 * @throws	Exception
	 */
	public Map selectCommonCode(Map commandMap) throws Exception {
		return (Map) commonDAO.select ("commonCode.selectCommonCodeDetail", commandMap);
	}
	
	/**
	 * 공통 코드 리스트 조회
	 * 
	 * @param	Map
	 * @return	List
	 * @throws	Exception
	 */
	public List selectCommonCodeList(Map commandMap) throws Exception {
		return commonDAO.selectList ("commonCode.selectCommonCodeList", commandMap);
	}
	
	/**
	 * 공통 코드 건수 조회
	 * 
	 * @param	Map
	 * @return	int
	 * @throws	Exception
	 */
	public int selectCodeCnt(Map commandMap) throws Exception {
		return (int) commonDAO.select ("commonCode.selectCommonCodeCnt", commandMap);
	}
}