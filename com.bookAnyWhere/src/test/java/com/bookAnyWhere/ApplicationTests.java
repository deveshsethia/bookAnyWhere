package com.bookAnyWhere;

import com.bookAnyWhere.models.Train;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void testTrainclass() {
		Train train = new Train();
		String passCoachName= train.getTrainCoaches().get("AC")[0].getCoachNumber();

        assertEquals("AC1",passCoachName);
	}

}
