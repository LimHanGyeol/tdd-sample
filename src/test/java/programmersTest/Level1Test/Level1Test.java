package programmerstest.level1test;

import programmers.level1.*;
import programmers.level2.CorrectBracket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Level1Test {

    private FirstGradeStudent firstGradeStudent;
    private HateSameNumber hateSameNumber;
    private StringSort stringSort;
    private GymClothes gymClothes;
    private CorrectBracket correctBracket;
    private SumBetweenTwoInteger sumBetweenTwoInteger;
    private Knum knum;

    @BeforeEach
    void setUp() {
        firstGradeStudent = new FirstGradeStudent();
        hateSameNumber = new HateSameNumber();
        stringSort = new StringSort();
        gymClothes = new GymClothes();
        correctBracket = new CorrectBracket();
        sumBetweenTwoInteger = new SumBetweenTwoInteger();
        knum = new Knum();
    }

    @Test
    public void getFirstGradeStudent() {
        assertThat(firstGradeStudent.getFirstGradeStudent(new int[]{1, 2, 3, 4, 5}), is(new int[]{1}));
        assertThat(firstGradeStudent.getFirstGradeStudent(new int[]{1, 3, 2, 4, 2}), is(new int[]{1, 2, 3}));
    }

    @Test
    public void getHateSameNumber() {
        assertThat(hateSameNumber.getHateSameNumber(new int[]{1, 1, 3, 3, 0, 1, 1}), is(new int[]{1, 3, 0, 1}));
        assertThat(hateSameNumber.getHateSameNumber(new int[]{4, 4, 4, 3, 3}), is(new int[]{4, 3}));
    }

    @Test
    public void getStringSortResult() {
        assertThat(stringSort.getStringSortResult(new String[]{"sun", "bed", "car"}, 1), is(new String[]{"car", "bed", "sun"}));;
        assertThat(stringSort.getStringSortResult(new String[]{"abce", "abcd", "cdx"}, 1), is(new String[]{"abcd", "abce", "cdx"}));;
    }

    @Test
    public void getGymClothes() {
        assertThat(gymClothes.getGymClothes(5, new int[]{2, 4}, new int[]{1, 3, 5}), is(5));
//        assertThat(gymClothes.getGymClothes(5, new int[]{2, 4}, new int[]{3}), is(4));
//        assertThat(gymClothes.getGymClothes(3, new int[]{3}, new int[]{1}), is(2));
    }

    @Test
    public void getCorrectBracket() {
        assertThat(correctBracket.getCorrectBracket("()()"), is(true));
        assertThat(correctBracket.getCorrectBracket("(())()"), is(true));
        assertThat(correctBracket.getCorrectBracket(")()("), is(false));
        assertThat(correctBracket.getCorrectBracket("(()("), is(false));
    }

    @Test
    public void getSumBetweenTwoIntegerTest() {
        assertThat(sumBetweenTwoInteger.getSumBetweenTwoInteger(3, 5), is(12));
        assertThat(sumBetweenTwoInteger.getSumBetweenTwoInteger(3, 3), is(3));
        assertThat(sumBetweenTwoInteger.getSumBetweenTwoInteger(5, 3), is(12));
    }

    @Test
    public void getKnumTest() {
        assertThat(knum.getKnumber(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}),is(new int[]{5, 6, 3}));
    }
}
