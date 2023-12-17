import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaMenegerTest {

    AfishaItem item1 = new AfishaItem("film1");
    AfishaItem item2 = new AfishaItem("film2");
    AfishaItem item3 = new AfishaItem("film3");

    @Test
    public void testAddAndGet() {
        AfishaMeneger item = new AfishaMeneger();
        item.add(item1);
        item.add(item2);
        item.add(item3);

        AfishaItem[] expected = {item1, item2, item3};
        AfishaItem[] actual = item.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testResuitlengthLessItems() {
        AfishaMeneger item = new AfishaMeneger();

        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.findLast(2);

        AfishaItem[] expect = {item3, item2};
        AfishaItem[] actual = item.findLast(2);

        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    public void testResuitlengthMoreItems() {
        AfishaMeneger item = new AfishaMeneger();

        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.findLast(5);

        AfishaItem[] expect = {item3, item2, item1};
        AfishaItem[] actual = item.findLast(3);

        Assertions.assertArrayEquals(expect, actual);
    }

    @Test

    public void testNoResuitlength() {
        AfishaMeneger item = new AfishaMeneger();

        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.findLastNoResultLength();

        AfishaItem[] expect = {item3, item2, item1};
        AfishaItem[] actual = item.findLastNoResultLength();

        Assertions.assertArrayEquals(expect, actual);
    }

}
