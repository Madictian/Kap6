import static org.junit.jupiter.api.Assertions.*;

class Opg6_7Test {

    @org.junit.jupiter.api.Test
    /*void investmentValue() {
        double futureAmount = Opg6_7.investmentValue(1000, (0.09 / 12), 30);
        assertEquals((int)14730.57, (int)futureAmount);
    }*/
    void investmentValue() {
        double futureAmount = Opg6_7.investmentValue(10000, (0.05 / 12), 5);
        assertEquals(12833, (int)futureAmount);
    }
}