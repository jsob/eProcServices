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

package tj.rezultat.rassmotrenija.pretenzii.model.impl;

import aQute.bnd.annotation.ProviderType;

import tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii;
import tj.rezultat.rassmotrenija.pretenzii.service.rezultat_rassmotrenija_pretenziiLocalServiceUtil;

/**
 * The extended model base implementation for the rezultat_rassmotrenija_pretenzii service. Represents a row in the &quot;sapp.rezultat_rassmotrenija_pretenzii&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link rezultat_rassmotrenija_pretenziiImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_rassmotrenija_pretenziiImpl
 * @see rezultat_rassmotrenija_pretenzii
 * @generated
 */
@ProviderType
public abstract class rezultat_rassmotrenija_pretenziiBaseImpl
	extends rezultat_rassmotrenija_pretenziiModelImpl
	implements rezultat_rassmotrenija_pretenzii {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rezultat_rassmotrenija_pretenzii model instance should use the {@link rezultat_rassmotrenija_pretenzii} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			rezultat_rassmotrenija_pretenziiLocalServiceUtil.addrezultat_rassmotrenija_pretenzii(this);
		}
		else {
			rezultat_rassmotrenija_pretenziiLocalServiceUtil.updaterezultat_rassmotrenija_pretenzii(this);
		}
	}
}