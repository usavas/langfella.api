package com.appicient.langfella;

import com.appicient.langfella.domain.language.Language;
import com.appicient.langfella.domain.words.Translation;
import com.appicient.langfella.domain.words.Word;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LangfellaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void first_domain_test_for_project(){
		Language spanish = new Language("es", "Espanol");
		Language english = new Language("en", "English");

		Word word = new Word("hombre", spanish);
		word.addTranslation(new Translation(english, "man"));
		word.addExampleSentence("Un hombre entra en un coche.");

		assertEquals("hombre man", word.toString());
	}

}
