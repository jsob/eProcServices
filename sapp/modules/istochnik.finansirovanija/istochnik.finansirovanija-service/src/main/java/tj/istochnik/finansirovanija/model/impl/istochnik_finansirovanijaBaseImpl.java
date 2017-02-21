/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.istochnik.finansirovanija.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.istochnik.finansirovanija.model.istochnik_finansirovanija;
import tj.istochnik.finansirovanija.service.istochnik_finansirovanijaLocalServiceUtil;

/**
 * The extended model base implementation for the istochnik_finansirovanija service. Represents a row in the &quot;sapp.istochnik_finansirovanija&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link istochnik_finansirovanijaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istochnik_finansirovanijaImpl
 * @see istochnik_finansirovanija
 * @generated
 */
@ProviderType
public abstract class istochnik_finansirovanijaBaseImpl
	extends istochnik_finansirovanijaModelImpl
	implements istochnik_finansirovanija {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a istochnik_finansirovanija model instance should use the {@link istochnik_finansirovanija} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			istochnik_finansirovanijaLocalServiceUtil.addistochnik_finansirovanija(this);
		}
		else {
			istochnik_finansirovanijaLocalServiceUtil.updateistochnik_finansirovanija(this);
		}
	}
}