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

package tj.istorija.popolnenij.model;

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
 * This class is a wrapper for {@link istorija_popolnenij}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see istorija_popolnenij
 * @generated
 */
@ProviderType
public class istorija_popolnenijWrapper implements istorija_popolnenij,
	ModelWrapper<istorija_popolnenij> {
	public istorija_popolnenijWrapper(istorija_popolnenij istorija_popolnenij) {
		_istorija_popolnenij = istorija_popolnenij;
	}

	@Override
	public Class<?> getModelClass() {
		return istorija_popolnenij.class;
	}

	@Override
	public String getModelClassName() {
		return istorija_popolnenij.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_zachislenija", getData_zachislenija());
		attributes.put("istorija_popolnenij_id", getIstorija_popolnenij_id());
		attributes.put("nomer", getNomer());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("put", getPut());
		attributes.put("summa", getSumma());
		attributes.put("tip", getTip());
		attributes.put("tranzakcija", getTranzakcija());
		attributes.put("zachislil", getZachislil());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_zachislenija = (Date)attributes.get("data_zachislenija");

		if (data_zachislenija != null) {
			setData_zachislenija(data_zachislenija);
		}

		Long istorija_popolnenij_id = (Long)attributes.get(
				"istorija_popolnenij_id");

		if (istorija_popolnenij_id != null) {
			setIstorija_popolnenij_id(istorija_popolnenij_id);
		}

		String nomer = (String)attributes.get("nomer");

		if (nomer != null) {
			setNomer(nomer);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		String put = (String)attributes.get("put");

		if (put != null) {
			setPut(put);
		}

		Double summa = (Double)attributes.get("summa");

		if (summa != null) {
			setSumma(summa);
		}

		String tip = (String)attributes.get("tip");

		if (tip != null) {
			setTip(tip);
		}

		String tranzakcija = (String)attributes.get("tranzakcija");

		if (tranzakcija != null) {
			setTranzakcija(tranzakcija);
		}

		Long zachislil = (Long)attributes.get("zachislil");

		if (zachislil != null) {
			setZachislil(zachislil);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _istorija_popolnenij.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _istorija_popolnenij.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _istorija_popolnenij.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _istorija_popolnenij.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<tj.istorija.popolnenij.model.istorija_popolnenij> toCacheModel() {
		return _istorija_popolnenij.toCacheModel();
	}

	/**
	* Returns the summa of this istorija_popolnenij.
	*
	* @return the summa of this istorija_popolnenij
	*/
	@Override
	public double getSumma() {
		return _istorija_popolnenij.getSumma();
	}

	@Override
	public int compareTo(
		tj.istorija.popolnenij.model.istorija_popolnenij istorija_popolnenij) {
		return _istorija_popolnenij.compareTo(istorija_popolnenij);
	}

	@Override
	public int hashCode() {
		return _istorija_popolnenij.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _istorija_popolnenij.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new istorija_popolnenijWrapper((istorija_popolnenij)_istorija_popolnenij.clone());
	}

	/**
	* Returns the nomer of this istorija_popolnenij.
	*
	* @return the nomer of this istorija_popolnenij
	*/
	@Override
	public java.lang.String getNomer() {
		return _istorija_popolnenij.getNomer();
	}

	/**
	* Returns the put of this istorija_popolnenij.
	*
	* @return the put of this istorija_popolnenij
	*/
	@Override
	public java.lang.String getPut() {
		return _istorija_popolnenij.getPut();
	}

	/**
	* Returns the tip of this istorija_popolnenij.
	*
	* @return the tip of this istorija_popolnenij
	*/
	@Override
	public java.lang.String getTip() {
		return _istorija_popolnenij.getTip();
	}

	/**
	* Returns the tranzakcija of this istorija_popolnenij.
	*
	* @return the tranzakcija of this istorija_popolnenij
	*/
	@Override
	public java.lang.String getTranzakcija() {
		return _istorija_popolnenij.getTranzakcija();
	}

	@Override
	public java.lang.String toString() {
		return _istorija_popolnenij.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _istorija_popolnenij.toXmlString();
	}

	/**
	* Returns the data_zachislenija of this istorija_popolnenij.
	*
	* @return the data_zachislenija of this istorija_popolnenij
	*/
	@Override
	public Date getData_zachislenija() {
		return _istorija_popolnenij.getData_zachislenija();
	}

	/**
	* Returns the istorija_popolnenij_id of this istorija_popolnenij.
	*
	* @return the istorija_popolnenij_id of this istorija_popolnenij
	*/
	@Override
	public long getIstorija_popolnenij_id() {
		return _istorija_popolnenij.getIstorija_popolnenij_id();
	}

	/**
	* Returns the postavwik_id of this istorija_popolnenij.
	*
	* @return the postavwik_id of this istorija_popolnenij
	*/
	@Override
	public long getPostavwik_id() {
		return _istorija_popolnenij.getPostavwik_id();
	}

	/**
	* Returns the primary key of this istorija_popolnenij.
	*
	* @return the primary key of this istorija_popolnenij
	*/
	@Override
	public long getPrimaryKey() {
		return _istorija_popolnenij.getPrimaryKey();
	}

	/**
	* Returns the zachislil of this istorija_popolnenij.
	*
	* @return the zachislil of this istorija_popolnenij
	*/
	@Override
	public long getZachislil() {
		return _istorija_popolnenij.getZachislil();
	}

	@Override
	public tj.istorija.popolnenij.model.istorija_popolnenij toEscapedModel() {
		return new istorija_popolnenijWrapper(_istorija_popolnenij.toEscapedModel());
	}

	@Override
	public tj.istorija.popolnenij.model.istorija_popolnenij toUnescapedModel() {
		return new istorija_popolnenijWrapper(_istorija_popolnenij.toUnescapedModel());
	}

	@Override
	public void persist() {
		_istorija_popolnenij.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_istorija_popolnenij.setCachedModel(cachedModel);
	}

	/**
	* Sets the data_zachislenija of this istorija_popolnenij.
	*
	* @param data_zachislenija the data_zachislenija of this istorija_popolnenij
	*/
	@Override
	public void setData_zachislenija(Date data_zachislenija) {
		_istorija_popolnenij.setData_zachislenija(data_zachislenija);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_istorija_popolnenij.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_istorija_popolnenij.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_istorija_popolnenij.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the istorija_popolnenij_id of this istorija_popolnenij.
	*
	* @param istorija_popolnenij_id the istorija_popolnenij_id of this istorija_popolnenij
	*/
	@Override
	public void setIstorija_popolnenij_id(long istorija_popolnenij_id) {
		_istorija_popolnenij.setIstorija_popolnenij_id(istorija_popolnenij_id);
	}

	@Override
	public void setNew(boolean n) {
		_istorija_popolnenij.setNew(n);
	}

	/**
	* Sets the nomer of this istorija_popolnenij.
	*
	* @param nomer the nomer of this istorija_popolnenij
	*/
	@Override
	public void setNomer(java.lang.String nomer) {
		_istorija_popolnenij.setNomer(nomer);
	}

	/**
	* Sets the postavwik_id of this istorija_popolnenij.
	*
	* @param postavwik_id the postavwik_id of this istorija_popolnenij
	*/
	@Override
	public void setPostavwik_id(long postavwik_id) {
		_istorija_popolnenij.setPostavwik_id(postavwik_id);
	}

	/**
	* Sets the primary key of this istorija_popolnenij.
	*
	* @param primaryKey the primary key of this istorija_popolnenij
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_istorija_popolnenij.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_istorija_popolnenij.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the put of this istorija_popolnenij.
	*
	* @param put the put of this istorija_popolnenij
	*/
	@Override
	public void setPut(java.lang.String put) {
		_istorija_popolnenij.setPut(put);
	}

	/**
	* Sets the summa of this istorija_popolnenij.
	*
	* @param summa the summa of this istorija_popolnenij
	*/
	@Override
	public void setSumma(double summa) {
		_istorija_popolnenij.setSumma(summa);
	}

	/**
	* Sets the tip of this istorija_popolnenij.
	*
	* @param tip the tip of this istorija_popolnenij
	*/
	@Override
	public void setTip(java.lang.String tip) {
		_istorija_popolnenij.setTip(tip);
	}

	/**
	* Sets the tranzakcija of this istorija_popolnenij.
	*
	* @param tranzakcija the tranzakcija of this istorija_popolnenij
	*/
	@Override
	public void setTranzakcija(java.lang.String tranzakcija) {
		_istorija_popolnenij.setTranzakcija(tranzakcija);
	}

	/**
	* Sets the zachislil of this istorija_popolnenij.
	*
	* @param zachislil the zachislil of this istorija_popolnenij
	*/
	@Override
	public void setZachislil(long zachislil) {
		_istorija_popolnenij.setZachislil(zachislil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof istorija_popolnenijWrapper)) {
			return false;
		}

		istorija_popolnenijWrapper istorija_popolnenijWrapper = (istorija_popolnenijWrapper)obj;

		if (Objects.equals(_istorija_popolnenij,
					istorija_popolnenijWrapper._istorija_popolnenij)) {
			return true;
		}

		return false;
	}

	@Override
	public istorija_popolnenij getWrappedModel() {
		return _istorija_popolnenij;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _istorija_popolnenij.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _istorija_popolnenij.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_istorija_popolnenij.resetOriginalValues();
	}

	private final istorija_popolnenij _istorija_popolnenij;
}