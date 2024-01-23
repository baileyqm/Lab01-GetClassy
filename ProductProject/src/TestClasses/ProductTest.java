import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product p1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        p1 = new  Product("000003", "Wine", "Woodland Elf Wine", 400.00);
    }

    @org.junit.jupiter.api.Test
    void setName() {
        p1.setName("Test Name");
        assertEquals("Test Name", p1.getName());
    }

    @org.junit.jupiter.api.Test
    void setDescription() {
        p1.setDescription("Ur mom");
        assertEquals("Ur mom", p1.getDescription());
    }

    @org.junit.jupiter.api.Test
    void setCost() {
        p1.setCost(90.09);
        assertEquals(90.09,p1.getCost());
    }

}