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

package tj.edinicy.izmerenija.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.edinicy.izmerenija.model.edinicy_izmerenija;
import tj.edinicy.izmerenija.model.edinicy_izmerenijaModel;
import tj.edinicy.izmerenija.model.edinicy_izmerenijaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the edinicy_izmerenija service. Represents a row in the &quot;sapp.edinicy_izmerenija&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link edinicy_izmerenijaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link edinicy_izmerenijaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see edinicy_izmerenijaImpl
 * @see edinicy_izmerenija
 * @see edinicy_izmerenijaModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class edinicy_izmerenijaModelImpl extends BaseModelImpl<edinicy_izmerenija>
	implements edinicy_izmerenijaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a edinicy_izmerenija model instance should use the {@link edinicy_izmerenija} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.edinicy_izmerenija";
	public static final Object[][] TABLE_COLUMNS = {
			{ "edinicy_izmerenija_id", Types.BIGINT },
			{ "nazvanie", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("edinicy_izmerenija_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("nazvanie", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.edinicy_izmerenija (edinicy_izmerenija_id LONG not null primary key,nazvanie VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table sapp.edinicy_izmerenija";
	public static final String ORDER_BY_JPQL = " ORDER BY edinicy_izmerenija.edinicy_izmerenija_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.edinicy_izmerenija.edinicy_izmerenija_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.edinicy.izmerenija.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.edinicy.izmerenija.model.edinicy_izmerenija"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.edinicy.izmerenija.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.edinicy.izmerenija.model.edinicy_izmerenija"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static edinicy_izmerenija toModel(edinicy_izmerenijaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		edinicy_izmerenija model = new edinicy_izmerenijaImpl();

		model.setEdinicy_izmerenija_id(soapModel.getEdinicy_izmerenija_id());
		model.setNazvanie(soapModel.getNazvanie());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<edinicy_izmerenija> toModels(
		edinicy_izmerenijaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<edinicy_izmerenija> models = new ArrayList<edinicy_izmerenija>(soapModels.length);

		for (edinicy_izmerenijaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.edinicy.izmerenija.service.util.ServiceProps.get(
				"lock.expiration.time.tj.edinicy.izmerenija.model.edinicy_izmerenija"));

	public edinicy_izmerenijaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _edinicy_izmerenija_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEdinicy_izmerenija_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _edinicy_izmerenija_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return edinicy_izmerenija.class;
	}

	@Override
	public String getModelClassName() {
		return edinicy_izmerenija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("edinicy_izmerenija_id", getEdinicy_izmerenija_id());
		attributes.put("nazvanie", getNazvanie());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long edinicy_izmerenija_id = (Long)attributes.get(
				"edinicy_izmerenija_id");

		if (edinicy_izmerenija_id != null) {
			setEdinicy_izmerenija_id(edinicy_izmerenija_id);
		}

		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}
	}

	@JSON
	@Override
	public long getEdinicy_izmerenija_id() {
		return _edinicy_izmerenija_id;
	}

	@Override
	public void setEdinicy_izmerenija_id(long edinicy_izmerenija_id) {
		_edinicy_izmerenija_id = edinicy_izmerenija_id;
	}

	@JSON
	@Override
	public String getNazvanie() {
		if (_nazvanie == null) {
			return StringPool.BLANK;
		}
		else {
			return _nazvanie;
		}
	}

	@Override
	public void setNazvanie(String nazvanie) {
		_nazvanie = nazvanie;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			edinicy_izmerenija.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public edinicy_izmerenija toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (edinicy_izmerenija)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		edinicy_izmerenijaImpl edinicy_izmerenijaImpl = new edinicy_izmerenijaImpl();

		edinicy_izmerenijaImpl.setEdinicy_izmerenija_id(getEdinicy_izmerenija_id());
		edinicy_izmerenijaImpl.setNazvanie(getNazvanie());

		edinicy_izmerenijaImpl.resetOriginalValues();

		return edinicy_izmerenijaImpl;
	}

	@Override
	public int compareTo(edinicy_izmerenija edinicy_izmerenija) {
		long primaryKey = edinicy_izmerenija.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof edinicy_izmerenija)) {
			return false;
		}

		edinicy_izmerenija edinicy_izmerenija = (edinicy_izmerenija)obj;

		long primaryKey = edinicy_izmerenija.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<edinicy_izmerenija> toCacheModel() {
		edinicy_izmerenijaCacheModel edinicy_izmerenijaCacheModel = new edinicy_izmerenijaCacheModel();

		edinicy_izmerenijaCacheModel.edinicy_izmerenija_id = getEdinicy_izmerenija_id();

		edinicy_izmerenijaCacheModel.nazvanie = getNazvanie();

		String nazvanie = edinicy_izmerenijaCacheModel.nazvanie;

		if ((nazvanie != null) && (nazvanie.length() == 0)) {
			edinicy_izmerenijaCacheModel.nazvanie = null;
		}

		return edinicy_izmerenijaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{edinicy_izmerenija_id=");
		sb.append(getEdinicy_izmerenija_id());
		sb.append(", nazvanie=");
		sb.append(getNazvanie());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("tj.edinicy.izmerenija.model.edinicy_izmerenija");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>edinicy_izmerenija_id</column-name><column-value><![CDATA[");
		sb.append(getEdinicy_izmerenija_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nazvanie</column-name><column-value><![CDATA[");
		sb.append(getNazvanie());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = edinicy_izmerenija.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			edinicy_izmerenija.class
		};
	private long _edinicy_izmerenija_id;
	private String _nazvanie;
	private edinicy_izmerenija _escapedModel;
}