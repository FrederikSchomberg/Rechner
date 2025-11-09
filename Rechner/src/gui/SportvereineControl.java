package gui;

import java.io.IOException;
import business.SportvereineModel;
import javafx.stage.Stage;

public class SportvereineControl {
	private SportvereineModel sportModel;
	private SportvereineView sportView;

	public SportvereineControl(Stage primaryStage) {
		this.sportModel = new SportvereineModel();
		this.sportView = new SportvereineView(this, primaryStage, sportModel);
	}

	public void leseAusDatei(String typ) {

		try {
			if ("csv".equals(typ)) {
				sportModel.leseAusDatei(typ);
				sportView.zeigeInformationsfensterAn("Der Sportverein wurde gelesen!");
			} else {
				sportModel.leseAusDatei(typ);
				sportView.zeigeInformationsfensterAn("Erfolgreich implementiert!");
			}
		} catch (IOException exc) {
			sportView.zeigeFehlermeldungsfensterAn("IOException beim Lesen!");
		} catch (Exception exc) {
			sportView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Lesen!");
		}
	}

	public void schreibeSportvereineInCsvDatei() {
		try {
			sportModel.schreibeSportvereineInCsvDatei();
			sportView.zeigeInformationsfensterAn("Die Sportvereine wurden gespeichert!");
		} catch (IOException exc) {
			sportView.zeigeFehlermeldungsfensterAn("IOException beim Speichern!");
		} catch (Exception exc) {
			sportView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!");
		}
	}
}