@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	// Напиши код здесь
    
    assertEquals("Результат неверный. Должен быть true, но сейчас: ", true, isAdult);
}