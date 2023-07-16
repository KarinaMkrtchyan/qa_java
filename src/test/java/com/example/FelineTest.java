package com.example;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void getFamilyReturnCorrectValue() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensInputReturnCorrectValue() {
        Feline feline = new Feline();
        int expectedCount = 5;
        assertEquals(5, feline.getKittens(expectedCount));
    }

    @Test
    public void getKittensReturnCorrectValue() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void eatMeatReturnCorrectValue() throws Exception {
        Feline feline = new Feline();
        assertEquals(feline.getFood("Хищник"), feline.eatMeat());
}
}
