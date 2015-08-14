package co.com.cursoangular.application.adapter.converter;

import org.springframework.beans.BeanUtils;

public abstract class AbstractAdapter {

	static public void copy(Object origen, Object destino) {

		if (origen == null)
			return;

		else if (destino == null)
			throw new IllegalArgumentException(
					"El destino es nulo pero su origen no, posible perdida de ingormación. "
							+ origen.getClass());

		BeanUtils.copyProperties(origen, destino);
	}
}