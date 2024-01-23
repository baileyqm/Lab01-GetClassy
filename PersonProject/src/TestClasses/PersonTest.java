import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         p1 = new Person("000001", "Bob", "Test1", "Sir", 1940);
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        p1.setFirstName("Sammy");
        assertEquals("Sammy", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p1.setLastName("Sammy");
        assertEquals("Sammy", p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p1.setTitle("Esq.");
        assertEquals("Esq.", p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        p1.setYOB(1900);
        assertEquals(1900, p1.getYOB());
    }

}