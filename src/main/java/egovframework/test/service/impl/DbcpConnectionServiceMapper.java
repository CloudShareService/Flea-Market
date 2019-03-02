package egovframework.test.service.impl;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("dbcpConnectionServiceMapper")
public interface DbcpConnectionServiceMapper {

	public int getResult();
}
