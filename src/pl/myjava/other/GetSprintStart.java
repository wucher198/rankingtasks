package pl.myjava.other;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.WeekFields;
import java.util.GregorianCalendar;

/**
 * Algorytm do wyliczania nazwy sprintu.
 * Sprint zaczyna sie w srode i trwa 2 tygodnie.
 * Dane wejsciowe albo poczatek pierwszego sprintu albo
 * to ze zaczynaja sie w parzysty tydzien + 
 * data dla ktorej trzeba wyliczyc nazwe sprintu
 * @author maciej.smolka
 *
 */

public class GetSprintStart {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2017, Month.FEBRUARY, 10);
//		WeekFields.
	}
}
