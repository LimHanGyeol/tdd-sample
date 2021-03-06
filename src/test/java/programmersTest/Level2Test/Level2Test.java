package programmerstest.level2test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level2.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Level2Test {

    private MaxAndMin maxAndMin;
    private Tower tower;
    private ExpressOfNumber expressOfNumber;
    private Fibonacci fibonacci;
    private PhoneBook phoneBook;
    private Printer printer;
    private IronBar ironBar;
    private LargestNumber largestNumber;
    private Camoflage camoflage;
    private JadenCase jadenCase;
    private StockPrice stockPrice;


    @BeforeEach
    void setUp() {
        maxAndMin = new MaxAndMin();
        tower = new Tower();
        expressOfNumber = new ExpressOfNumber();
        fibonacci = new Fibonacci();
        phoneBook = new PhoneBook();
        printer = new Printer();
        ironBar = new IronBar();
        largestNumber = new LargestNumber();
        camoflage = new Camoflage();
        jadenCase = new JadenCase();
        stockPrice = new StockPrice();
    }

    @Test
    public void getMaxAndMin() {
        assertThat(maxAndMin.getMaxMin("1 2 3 4"), is("1 4"));
        assertThat(maxAndMin.getMaxMin("-1 -2 -3 -4"), is("-4 -1"));
        assertThat(maxAndMin.getMaxMin("-1 -1"), is("-1 -1"));
    }

    @Test
    public void getTower() {
        assertThat(tower.getTower(new int[]{6, 9, 5, 7, 4}), is(new int[]{0, 0, 2, 2, 4}));
        assertThat(tower.getTower(new int[]{3, 9, 9, 3, 5, 7, 2}), is(new int[]{0, 0, 0, 3, 3, 3, 6}));
        assertThat(tower.getTower(new int[]{1, 5, 3, 6, 7, 6, 5}), is(new int[]{0, 0, 2, 0, 0, 5, 6}));
    }

    @Test
    public void getExpressOfNumberTest() {
        assertThat(expressOfNumber.getExpressOfNumber(15), is(4));
    }

    @Test
    public void getFibonacciTest() {
        assertThat(fibonacci.getFibonacci(5), is(5));
        assertThat(fibonacci.getFibonacci(3), is(2));
        assertThat(fibonacci.getFibonacci(10), is(55));
    }

    @Test
    public void getPhoneBookCheckTest() {
        assertThat(phoneBook.getPhoneBookCheck(new String[]{"119", "97674223", "1195524421"}), is(false));
        assertThat(phoneBook.getPhoneBookCheck(new String[]{"123", "456", "789"}), is(true));
        assertThat(phoneBook.getPhoneBookCheck(new String[]{"12", "123", "1235", "567", "88"}), is(false));
        assertThat(phoneBook.getPhoneBookCheck(new String[]{"010", "7299", "7258", "11", "88"}), is(false));
        assertThat(phoneBook.getPhoneBookCheck(new String[]{"010", "4351", "235", "11", "43"}), is(false));
        assertThat(phoneBook.getPhoneBookCheck(new String[]{"82", "123456", "12345", "72"}), is(false));
    }

    @Test
    public void getPrinterTest() {
//        assertThat(printer.getPrinter(new int[]{2, 1, 3, 2}, 2), is(1));
        assertThat(printer.getPrinter(new int[]{1, 1, 9, 1, 1, 1}, 0), is(5));
    }

    @Test
    public void getIronBarTest() {
        assertThat(ironBar.getIronBar("()(((()())(())()))(())"), is(17));
    }

    @Test
    public void getLargestTest() {
        assertThat(largestNumber.getLargestNumber(new int[]{6, 10, 2}), is("6210"));
        assertThat(largestNumber.getLargestNumber(new int[]{3, 30, 34, 5, 9}), is("9534330"));
    }

    @Test
    public void getCamoflageTest() {
        assertThat(camoflage.getSolution(
                new String[][]
                        {{"yellow_hat", "haedgear"}
                                , {"blue_sunglasses", "eyewear"}
                                , {"green_turban", "haedgear"}})
                , is(5));
    }

    @Test
    public void getJadenCaseTest() {
        assertThat(jadenCase.getJadenCase1("3people unFollowed me"), is("3people Unfollowed Me"));
        assertThat(jadenCase.getJadenCase1("for the last week"), is("For The Last Week"));
        assertThat(jadenCase.getJadenCase1("lim Han GyEol"), is("Lim Han Gyeol"));
        assertThat(jadenCase.getJadenCase1("95Lim 21Han GyEol"), is("95lim 21han Gyeol"));
    }

    @Test
    public void getJadenCase2Test() {
        assertThat(jadenCase.getJadenCase2("3people unFollowed me"), is("3people Unfollowed Me"));
        assertThat(jadenCase.getJadenCase2("for the last week"), is("For The Last Week"));
        assertThat(jadenCase.getJadenCase2("lim Han GyEol"), is("Lim Han Gyeol"));
        assertThat(jadenCase.getJadenCase2("95Lim 21Han GyEol"), is("95lim 21han Gyeol"));
    }

    @Test
    public void getStockPriceTest() {
        assertThat(StockPrice.getStockPrice(new int[]{1, 2, 3, 2, 3}), is(new int[]{4, 3, 1, 1, 0}));
    }
}
