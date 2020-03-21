package dad.javafx.liga;

import java.time.LocalDate;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Equipo {
	private StringProperty nombre;
	private IntegerProperty miembros;
	private ObjectProperty<LocalDate> fundacion;
	private BooleanProperty inscrito;

	public Equipo() {
		nombre = new SimpleStringProperty(this, "nombre");
		miembros = new SimpleIntegerProperty(this, "miembros");
		fundacion = new SimpleObjectProperty<>(this, "fundacion");
		inscrito = new SimpleBooleanProperty(this, "inscrito");
	}

	public StringProperty nombreProperty() {
		return this.nombre;
	}

	public String getNombre() {
		return this.nombreProperty().get();
	}

	public void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}

	public IntegerProperty miembrosProperty() {
		return this.miembros;
	}

	public int getMiembros() {
		return this.miembrosProperty().get();
	}

	public void setMiembros(final int miembros) {
		this.miembrosProperty().set(miembros);
	}

	public ObjectProperty<LocalDate> fundacionProperty() {
		return this.fundacion;
	}

	public LocalDate getFundacion() {
		return this.fundacionProperty().get();
	}

	public void setFundacion(final LocalDate fundacion) {
		this.fundacionProperty().set(fundacion);
	}

	public BooleanProperty inscritoProperty() {
		return this.inscrito;
	}

	public boolean isInscrito() {
		return this.inscritoProperty().get();
	}

	public void setInscrito(final boolean inscrito) {
		this.inscritoProperty().set(inscrito);
	}

}
