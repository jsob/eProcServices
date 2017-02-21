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

package tj.oplachennye.zakazy.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link oplachennye_zakazy}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see oplachennye_zakazy
 * @generated
 */
@ProviderType
public class oplachennye_zakazyWrapper implements oplachennye_zakazy,
	ModelWrapper<oplachennye_zakazy> {
	public oplachennye_zakazyWrapper(oplachennye_zakazy oplachennye_zakazy) {
		_oplachennye_zakazy = oplachennye_zakazy;
	}

	@Override
	public Class<?> getModelClass() {
		return oplachennye_zakazy.class;
	}

	@Override
	public String getModelClassName() {
		return oplachennye_zakazy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_oplaty", getData_oplaty());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("oplachennye_zakazy_id", getOplachennye_zakazy_id());
		attributes.put("oplatil", getOplatil());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("summa", getSumma());
		attributes.put("tranzakcija", getTranzakcija());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_oplaty = (Date)attributes.get("data_oplaty");

		if (data_oplaty != null) {
			setData_oplaty(data_oplaty);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long oplachennye_zakazy_id = (Long)attributes.get(
				"oplachennye_zakazy_id");

		if (oplachennye_zakazy_id != null) {
			setOplachennye_zakazy_id(oplachennye_zakazy_id);
		}

		Long oplatil = (Long)attributes.get("oplatil");

		if (oplatil != null) {
			setOplatil(oplatil);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Double summa = (Double)attributes.get("summa");

		if (summa != null) {
			setSumma(summa);
		}

		String tranzakcija = (String)attributes.get("tranzakcija");

		if (tranzakcija != null) {
			setTranzakcija(tranzakcija);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _oplachennye_zakazy.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _oplachennye_zakazy.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _oplachennye_zakazy.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _oplachennye_zakazy.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.oplachennye.zakazy.model.oplachennye_zakazy> toCacheModel() {
		return _oplachennye_zakazy.toCacheModel();
	}

	/**
	* Returns the summa of this oplachennye_zakazy.
	*
	* @return the summa of this oplachennye_zakazy
	*/
	@Override
	public double getSumma() {
		return _oplachennye_zakazy.getSumma();
	}

	@Override
	public int compareTo(
		tj.oplachennye.zakazy.model.oplachennye_zakazy oplachennye_zakazy) {
		return _oplachennye_zakazy.compareTo(oplachennye_zakazy);
	}

	@Override
	public int hashCode() {
		return _oplachennye_zakazy.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _oplachennye_zakazy.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new oplachennye_zakazyWrapper((oplachennye_zakazy)_oplachennye_zakazy.clone());
	}

	/**
	* Returns the tranzakcija of this oplachennye_zakazy.
	*
	* @return the tranzakcija of this oplachennye_zakazy
	*/
	@Override
	public java.lang.String getTranzakcija() {
		return _oplachennye_zakazy.getTranzakcija();
	}

	@Override
	public java.lang.String toString() {
		return _oplachennye_zakazy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oplachennye_zakazy.toXmlString();
	}

	/**
	* Returns the data_oplaty of this oplachennye_zakazy.
	*
	* @return the data_oplaty of this oplachennye_zakazy
	*/
	@Override
	public Date getData_oplaty() {
		return _oplachennye_zakazy.getData_oplaty();
	}

	/**
	* Returns the izvewenie_id of this oplachennye_zakazy.
	*
	* @return the izvewenie_id of this oplachennye_zakazy
	*/
	@Override
	public long getIzvewenie_id() {
		return _oplachennye_zakazy.getIzvewenie_id();
	}

	/**
	* Returns the oplachennye_zakazy_id of this oplachennye_zakazy.
	*
	* @return the oplachennye_zakazy_id of this oplachennye_zakazy
	*/
	@Override
	public long getOplachennye_zakazy_id() {
		return _oplachennye_zakazy.getOplachennye_zakazy_id();
	}

	/**
	* Returns the oplatil of this oplachennye_zakazy.
	*
	* @return the oplatil of this oplachennye_zakazy
	*/
	@Override
	public long getOplatil() {
		return _oplachennye_zakazy.getOplatil();
	}

	/**
	* Returns the postavwik_id of this oplachennye_zakazy.
	*
	* @return the postavwik_id of this oplachennye_zakazy
	*/
	@Override
	public long getPostavwik_id() {
		return _oplachennye_zakazy.getPostavwik_id();
	}

	/**
	* Returns the primary key of this oplachennye_zakazy.
	*
	* @return the primary key of this oplachennye_zakazy
	*/
	@Override
	public long getPrimaryKey() {
		return _oplachennye_zakazy.getPrimaryKey();
	}

	@Override
	public tj.oplachennye.zakazy.model.oplachennye_zakazy toEscapedModel() {
		return new oplachennye_zakazyWrapper(_oplachennye_zakazy.toEscapedModel());
	}

	@Override
	public tj.oplachennye.zakazy.model.oplachennye_zakazy toUnescapedModel() {
		return new oplachennye_zakazyWrapper(_oplachennye_zakazy.toUnescapedModel());
	}

	@Override
	public void persist() {
		_oplachennye_zakazy.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oplachennye_zakazy.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_oplaty of this oplachennye_zakazy.
	*
	* @param data_oplaty the data_oplaty of this oplachennye_zakazy
	*/
	@Override
	public void setData_oplaty(Date data_oplaty) {
		_oplachennye_zakazy.setData_oplaty(data_oplaty);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_oplachennye_zakazy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_oplachennye_zakazy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_oplachennye_zakazy.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the izvewenie_id of this oplachennye_zakazy.
	*
	* @param izvewenie_id the izvewenie_id of this oplachennye_zakazy
	*/
	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_oplachennye_zakazy.setIzvewenie_id(izvewenie_id);
	}

	@Override
	public void setNew(boolean n) {
		_oplachennye_zakazy.setNew(n);
	}

	/**
	* Sets the oplachennye_zakazy_id of this oplachennye_zakazy.
	*
	* @param oplachennye_zakazy_id the oplachennye_zakazy_id of this oplachennye_zakazy
	*/
	@Override
	public void setOplachennye_zakazy_id(long oplachennye_zakazy_id) {
		_oplachennye_zakazy.setOplachennye_zakazy_id(oplachennye_zakazy_id);
	}

	/**
	* Sets the oplatil of this oplachennye_zakazy.
	*
	* @param oplatil the oplatil of this oplachennye_zakazy
	*/
	@Override
	public void setOplatil(long oplatil) {
		_oplachennye_zakazy.setOplatil(oplatil);
	}

	/**
	* Sets the postavwik_id of this oplachennye_zakazy.
	*
	* @param postavwik_id the postavwik_id of this oplachennye_zakazy
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_oplachennye_zakazy.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this oplachennye_zakazy.
	*
	* @param primaryKey the primary key of this oplachennye_zakazy
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oplachennye_zakazy.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_oplachennye_zakazy.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the summa of this oplachennye_zakazy.
	*
	* @param summa the summa of this oplachennye_zakazy
	*/
	@Override
	public void setSumma(double summa) {
		_oplachennye_zakazy.setSumma(summa);
	}

	/**
	* Sets the tranzakcija of this oplachennye_zakazy.
	*
	* @param tranzakcija the tranzakcija of this oplachennye_zakazy
	*/
	@Override
	public void setTranzakcija(java.lang.String tranzakcija) {
		_oplachennye_zakazy.setTranzakcija(tranzakcija);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof oplachennye_zakazyWrapper)) {
			return false;
		}

		oplachennye_zakazyWrapper oplachennye_zakazyWrapper = (oplachennye_zakazyWrapper)obj;

		if (Objects.equals(_oplachennye_zakazy,
					oplachennye_zakazyWrapper._oplachennye_zakazy)) {
			return true;
		}

		return false;
	}

	@Override
	public oplachennye_zakazy getWrappedModel() {
		return _oplachennye_zakazy;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _oplachennye_zakazy.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _oplachennye_zakazy.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_oplachennye_zakazy.resetOriginalValues();
	}

	private final oplachennye_zakazy _oplachennye_zakazy;
}