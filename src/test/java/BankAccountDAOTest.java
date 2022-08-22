
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.esh.home.MyAbstractTest;
import com.esh.start.bankaccount.BankAccountDAO;
import com.esh.start.bankaccount.BankAccountDTO;
import com.esh.start.member.BankMembersDTO;


public class BankAccountDAOTest extends MyAbstractTest {
	
	@Autowired
	private BankAccountDAO bankAccountDAO;
	
	@Test
	public void getListTest()throws Exception{
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		bankMembersDTO.setUserName("ESH");
		List<BankAccountDTO> ar = bankAccountDAO.getListByUserName(bankMembersDTO);
		assertNotEquals(0, ar.size());
	}

}