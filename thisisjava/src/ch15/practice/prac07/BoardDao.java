package ch15.practice.prac07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<>();
		for(int i=1; i<4; i++) {
			list.add(new Board("제목"+i,"내용"+i));
		}
		return list;
	}

}
