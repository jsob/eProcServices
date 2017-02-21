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

package tj.ocenka.uchastnikam.v.moment.vskrytija.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ocenka_uchastnikam_v_moment_vskrytija service. Represents a row in the &quot;sapp.ocenka_uchastnikam_v_moment_vskrytija&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ocenka_uchastnikam_v_moment_vskrytijaModel
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaImpl
 * @see tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaModelImpl
 * @generated
 */
@ImplementationClassName("tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaImpl")
@ProviderType
public interface ocenka_uchastnikam_v_moment_vskrytija
	extends ocenka_uchastnikam_v_moment_vskrytijaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.ocenka.uchastnikam.v.moment.vskrytija.model.impl.ocenka_uchastnikam_v_moment_vskrytijaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ocenka_uchastnikam_v_moment_vskrytija, Long> OCENKA_UCHASTNIKAM_V_MOMENT_VSKRYTIJA_ID_ACCESSOR =
		new Accessor<ocenka_uchastnikam_v_moment_vskrytija, Long>() {
			@Override
			public Long get(
				ocenka_uchastnikam_v_moment_vskrytija ocenka_uchastnikam_v_moment_vskrytija) {
				return ocenka_uchastnikam_v_moment_vskrytija.getOcenka_uchastnikam_v_moment_vskrytija_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ocenka_uchastnikam_v_moment_vskrytija> getTypeClass() {
				return ocenka_uchastnikam_v_moment_vskrytija.class;
			}
		};
}