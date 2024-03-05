package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {


    public int result = 0;

    @BeforeAll
    public void initialize() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void setup(){
        System.out.println("Before each");
    }

    @AfterEach
    public void methodCleanUp(){
        System.out.println("After each is called");
    }

    @AfterAll
    public void classCleanup(){
        System.out.println("After all is called");
    }





    @Test
    void tambah10() {
        int angka = 10;
        Calculator calculator = new Calculator(result, angka);
        result = calculator.tambah();
        Assertions.assertEquals(10, result);
    }

    @Test
    void kali() {
        int angka = 10;
        Calculator calculator = new Calculator(result, angka);
        result = calculator.kali();
        Assertions.assertEquals(100, result);
    }

//    @Test
//    void kurang() {
//    }
//
//    @Test
//    void bagi() {
//    }
//
//    @Test
//    void pangkat() {
//    }
}