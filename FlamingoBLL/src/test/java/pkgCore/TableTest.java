package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import pkgEnum.eGameType;

public class TableTest {

	@Test
	public void test() {
		Table tableTest = new Table();
		
		assertNotNull(tableTest);
		
		tableTest.CreateDeck(eGameType.BLACKJACK);
		
		
		Player pl1 = new Player("jake", 87);
		Player pl2 = new Player("travis", 95);
		
		tableTest.AddPlayerToTable(pl1);
		assertEquals(tableTest.GetPlayerFromTable(pl1), pl1);
		
		tableTest.AddPlayerToTable(pl2);
		assertEquals(tableTest.GetPlayerFromTable(pl2), pl2);
		
		tableTest.RemovePlayerFromTable(pl2);
		assertNull(tableTest.GetPlayerFromTable(pl2));
		
		tableTest.ClearTable();
		assert(tableTest.GetHashMap().size() == 0);
		
		HashMap h1 = tableTest.GetHashMap();
		
		List<Player> l1 = new ArrayList<Player>(h1.values());
		
		l1.toString();
	}

}
