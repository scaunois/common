package io.scaunois.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * 
 * Classe utilitaire pour gérer des LocalDate (et d'éventuelles conversions
 * vers/depuis des java.util.Date)
 * 
 * @author scaunois
 *
 */
public final class LocalDateUtil {

	// présent pour empêcher l'instanciation de cette classe (en empêchant Java de
	// créer un constructeur par défaut qui serait public)
	private LocalDateUtil() {

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

}
