package egovframework.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.test.service.DbcpConnectionService;

@Service("dbcpConnectionService")
public class DbcpConnectionServiceImpl implements DbcpConnectionService {

	@Resource(name = "dbcpConnectionServiceMapper")
	private DbcpConnectionServiceMapper dbcpConnectionServiceMapper;
	
	@Override
	public int getResult() {
		return dbcpConnectionServiceMapper.getResult();
	}
}
