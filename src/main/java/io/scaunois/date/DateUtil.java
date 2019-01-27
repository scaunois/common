package io.scaunois.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * 
 * Classe utilitaire pour gérer des LocalDate / LocalDateTime (et d'éventuelles
 * conversions vers/depuis des java.util.Date)
 * 
 * @author scaunois
 *
 */
public final class DateUtil {

	// présent pour empêcher l'instanciation de cette classe (en empêchant Java de
	// créer un constructeur par défaut qui serait public)
	private DateUtil() {

	}

	/**
	 * Crée une {@code java.time.LocalDate} à partir d'une {@code java.util.Date}
	 * 
	 * @param date une {@code java.util.Date} à convertir en
	 *             {@code java.time.LocalDate}
	 * @return La {@code java.time.LocalDate} créée
	 */
	public static LocalDate toLocalDate(Date date) {
		return (date == null) ? null : date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	/**
	 * Crée une {@code java.time.LocalDateTime} à partir d'une
	 * {@code java.util.Date}
	 * 
	 * @param date une {@code java.util.Date} à convertir en
	 *             {@code java.time.LocalDateTime}
	 * @return La {@code java.time.LocalDateTime} créée
	 */
	public static LocalDateTime toLocalDateTime(Date date) {
		return (date == null) ? null : date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	/**
	 * Crée une {@code java.util.Date} à partir d'une
	 * {@code java.time.LocalDateTime}.
	 * 
	 * @param date une {@code java.time.LocalDateTime} à convertir en
	 *             {@code java.util.Date}.
	 * @return La {@code java.util.Datee} créée.
	 */
	public static Date toDate(LocalDateTime localDateTime) {
		return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}

}
