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

package tj.godovoj.plan.zakupok.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the godovoj_plan_zakupok service. Represents a row in the &quot;sapp.godovoj_plan_zakupok&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see godovoj_plan_zakupokModel
 * @see tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokImpl
 * @see tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokModelImpl
 * @generated
 */
@ImplementationClassName("tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokImpl")
@ProviderType
public interface godovoj_plan_zakupok extends godovoj_plan_zakupokModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.godovoj.plan.zakupok.model.impl.godovoj_plan_zakupokImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<godovoj_plan_zakupok, Long> GODOVOJ_PLAN_ZAKUPOK_ID_ACCESSOR =
		new Accessor<godovoj_plan_zakupok, Long>() {
			@Override
			public Long get(godovoj_plan_zakupok godovoj_plan_zakupok) {
				return godovoj_plan_zakupok.getGodovoj_plan_zakupok_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<godovoj_plan_zakupok> getTypeClass() {
				return godovoj_plan_zakupok.class;
			}
		};
}