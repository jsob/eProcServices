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

package tj.postavwiki.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the postavwiki service. Represents a row in the &quot;sapp.postavwiki&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see postavwikiModel
 * @see tj.postavwiki.model.impl.postavwikiImpl
 * @see tj.postavwiki.model.impl.postavwikiModelImpl
 * @generated
 */
@ImplementationClassName("tj.postavwiki.model.impl.postavwikiImpl")
@ProviderType
public interface postavwiki extends postavwikiModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tj.postavwiki.model.impl.postavwikiImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<postavwiki, Long> POSTAVWIKI_ID_ACCESSOR = new Accessor<postavwiki, Long>() {
			@Override
			public Long get(postavwiki postavwiki) {
				return postavwiki.getPostavwiki_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<postavwiki> getTypeClass() {
				return postavwiki.class;
			}
		};
}