package dad.javafx.liga;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Liga {
	private StringProperty nombre;
	private ListProperty<Equipo> equipos;
	private ListProperty<Partido> partidos;
	
	public Liga() {
		nombre = new SimpleStringProperty(this, "nombre");
		equipos = new SimpleListProperty<>(this, "equipos", FXCollections.observableArrayList());
		partidos = new SimpleListProperty<>(this, "partidos", FXCollections.observableArrayList());
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
	

	public ListProperty<Equipo> equiposProperty() {
		return this.equipos;
	}
	

	public ObservableList<Equipo> getEquipos() {
		return this.equiposProperty().get();
	}
	

	public void setEquipos(final ObservableList<Equipo> equipos) {
		this.equiposProperty().set(equipos);
	}
	

	public ListProperty<Partido> partidosProperty() {
		return this.partidos;
	}
	

	public ObservableList<Partido> getPartidos() {
		return this.partidosProperty().get();
	}
	

	public void setPartidos(final ObservableList<Partido> partidos) {
		this.partidosProperty().set(partidos);
	}
	

	
	
}
