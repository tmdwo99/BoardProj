package org.dsu.dc.capston.service;

import java.util.List;

import org.dsu.dc.capston.domain.ApiVO;
import org.dsu.dc.capston.domain.MapVO;

public interface MapService {
	List<MapVO> listAll() throws Exception;
	void register(ApiVO data);
}
