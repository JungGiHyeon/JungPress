package project.common.service.common.commonCode;

import java.util.List;
import java.util.Map;

/**
 * Common Code Service
 * 
 * @FileName	: CommonCodeService.java
 * @Project		: JungPress
 * @Date		: 2018. 6. 25. 
 * @author		: 정기현
 * @history		:
 *	최소생성						정기현	2018. 6. 25.
 */
public interface CommonCodeService {
	/**
	 * 공통 코드 저장
	 * 
	 * @param	Map
	 * @return	int
	 * @throws	Exception
	 */
	public int insertCommonCode(Map commandMap)			throws Exception;
	
	/**
	 * 공통 코드 수정
	 * 
	 * @param	Map
	 * @return	int
	 * @throws	Exception
	 */
	public int updateCommonCode(Map commandMap)			throws Exception;
	
	/**
	 * 공통 코드 삭제
	 * 
	 * @param	Map
	 * @return	int
	 * @throws	Exception
	 */
	public int deleteCommonCode(Map commandMap)			throws Exception;
	
	/**
	 * 공통 코드 조회
	 * 
	 * @param	Map
	 * @return	Map
	 * @throws	Exception
	 */
	public Map selectCommonCode(Map commandMap)			throws Exception;
	
	/**
	 * 공통 코드 리스트 조회
	 * 
	 * @param	Map
	 * @return	List
	 * @throws	Exception
	 */
	public List selectCommonCodeList(Map commandMap)	throws Exception;
	
	/**
	 * 공통 코드 건수 조회
	 * 
	 * @param	int
	 * @return	Map
	 * @throws	Exception
	 */
	public int selectCodeCnt(Map commandMap)			throws Exception;
}