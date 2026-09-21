package com.coedWathhossam.Spring_jpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coedWathhossam.Spring_jpa.Model.Player;
import com.coedWathhossam.Spring_jpa.repo.PlayerRepository;

@SpringBootTest
class SpringJpaApplicationTests {
	@Autowired
	private PlayerRepository repository; //

	@Test
	public void testSevePlayer() {
		
		Player player=new Player();
		player.setId(1l);
		player.setName("hossam");
		player.setScore(100);
		
		repository.save(player); //كده انا بعت البيانتات لي قاعده البياتات و متعبي كمان 
		
		Player SavedPlayer = repository.findById(1l).get(); // اللي مرتبط بي قاعده البيانات  Player دي وله لا ترجع الداله دي الرد كا كائن واخزنو في كائن من الكلاس   Id استخدامت الداله دي هتروح تشوف في لاعب متسجل بي ال  repository.findById(1) وله لا  Save باكد هل هو عمل 
		assertNotNull (SavedPlayer); //معنها شوف المتغير دي فاضي وله لا المفروض ميكنش فاضي علشان انا مخزن في قيم اهو 
	}

}
