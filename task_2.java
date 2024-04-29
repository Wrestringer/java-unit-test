@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}

// Напиши код здесь

@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(8);
    assertEquals("Должно вернуться false, так как пользователь НЕсовершеннолетний", false, isAdult);
}


@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals("Должно вернуться true, так как пользователю ровно 18", true, isAdult);
}