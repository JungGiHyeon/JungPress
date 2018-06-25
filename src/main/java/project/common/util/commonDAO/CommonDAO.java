package project.common.util.commonDAO;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

import egovframework.rte.psl.orm.ibatis.support.SqlMapClientDaoSupport;

@Repository("commonDAO")
public class CommonDAO extends SqlMapClientDaoSupport {
	/**
	 * Annotation	형식으로 sqlMapClient를 받아와 이를 super(SqlMapClientDaoSupport)의 setSqlMapClient 메서드를 호출하여 설정해 준다.
	 * @param		sqlMapClient - ibatis 의 SQL Map 과의 상호작용을 위한 기본 클래스로 mapped statements(select, insert, update, delete 등) 의 실행을 지원함.
	 */
	@Resource(name = "sqlMapClient")
	public void setSuperSqlMapClient(SqlMapClient sqlMapClient) {
		super.setSqlMapClient(sqlMapClient);
	}
	
	/**
	 * 입력 처리 SQL mapping 을 실행한다.
	 * 
	 * @param	queryId			- 입력 처리 SQL mapping 쿼리 ID
	 * @param	parameterObject	- 입력 처리 SQL mapping 입력 데이터를 세팅한 파라메터 객체
	 * @return	입력 시 selectKey를 사용하여 key를 딴 경우 해당 key
	 */
	public Object insert(String queryId, Object parameterObject) {
		return getSqlMapClientTemplate().insert(queryId, parameterObject);
	}
	
	/**
	 * 수정 처리 SQL mapping 을 실행한다.
	 * 
	 * @param	queryId			- 수정 처리 SQL mapping 쿼리 ID
	 * @param	parameterObject	- 수정 처리 SQL mapping 입력 데이터를 세팅한 파라메터 객체
	 * @return	DBMS가 지원하는 경우 update 적용 결과 count
	 */
	public int update(String queryId, Object parameterObject) {
		return getSqlMapClientTemplate().update(queryId, parameterObject);
	}
	
	/**
	 * 삭제 처리 SQL mapping 을 실행한다.
	 * 
	 * @param	queryId			- 삭제 처리 SQL mapping 쿼리 ID
	 * @param	parameterObject	- 삭제 처리 SQL mapping 입력 데이터를 세팅한 파라메터 객체
	 * @return	DBMS가 지원하는 경우 delete 적용 결과 count
	 */
	public int delete(String queryId, Object parameterObject) {
		return getSqlMapClientTemplate().delete(queryId, parameterObject);
	}
	
	/**
	 * 단건 조회 처리 SQL mapping 을 실행한다.
	 * 
	 * @param	queryId			- 단건 조회 처리 SQL mapping 쿼리 ID
	 * @param	parameterObject	- 단건 조회 처리 SQL mapping 입력 데이터를 세팅한 파라메터 객체
	 * @return	단일 조회 결과 객체
	 */
	public Object select(String queryId, Object parameterObject) {
		return getSqlMapClientTemplate().queryForObject(queryId, parameterObject);
	}
	
	/**
	 * 리스트 조회 처리 SQL mapping 을 실행한다.
	 * 
	 * @param	queryId			- 리스트 조회 처리 SQL mapping 쿼리 ID
	 * @param	parameterObject	- 리스트 조회 처리 SQL mapping 입력 데이터를 세팅한 파라메터 객체
	 * @return	리스트 조회 결과 객체
	 */
	public List selectList(String queryId, Object parameterObject) {
        return getSqlMapClientTemplate().queryForList(queryId, parameterObject);
    }
}