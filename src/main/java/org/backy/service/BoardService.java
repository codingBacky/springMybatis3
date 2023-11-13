package org.backy.service;

import java.util.List;

import org.backy.domain.BoardVO;
import org.backy.domain.Criterial;

public interface BoardService {
	
	//public List<BoardVO> getList();
	public List<BoardVO> getListWithPaging(Criterial cri);
	public BoardVO get(Long bno);
	public void register(BoardVO board);
	public boolean modify(BoardVO board);
	public boolean remove(Long bno);
	public int getTotal(Criterial cri);
	
}
