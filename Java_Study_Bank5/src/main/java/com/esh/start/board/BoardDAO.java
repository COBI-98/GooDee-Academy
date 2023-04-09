package com.esh.start.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.esh.start.bankbook.BankBookDTO;
import com.esh.start.util.DBConnector;

public class BoardDAO {

	
	public ArrayList<BoardDTO> getList() throws Exception{
		ArrayList<BoardDTO> ar = new ArrayList<BoardDTO>();
		Connection con = DBConnector.getConnetion();
		
		String sql = "select*from board order by boardNum desc";
		
		PreparedStatement st = con.prepareStatement(sql);
		

		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BoardDTO boardDTO = new BoardDTO();
			
			boardDTO.setBoardNum(rs.getLong("BOARDNUM"));
			boardDTO.setTitle(rs.getString("TITLE"));
			boardDTO.setContent(rs.getString("CONTENT"));
			boardDTO.setWriter(rs.getString("WRITER"));
			boardDTO.setBoardDate(rs.getDate("BOARDDATE"));
			boardDTO.setHits(rs.getLong("HITS"));
			ar.add(boardDTO);
		}
		
		
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
	}
	
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception{
		Connection con = DBConnector.getConnetion();
		
		String sql = "SELECT * FROM BOARD WHERE BOARDNUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, boardDTO.getBoardNum());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			boardDTO = new BoardDTO();
			boardDTO.setBoardNum(rs.getLong("BOARDNUM"));
			boardDTO.setTitle(rs.getString("TITLE"));
			boardDTO.setContent(rs.getString("CONTENT"));
			boardDTO.setWriter(rs.getString("WRITER"));
			boardDTO.setBoardDate(rs.getDate("BOARDDATE"));
			boardDTO.setHits(rs.getLong("HITS"));			
		}
		
		
		
		DBConnector.disConnect(rs, st, con);
		
		return boardDTO;
	}
	
	public int add(BoardDTO boardDTO) throws Exception{
		Connection con = DBConnector.getConnetion();
		
		String sql = "Insert into board "
				+ "values (board_seq.NEXTVAL, ?,?,?,SYSDATE,0)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, boardDTO.getTitle());
		st.setString(2, boardDTO.getContent());
		st.setString(3, boardDTO.getWriter());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
		
		
	}
	
	public int setDelete(BoardDTO boardDTO) throws Exception{
		
		Connection con = DBConnector.getConnetion();
		
		String sql = "delete board where board.boardnum = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, boardDTO.getBoardNum());
		
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
	}
	
	public int setUpdate(BoardDTO boardDTO) throws Exception{
		
		Connection con = DBConnector.getConnetion();
		
		String sql = "UPDATE BOARD SET TITLE=?, CONTENT=? WHERE BOARDNUM =?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, boardDTO.getTitle());
		st.setString(2, boardDTO.getContent());
		st.setLong(3, boardDTO.getBoardNum());
		
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
	}
	
	
}
