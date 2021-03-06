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

package tj.dostup.po.podrazdelenijam.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the dostup_po_podrazdelenijam service. Represents a row in the &quot;sapp.dostup_po_podrazdelenijam&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see dostup_po_podrazdelenijam
 * @see tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamImpl
 * @see tj.dostup.po.podrazdelenijam.model.impl.dostup_po_podrazdelenijamModelImpl
 * @generated
 */
@ProviderType
public interface dostup_po_podrazdelenijamModel extends BaseModel<dostup_po_podrazdelenijam> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dostup_po_podrazdelenijam model instance should use the {@link dostup_po_podrazdelenijam} interface instead.
	 */

	/**
	 * Returns the primary key of this dostup_po_podrazdelenijam.
	 *
	 * @return the primary key of this dostup_po_podrazdelenijam
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dostup_po_podrazdelenijam.
	 *
	 * @param primaryKey the primary key of this dostup_po_podrazdelenijam
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the data_izmenenija of this dostup_po_podrazdelenijam.
	 *
	 * @return the data_izmenenija of this dostup_po_podrazdelenijam
	 */
	public Date getData_izmenenija();

	/**
	 * Sets the data_izmenenija of this dostup_po_podrazdelenijam.
	 *
	 * @param data_izmenenija the data_izmenenija of this dostup_po_podrazdelenijam
	 */
	public void setData_izmenenija(Date data_izmenenija);

	/**
	 * Returns the data_sozdanija of this dostup_po_podrazdelenijam.
	 *
	 * @return the data_sozdanija of this dostup_po_podrazdelenijam
	 */
	public Date getData_sozdanija();

	/**
	 * Sets the data_sozdanija of this dostup_po_podrazdelenijam.
	 *
	 * @param data_sozdanija the data_sozdanija of this dostup_po_podrazdelenijam
	 */
	public void setData_sozdanija(Date data_sozdanija);

	/**
	 * Returns the dostup_po_podrazdelenijam_id of this dostup_po_podrazdelenijam.
	 *
	 * @return the dostup_po_podrazdelenijam_id of this dostup_po_podrazdelenijam
	 */
	public long getDostup_po_podrazdelenijam_id();

	/**
	 * Sets the dostup_po_podrazdelenijam_id of this dostup_po_podrazdelenijam.
	 *
	 * @param dostup_po_podrazdelenijam_id the dostup_po_podrazdelenijam_id of this dostup_po_podrazdelenijam
	 */
	public void setDostup_po_podrazdelenijam_id(
		long dostup_po_podrazdelenijam_id);

	/**
	 * Returns the izmenil of this dostup_po_podrazdelenijam.
	 *
	 * @return the izmenil of this dostup_po_podrazdelenijam
	 */
	public long getIzmenil();

	/**
	 * Sets the izmenil of this dostup_po_podrazdelenijam.
	 *
	 * @param izmenil the izmenil of this dostup_po_podrazdelenijam
	 */
	public void setIzmenil(long izmenil);

	/**
	 * Returns the podrazdelenija_id of this dostup_po_podrazdelenijam.
	 *
	 * @return the podrazdelenija_id of this dostup_po_podrazdelenijam
	 */
	public long getPodrazdelenija_id();

	/**
	 * Sets the podrazdelenija_id of this dostup_po_podrazdelenijam.
	 *
	 * @param podrazdelenija_id the podrazdelenija_id of this dostup_po_podrazdelenijam
	 */
	public void setPodrazdelenija_id(long podrazdelenija_id);

	/**
	 * Returns the polzovateli_id of this dostup_po_podrazdelenijam.
	 *
	 * @return the polzovateli_id of this dostup_po_podrazdelenijam
	 */
	public long getPolzovateli_id();

	/**
	 * Sets the polzovateli_id of this dostup_po_podrazdelenijam.
	 *
	 * @param polzovateli_id the polzovateli_id of this dostup_po_podrazdelenijam
	 */
	public void setPolzovateli_id(long polzovateli_id);

	/**
	 * Returns the sozdal of this dostup_po_podrazdelenijam.
	 *
	 * @return the sozdal of this dostup_po_podrazdelenijam
	 */
	public long getSozdal();

	/**
	 * Sets the sozdal of this dostup_po_podrazdelenijam.
	 *
	 * @param sozdal the sozdal of this dostup_po_podrazdelenijam
	 */
	public void setSozdal(long sozdal);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam dostup_po_podrazdelenijam);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam> toCacheModel();

	@Override
	public tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam toEscapedModel();

	@Override
	public tj.dostup.po.podrazdelenijam.model.dostup_po_podrazdelenijam toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}