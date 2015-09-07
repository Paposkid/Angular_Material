
public class XXXXXXXAdapter extends AbstractAdapter {

	
	private XXXXXXXAdapter() {

	}

	public static XXXXXXXEntity toPersistence(XXXXXXX origen) {

		if (origen == null)
			return null;

		XXXXXXXEntity destino = new XXXXXXXEntity();

		copy(origen, destino);

		return destino;
	}

	public static XXXXXXX toCore(XXXXXXXEntity origen) {

		if (origen == null)
			return null;

		XXXXXXX destino = new XXXXXXX();

		copy(origen, destino);

		return destino;
	}

	public static XXXXXXX toCore(XXXXXXXRest origen) {

		if (origen == null)
			return null;

		XXXXXXX destino = new XXXXXXX();

		copy(origen, destino);

		return destino;
	}

	public static XXXXXXXRest toRest(XXXXXXX origen) {

		if (origen == null)
			return null;

		XXXXXXXRest destino = new XXXXXXXRest();

		copy(origen, destino);

		return destino;
	}

	public static XXXXXXXRest toRest(XXXXXXXEntity origen) {

		if (origen == null)
			return null;

		XXXXXXXRest destino = new XXXXXXXRest();

		copy(origen, destino);

		return destino;
	}

	public static Collection<XXXXXXXRest> toRest(Collection<XXXXXXX> origen) {

		Collection<XXXXXXXRest> destino = new ArrayList<>();

		for (XXXXXXX bloque2 : origen) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}

	public static Collection<XXXXXXX> toCore(Collection<XXXXXXXEntity> origenes) {

		Collection<XXXXXXX> destino = new ArrayList<>();

		for (XXXXXXXEntity bloque2 : origenes) {

			destino.add(toCore(bloque2));
		}

		return destino;
	}

	public static Collection<XXXXXXXRest> toRestC(Collection<XXXXXXXEntity> origenes) {

		Collection<XXXXXXXRest> destino = new ArrayList<>();

		for (XXXXXXXEntity bloque2 : origenes) {

			destino.add(toRest(bloque2));
		}

		return destino;
	}
}