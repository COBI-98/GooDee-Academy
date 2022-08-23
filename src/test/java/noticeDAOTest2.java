import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

import com.esh.home.MyAbstractTest;
import com.esh.start.board.impl.BoardDTO;
import com.esh.start.board.notice.NoticeDAO;
import com.esh.start.board.notice.NoticeDTO;


public class noticeDAOTest2 extends MyAbstractTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getListTest() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
	
		int result= noticeDAO.setadd(noticeDTO);
		
		List<BoardDTO> ar = noticeDAO.getList();
		
		assertNotEquals(0, result);
	}
	

	
	

}
