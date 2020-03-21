package dad.javafx.liga;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Equipo equipo1 = new Equipo();
		equipo1.setNombre("Los minikitos");
		equipo1.setFundacion(LocalDate.now());
		equipo1.setInscrito(true);
		equipo1.setMiembros(16);
		
		Equipo equipo2 = new Equipo();
		equipo2.setNombre("Los asirnados");
		equipo2.setFundacion(LocalDate.of(2016, 8, 1));
		equipo2.setInscrito(false);
		equipo2.setMiembros(2);

		Equipo equipo3 = new Equipo();
		equipo3.setNombre("Los smyrriados");
		equipo3.setFundacion(LocalDate.of(2016, 8, 1).plusDays(15));
		equipo3.setInscrito(true);
		equipo3.setMiembros(145);
		
		Partido partido1 = new Partido();
		partido1.setFecha(LocalDate.now().minusMonths(1));
		partido1.setLocal(equipo1);
		partido1.setVisitante(equipo3);
		partido1.setResultado(new Resultado());
		partido1.getResultado().setPuntosLocal(100.456);
		partido1.getResultado().setPuntosVisitante(Math.PI);
		
		Liga liga = new Liga();
		liga.setNombre("Mentos");
		liga.getEquipos().addAll(equipo1, equipo2, equipo3);
		liga.getPartidos().addAll(partido1);
		
	}

}
